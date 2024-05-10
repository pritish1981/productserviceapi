package com.scaler.productserviceapi.inheritancedmo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mps-it")
public class Instructor extends User{
private String specialization;

}
