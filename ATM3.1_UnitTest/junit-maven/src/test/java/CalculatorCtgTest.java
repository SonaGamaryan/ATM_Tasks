import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorCtgTest {
    @Test
    public void testCtg30(){
        Calculator calculator = new Calculator();
        double result = calculator.ctg(30.0);
        //System.out.println(result);
        assertTrue(result == 1.7321);

    }


    @Test
    public void testCtg45(){
        Calculator calculator = new Calculator();
        double result = calculator.ctg(45.0);
        System.out.println(result);
        assertTrue(result == 1.0);

    }

    @Test
    public void testCtg90(){
        Calculator calculator = new Calculator();
            double result = calculator.ctg(90.0);
            assertTrue(result == 0);


    }

}
