public class SearchOfProcentage {
    public void requiredPercentageMethod(int startOfLife) {
        CalculationOfRates calculationOfRates = new CalculationOfRates();
        if (startOfLife < 2002 || startOfLife > 2021) {
            throw new IllegalArgumentException("Введен неподходящий год.");
        }
        int sumOfYears = 2022 - startOfLife;
        double percentage = 100.0;
        double YearlyNeeds;
        int capital;
        boolean flag = true;
        int counter;
        while (flag) {
            counter = startOfLife - 2000 - 2;
            YearlyNeeds = 1800000;
            capital = (int) (YearlyNeeds / (percentage / 100));
            for (int j = sumOfYears; j > 0; j--) {
                if (counter != 0) {
                    YearlyNeeds = YearlyNeeds + (YearlyNeeds * (calculationOfRates.CalculationsOfInflation(counter) / 100));
                    capital = (int) (capital - YearlyNeeds);
                    if (capital <= 0) {
                        break;
                    }
                    capital = (int) (capital * calculationOfRates.calculationOfMOEX(counter));
                    if (capital <= 0) {
                        break;
                    }
                    counter++;
                } else {
                    capital = (int) (capital - YearlyNeeds);
                    counter++;
                }
            }
            if (capital > 0) {
                flag = false;
            }
            percentage -= 0.1;
        }
        System.out.println(Math.ceil(percentage * 2) / 2);
    }
}