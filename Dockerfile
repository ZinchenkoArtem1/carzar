FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /workdir/server
COPY pom.xml /workdir/server/pom.xml
RUN mvn dependency:go-offline

COPY src /workdir/server/src
RUN mvn install
RUN mkdir  -p target/depency
WORKDIR /workdir/server/target/dependency
RUN jar -xf ../*.jar

FROM openjdk:17-alpine

EXPOSE 8080
VOLUME /tmp
ARG DEPENDENCY=/workdir/server/target/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","ua.com.zinchenko.carzar.CarzarApplication"]
