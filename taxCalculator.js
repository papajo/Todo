public class TaxCalculator {
    
    public int getTaxAmount(int salary, int taxPercentage) {
        if (salary < 0 || taxPercentage < 0 || taxPercentage > 100) {
            throw new IllegalArgumentException();
        }
        return salary * taxPercentage / 100;
    }
}