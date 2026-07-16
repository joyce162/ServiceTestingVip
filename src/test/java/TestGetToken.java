import com.test.wework.Wework;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestGetToken {
    @Test
    public void getAccessToken(){
        Wework wework = new Wework();
        String accessToken = wework.getAccessToken();

    }

}
