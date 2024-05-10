package com.scaler.productserviceapi.inheritancedmo.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st-it")
public class Instructor extends User {
private String specialization;

}
