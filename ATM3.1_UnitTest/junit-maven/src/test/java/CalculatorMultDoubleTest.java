import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorMultDoubleTest {
    @Test
    public void testMultDoublePositiveValues(){
        Calculator calculator = new Calculator();
        double result = calculator.mult(1.0,10.2);
        //System.out.println(result);
        assertTrue(result == 11.22);

    }


    @Test
    public void testMultDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        double result = calculator.mult(-1.1,-10.1);
        System.out.println(result);
        assertTrue(result == 11.22);

    }

    @Test
    public void testMultDouble0(){
        Calculator calculator = new Calculator();
        double result = calculator.mult(0.0,0.0);
        assertTrue(result == 0.0);

    }
}
