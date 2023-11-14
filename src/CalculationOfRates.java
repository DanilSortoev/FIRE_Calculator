public class CalculationOfRates {
    public double calculationOfMOEX(int counter) {
        return (Constants.MOEX_RATE[counter] / Constants.MOEX_RATE[counter - 1]);
    }

    public double CalculationsOfInflation(int counter) {
        return (Constants.INFLATION_RATE[counter - 1]);
    }
}