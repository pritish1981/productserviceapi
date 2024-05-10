package com.scaler.productserviceapi.inheritancedmo.joinedtable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt-users")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
