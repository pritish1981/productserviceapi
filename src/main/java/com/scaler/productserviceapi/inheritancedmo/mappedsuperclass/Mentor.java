package com.scaler.productserviceapi.inheritancedmo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="mps-mentor")
public class Mentor extends User{
    private String companyName;
    private double avgRating;
}
