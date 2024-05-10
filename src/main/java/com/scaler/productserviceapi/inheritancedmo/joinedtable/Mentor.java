package com.scaler.productserviceapi.inheritancedmo.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="jt-mentor")
public class Mentor extends User {
    private String companyName;
    private double avgRating;
}
