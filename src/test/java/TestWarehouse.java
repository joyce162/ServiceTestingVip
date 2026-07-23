import com.test.wms.WmsLogin;
import org.junit.Assert;
import org.junit.Test;

public class TestWarehouse {

    @Test
    public void getHomePageList(){
        WmsLogin wmsLogin = new WmsLogin();
        String res = wmsLogin.getHomePageList("admin","123456").getBody().toString();
        Assert.assertFalse(res.equals(null));
    }
}
