import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoSmokeTest extends BaseTest {

    @Test
    public void verifyingHomePage(){
        page.navigate("https://www.saucedemo.com/");
        String actualTitle = page.title();
        System.out.println("Page title: "+ actualTitle);
        Assert.assertEquals(actualTitle,"Swag Labs", "Home title mismatched");
    }
}
