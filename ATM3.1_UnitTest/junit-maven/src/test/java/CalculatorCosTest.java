import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorCosTest {
    @Test
    public void testCos30(){
        Calculator calculator = new Calculator();
        double result = calculator.cos(30.0);
        System.out.println(result);
        assertTrue(result == 0.8660254);

    }


    @Test
    public void testCos45(){
        Calculator calculator = new Calculator();
        double result = calculator.cos(45.0);
        System.out.println(result);
        assertTrue(result == 0.70710678);

    }

    @Test
    public void testCos90(){
        Calculator calculator = new Calculator();
        double result = calculator.cos(90.0);
        assertTrue(result == 0);


    }
}
