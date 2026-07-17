import com.test.wework.Wework;
import com.test.wms.WmsLogin;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestGetToken {
    @Test
    public void getAccessToken(){
        Wework wework = new Wework();
        String accessToken = wework.getAccessToken();

    }
    @Test
    public void getWmsCache(){
        WmsLogin wmsLogin = new WmsLogin();
        String uuid = wmsLogin.getCache();
        Assert.assertFalse(uuid.equals(null));
    }

    @Test
    public void getWmsLogin(){
        WmsLogin wmsLogin = new WmsLogin();
        String token = wmsLogin.getLoginToken("admin","123456");
        Assert.assertFalse(token.equals(null));
    }

}
