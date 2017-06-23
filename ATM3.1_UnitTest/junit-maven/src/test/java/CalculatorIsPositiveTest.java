import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorIsPositiveTest {
    @Test
    public void testIsPositivePositiveValue(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(30);
        System.out.println(result);
        assertTrue(result == true);

    }


    @Test
    public void testIsPositiveNetativeValue(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(-9);
        System.out.println(result);
        assertTrue(result == false);

    }

    @Test
    public void testIsPositive0Value(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(0);
        assertTrue(result == false);


    }
}
