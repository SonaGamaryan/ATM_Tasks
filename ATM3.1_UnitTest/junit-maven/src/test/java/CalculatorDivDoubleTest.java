import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorDivDoubleTest {
    @Test
    public void testDivDoublePositiveValues(){
        Calculator calculator = new Calculator();
        double result = calculator.div(10.0,2.5);
        //System.out.println(result);
        assertTrue(result == 4.0);

    }


    @Test
    public void testDivDoubleNegativeValues(){
        Calculator calculator = new Calculator();
        double result = calculator.div(-10.1,-1.0);
        System.out.println(result);
        assertTrue(result == 10.1);

    }

    @Test
    public void testDivDouble0(){
        Calculator calculator = new Calculator();
        try {
            long result = calculator.div(10,0);
            //assertTrue(result == 0);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
