package com.algaworks.algashop.ordering.domain.valueobject;

import com.algaworks.algashop.ordering.domain.validator.FieldValidations;

import static com.algaworks.algashop.ordering.domain.exception.ErrorMessages.VALIDATION_ERROR_EMAIL_IS_INVALID;

public record Email(String value) {

    public Email {
        FieldValidations.requiresValidEmail(value, VALIDATION_ERROR_EMAIL_IS_INVALID);
    }

    @Override
    public String toString() {
        return value;
    }
}
