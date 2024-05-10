package com.scaler.productserviceapi.inheritancedmo.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc-it")
public class Instructor extends User {
private String specialization;

}
