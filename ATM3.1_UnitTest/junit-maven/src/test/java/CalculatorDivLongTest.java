import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorDivLongTest {
    @Test
    public void testDivDoublePositiveValues(){
        Calculator calculator = new Calculator();
        long result = calculator.div(10,2);
        System.out.println(result);
        assertTrue(result == 5);

    }


    @Test
    public void testDivDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        long result = calculator.div(-10,-10);
        System.out.println(result);
        assertTrue(result == 1);

    }

    @Test
    public void testDivDouble0(){
        Calculator calculator = new Calculator();
        try {
        long result = calculator.div(0,0);
        assertTrue(result == 0);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
