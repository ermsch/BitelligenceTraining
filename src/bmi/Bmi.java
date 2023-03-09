package bmi;

public class Bmi {
    public BMIState status = BMIState.NORMAL;
    enum BMIState {
        UNDERWEIGHT, NORMAL, OVERWEIGHT, OBESE
    }

    public static double calculateBmi(double heightInCentimeters, double weightInKilograms) {
        double bmi = weightInKilograms / ((heightInCentimeters/100) * heightInCentimeters/100);
        return bmi;
    }

    public static BMIState classifyBmi(double bmi) {

        Bmi level = new Bmi();

        if (bmi < 18.5) {
            level.status = BMIState.UNDERWEIGHT;
        } else if (bmi < 25) {
            level.status = BMIState.NORMAL;
        } else if (bmi < 30) {
            level.status = BMIState.OVERWEIGHT;
        } else level.status = BMIState.OBESE;

        return level.status;
    }

    public static void main(String[] args) {
        //System.out.println(calculateBmi(1.86, 105));
        System.out.println(classifyBmi(calculateBmi(186, 105)));
    }

}
