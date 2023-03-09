package bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BmiTest {
    @Test
    void calculateForNormal(){
        double heightInCentimeters = 1.79;
        double weightInKilograms = 65;

        double Bmi_Result = Bmi.calculateBmi(heightInCentimeters, weightInKilograms);
        Bmi.BMIState Bmi_Status = Bmi.classifyBmi(Bmi_Result);
        assertEquals(Bmi_Status, Bmi.BMIState.NORMAL);
    }
}