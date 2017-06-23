import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorSubLongTest {
    @Test
    public void testSumDoublePositiveValues(){
        Calculator calculator = new Calculator();
        long result = calculator.sub(1,10);
        System.out.println(result);
        assertTrue(result == -9);

    }


    @Test
    public void testSumDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        long result = calculator.sub(-1,-10);
        System.out.println(result);
        assertTrue(result == 9);

    }

    @Test
    public void testSumDouble0(){
        Calculator calculator = new Calculator();
        long result = calculator.sub(0,0);
        assertTrue(result == 0);

    }
}
