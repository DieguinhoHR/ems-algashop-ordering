package com.algaworks.algashop.ordering.domain.valueobject;

import com.algaworks.algashop.ordering.domain.exception.ErrorMessages;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public record BirthDate(LocalDate value) {

    public BirthDate {
        Objects.requireNonNull(value);
        if (value.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(ErrorMessages.VALIDATION_ERROR_BIRTHDATE_MUST_IN_PAST);
        }
    }

    public Integer age(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
