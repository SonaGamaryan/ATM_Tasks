import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorPowTest {
    @Test
    public void testPowDoublePositiveValues(){
        Calculator calculator = new Calculator();
        double result = calculator.pow(11.635,2.760);
        //System.out.println(result);
        assertTrue(result == 135.373225);

    }


    @Test
    public void testPowDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        double result = calculator.pow(-1.1,-1.1);
        System.out.println(result);
        assertTrue(result == 1.0);

    }

    @Test
    public void testPow0Values(){
        Calculator calculator = new Calculator();
        double result = calculator.pow(1.1,0.0);
        System.out.println(result);
        assertTrue(result == 1.0);

    }

}
