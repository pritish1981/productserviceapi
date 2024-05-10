package com.scaler.productserviceapi.inheritancedmo.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt-it")
public class Instructor extends User {
private String specialization;

}
