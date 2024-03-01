package com.thiagomagano;

import java.time.*;

public class RetirementCalculator {
    int age;
    int retirementAge;
    int yearsUntilRetirement;
    int retirementYear;
    int actualYear;

    boolean isRetireAge;

    public RetirementCalculator(int age, int retirementAge) {
        this.age = age;
        this.retirementAge = retirementAge;

        this.yearsUntilRetirement = getYearsUntilRetirement();

        if (this.yearsUntilRetirement <= 0) {
            this.isRetireAge = true;
        } else {
            this.isRetireAge = false;
        }

        LocalDate today = LocalDate.now();

        this.actualYear = today.getYear();
        this.retirementYear = getYearOfRetirementFromNow();

    }

    public int getYearsUntilRetirement() {
        return this.retirementAge - this.age;
    }

    public static int getYearsUntilRetirement(int age, int retirementAge) {
        return retirementAge - age;
    }

    public int getYearOfRetirementFromNow() {
        LocalDate today = LocalDate.now();

        int yearsUntilRetirement = this.getYearsUntilRetirement();
        int retirementYear = today.plusYears(yearsUntilRetirement).getYear();

        return retirementYear;
    }

    public String printRetirementMessage() {
        if (this.isRetireAge) {
            return "You can already Retire!";
        }
        String str = "You have " + yearsUntilRetirement + " years left until you can retire. It's " + actualYear
                + ", so you can retire in " + retirementYear + ".";

        return str;
    }
}