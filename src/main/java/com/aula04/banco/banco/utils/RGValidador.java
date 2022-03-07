package com.aula04.banco.banco.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RGValidador implements ConstraintValidator<RG, String> {

    @Override
    public void initialize(RG constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String rg, ConstraintValidatorContext context) {
        String rgSomenteDigitos = rg.replaceAll("\\D", "");

        if(rgSomenteDigitos == null ||
                rgSomenteDigitos.length() != 10 ||
                rgSomenteDigitos.equals("00000000000") ||
                rgSomenteDigitos.equals("11111111111")){return  false;}
        return true;
    }
}
