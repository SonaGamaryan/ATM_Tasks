package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorTgTest {

    private double a;
    private double expected;

    /*@Factory(dataProvider = "tgDataProvider" )
    public CalculatorTgTest(double a, double expected){
        this.a = a;
        this.expected = expected;
    }*/
    @Test(dataProvider = "tgDataProvider", groups = "Bugs")
    public  void testTgDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.tg(a);
        Assert.assertEquals(result, expected);
    }
    @Test (expectedExceptions = NumberFormatException.class, groups = "Bugs")
    public void testTg90 (){

        Calculator calculator = new Calculator();
        double result = calculator.tg(90);
        System.out.println(result);
    }

    @DataProvider(name = "tgDataProvider")
    public static Object[][] tgDataProvider(){
        return new Object[][] {
                {-60.0, -1.732050808},
                {30.0, 0.577350269},
                {45.0, 1.0},
                {60.0, 0.8660254},
                {60.0, 1.732050808}
        };
    }

}
