package ua.com.zinchenko.carzar.api.mapper;

import ua.com.zinchenko.carzar.api.dto.UserDto;
import ua.com.zinchenko.carzar.model.User;

public class UserMapper {

    public static UserDto modelToDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getSecondName(),
                user.getPhoneNumber(),
                user.getUserEmail()
        );
    }
}
