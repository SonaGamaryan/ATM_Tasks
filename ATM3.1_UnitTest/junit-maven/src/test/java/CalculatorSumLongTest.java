import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sona_Gamaryan on 6/6/2017.
 */
public class CalculatorSumLongTest {


    @Test
    public void testSumLongPositiveValues(){
        Calculator calculator = new Calculator();
        long sum = calculator.sum(1,10);
        Assert.assertEquals(sum, 11);

    }

    @Test
    public void testSumLongNegativeValues(){
        Calculator calculator = new Calculator();
        long sum = calculator.sum(-1,-10);
        Assert.assertEquals(sum, -11);

    }

    @Test
    public void testSumLong0(){
        Calculator calculator = new Calculator();
        long sum = calculator.sum(0,0);
        Assert.assertEquals(sum, 0);

    }
}
