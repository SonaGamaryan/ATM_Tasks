import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorSumDoubleTest {
    @Test
    public void testSumDoublePositiveValues(){
        Calculator calculator = new Calculator();
        double sum = calculator.sum(1.02,10.044);
        System.out.println(sum);
        assertTrue(sum == 11.064);

    }


    @Test
    public void testSumDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        double sum = calculator.sum(-1.1,-10.9);
        assertTrue(sum == -12.0);

    }

    @Test
    public void testSumDouble0(){
        Calculator calculator = new Calculator();
        double sum = calculator.sum(0.0,0.0);
        assertTrue(sum == 0.0);

    }
}
