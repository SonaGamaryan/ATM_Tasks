import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Sona_Gamaryan on 8/7/2017.
 */
public class RestAssuredWebServiceTest {
    @BeforeTest
    public void initTest(){
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
    }

    @Test
    public void checkStatusCOde(){
        Response rp = given().get("/users").andReturn();
        int actualStatusCode = rp.getStatusCode();
        Assert.assertEquals(actualStatusCode,200);
    }

    @Test
    public void checkResponseHeader(){
        Response rp = given().get("/users").andReturn();
        String valueOfContentTypeReader = rp.getHeader("content-type");
        Assert.assertTrue(valueOfContentTypeReader.contains("application/json"));
    }

    @Test
    public void checkResponseBody(){
        Response rp = given().get("/users/1").andReturn();
        User user = rp.as(User.class);

        Post[] post = rp.as(Post[].class);
        Assert.assertEquals(user.getName(), "Leanne Graham");
    }
}
