package ua.com.zinchenko.carzar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "photos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

    @Id
    @Column(name = "photo_id")
    private Integer id;

    @Column(name = "photo_name")
    private String photoName;

    @ManyToOne
    @JoinColumn(name = "advertisement_id")
    private Advertisement advertisement;
}
