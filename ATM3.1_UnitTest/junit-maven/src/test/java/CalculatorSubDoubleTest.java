import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorSubDoubleTest {
    @Test
    public void testSubDoublePositiveValues(){
        Calculator calculator = new Calculator();
        double result = calculator.sub(1.0,10.2);
        System.out.println(result);
        assertTrue(result == -9.2);

    }


    @Test
    public void testSubDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        double result = calculator.sub(-1.1,-10.1);
        System.out.println(result);
        assertTrue(result == 9.0);

    }

    @Test
    public void testSubDouble0(){
        Calculator calculator = new Calculator();
        double result = calculator.sub(0.0,0.0);
        assertTrue(result == 0.0);

    }
}
