package com.scaler.productserviceapi.inheritancedmo.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="st-mentor")
public class Mentor extends User {
    private String companyName;
    private double avgRating;
}
