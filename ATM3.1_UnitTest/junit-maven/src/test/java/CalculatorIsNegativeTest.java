import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorIsNegativeTest {
    @Test
    public void testIsNegativePositiveValue(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isNegative(30);
        System.out.println(result);
        assertTrue(result == false);

    }


    @Test
    public void testIsNegativeNetativeValue(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isNegative(-9);
        System.out.println(result);
        assertTrue(result == true);

    }

    @Test
    public void testIsNegative0Value(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isNegative(0);
        assertTrue(result == false);


    }
}
