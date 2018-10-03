import org.junit.Test;
import org.junit.Assert;
 
public class Evaluate {
    
    TaxCalculator calculator = new TaxCalculator();
    
    @Test
    public void testGetTaxAmount() {
        Assert.assertEquals("Fails for [100, 38]", 38, 
            calculator.getTaxAmount(100, 38));
        Assert.assertEquals("Fails for [130000, 36]", 46800, 
            calculator.getTaxAmount(130000, 36));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSalary() {
        calculator.getTaxAmount(-10, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeTaxPercentage() {
        calculator.getTaxAmount(10000, -10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testLargePercentage() {
        calculator.getTaxAmount(1000, 101);
    }
}