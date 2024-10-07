package com.udea.Lab02Reglas.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Rate {
    private String loanStatus;
    private double loanRate;
}
