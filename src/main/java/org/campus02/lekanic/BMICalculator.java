package org.campus02.lekanic;

public class BMICalculator {

    private double weightInKG;
    private double heightInM;

    public BMICalculator(double weightInKG, double heightInM) {
        this.weightInKG = weightInKG;
        this.heightInM = heightInM;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public double getHeightInM() {
        return heightInM;
    }

    private double calcBMI(){
        return weightInKG / (heightInM * heightInM);
    }

    /**
     * Grenzen
     * < 18.5 = underweight
     * 18.5 - 25 = normal
     * 25 - 30 = overweight
     * > 30 = obese
     *
     * @return classification
     */
    public String result(){
        double bmi = calcBMI();

        if (bmi < 18.5)
            return "underweight";
        else if (bmi < 25)
            return "normal";
        else if (bmi < 30)
            return "overweight";
        else
            return "obese";
    }
}
