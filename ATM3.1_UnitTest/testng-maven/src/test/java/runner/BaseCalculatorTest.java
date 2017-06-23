package runner;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class BaseCalculatorTest {
    protected Calculator calculator;
    @BeforeClass
    public void setUp(){
    calculator = new Calculator();
    }

    @BeforeGroups(value = {"main"})
    public void beforeGroup(){
        System.out.println("Before groups name 'main'");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("ThreadID is: " + Thread.currentThread().getId());
    }

}
