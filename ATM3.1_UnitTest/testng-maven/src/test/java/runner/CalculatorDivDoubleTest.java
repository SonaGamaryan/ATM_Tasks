package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorDivDoubleTest {
    private double a;
    private double b;
    private double expected;
    /*@Factory(dataProvider = "divDataProvider" )
    public CalculatorDivDoubleTest(double a, double b, double expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }*/
    @Test(dataProvider ="divDataProvider", groups = "Bugs")//, dependsOnGroups = "main")
    public  void testDivDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.div(a,b);
        Assert.assertEquals(result, expected);
    }

    @Test (expectedExceptions = NumberFormatException.class, groups = "Bugs")
    public void testDivDoubleByZero(){
        Calculator calculator = new Calculator();
        double result = calculator.div(5.0,0);
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProvider(){
        return new Object[][] {
                {2.0, 1.0, 2.0},
                {-0.0113, -1.0, 0.0113}

        };
    }

}
