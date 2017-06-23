import com.epam.tat.module4.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sona_Gamaryan on 6/7/2017.
 */
public class CalculatorTgTest {
    @Test
    public void testTg30(){
        Calculator calculator = new Calculator();
        double result = calculator.tg(30.0);
        //System.out.println(result);
        assertTrue(result == 0.577350269);

    }


    @Test
    public void testTg45(){
        Calculator calculator = new Calculator();
        double result = calculator.tg(45.0);
        System.out.println(result);
        assertTrue(result == 1.0);

    }

    @Test
    public void testTg90(){
        Calculator calculator = new Calculator();
        try {
            long result = calculator.div(90,0);
            //assertTrue(result == 0);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
