package com.scaler.productserviceapi.inheritancedmo.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="tpc-mentor")
public class Mentor extends User {
    private String companyName;
    private double avgRating;
}
