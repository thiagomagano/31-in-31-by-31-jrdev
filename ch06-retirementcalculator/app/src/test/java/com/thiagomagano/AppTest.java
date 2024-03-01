package com.thiagomagano;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    RetirementCalculator calc = new RetirementCalculator(25, 65);

    @Test
    void yearsUntilRetirementTest() {

        assertEquals(40, calc.getYearsUntilRetirement(), "It should show how many years are left until retirement");

        assertEquals(30, RetirementCalculator.getYearsUntilRetirement(30, 60),
                "It should show how many years are left until retirement with static method");
    }

    @Test
    void showYearOfRetirement() {

        int want = 2064;
        int got = calc.getYearOfRetirementFromNow();

        assertEquals(want, got, "");

    }

    @Test
    void printingTest() {
        String want = "You have 40 years left until you can retire. It's 2024, so you can retire in 2064.";
        String got = calc.printRetirementMessage();

        assertEquals(want, got);
    }
}
