import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorMultLongTest {
    @Test
    public void testMultDoublePositiveValues(){
        Calculator calculator = new Calculator();
        long result = calculator.mult(1,10);
        System.out.println(result);
        assertTrue(result == 10);

    }


    @Test
    public void testMultDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        long result = calculator.mult(-1,10);
        System.out.println(result);
        assertTrue(result == -10);

    }

    @Test
    public void testMultDouble0(){
        Calculator calculator = new Calculator();
        long result = calculator.mult(0,0);
        assertTrue(result == 0);

    }
}
