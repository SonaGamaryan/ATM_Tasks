import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorSinTest {
    @Test
    public void testSin30(){
        Calculator calculator = new Calculator();
        double result = calculator.sin(30.0);
        System.out.println(result);
        assertTrue(result == 0.5);

    }


    @Test
    public void testSin45(){
        Calculator calculator = new Calculator();
        double result = calculator.sin(45.0);
        System.out.println(result);
        assertTrue(result == 0.70710678);

    }

    @Test
    public void testSin90(){
        Calculator calculator = new Calculator();
        double result = calculator.sin(-90.0);
        assertTrue(result == -1.0);


    }
}
