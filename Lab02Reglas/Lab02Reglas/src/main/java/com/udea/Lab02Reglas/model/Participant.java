package com.udea.Lab02Reglas.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Participant {
    private String name;
    private int age;
    private int creditScore;
    private long annualSalary;
    private long existingDeb;
    private long loanAmount;

}
