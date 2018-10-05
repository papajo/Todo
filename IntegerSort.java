
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
public class IntegerSort {
    
    public void sort() {
        // Get the integers from user
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> integers = new ArrayList<>();
        
        while(scanner.hasNext()) {
            integers.add(Integer.valueOf(scanner.next()));
        }
        
        // Sort integers
        Collections.sort(integers);
        
        // Print sorted integers
        String integersStr = integers.toString(); // This returns comma separated list e.g. [1, 2, 3]
        // Remove unnecessary characters and print
        System.out.print(integersStr.replace(",", "").replace("[", "").replace("]", ""));
    }  
}