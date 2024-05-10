package com.scaler.productserviceapi.inheritancedmo.singletable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.INTEGER)
@Entity(name = "st-users")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
