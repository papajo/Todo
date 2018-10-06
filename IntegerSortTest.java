import org.junit.Test;
import org.junit.Assert;
import com.udemy.ucp.*;
 
public class Evaluate {
    Sorter sorter = new Sorter();
    IOHelper helper = new IOHelper();
 
    @Test
    public void testSort() {
        // Set inputs that will be entered in stdin
        this.helper.setStdInput("1 3 2 6 5 5 4 5 6 3 10 2");
        
        // Clear the outputs written until now
        this.helper.resetStdOut();
        
        // Call student's function
        sorter.sort();
        String output = this.helper.getOutput();
        
        Assert.assertEquals("Couldn't sort for this input [1 3 2 6 5 5 4 5 6 3 10 2].", 
            "1 2 2 3 3 4 5 5 5 6 6 10", output);
    }
    
    @Test
    public void testSortBiggerInput() {
        // Set inputs that will be entered in stdin
        this.helper.setStdInput("1 356 133 452 3363 986 501 4345 3135 1236 3323 100 12 3 6 32 435 897 32234 564");
        
        // Clear the outputs written until now
        this.helper.resetStdOut();
        
        // Call student's function
        sorter.sort();
        String output = this.helper.getOutput();
        
        Assert.assertEquals(
            "Couldn't sort for this input [1 356 133 452 3363 986 501 4345 3135 1236 3323 100 12 3 6 32 435 897 32234 564].", 
            "1 3 6 12 32 100 133 356 435 452 501 564 897 986 1236 3135 3323 3363 4345 32234", 
            output);
    }
}