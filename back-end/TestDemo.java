import com.sinosoft.ims.ImsWebApplication;
import com.sinosoft.ims.core.common.utils.SM4Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * wsw
 *
 * @auth /**
 * @ClassName TestDemo
 * @Description TODO
 * @Author wsw
 * @Date 2021/11/12 10:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ImsWebApplication.class)
public class TestDemo {
    private static Logger logger = LoggerFactory.getLogger(TestDemo.class);
    @Autowired
    private SM4Utils sm4Utils;

    /**
     * SM4常用于政府系统的数据传输加密，我们使用前端向后端传递信息，或者分布式场景下不同模块之间的调用，可以使用此算法。
     * 对参数的数据进行加密，然后后台对加密的数据进行解密再存储到数据库中，保证数据传输过程中，不受泄露。
     * 含有ECB、CBC模式：
     * ECB：Electronic codebook电子密码本，简单、快速、支持并行计算，不应使用；
     * CBC：cipher block chaining 密文分组链接模式，推荐使用。
     * 使用前需在配置文件配置秘钥，自行定义
     * sm4.secretKey: HENG1AN2WEN3YHB6
     * sm4.iv: HENG1AN2WEN3YHB6
     *
     */
    @Test
    public void test(){
        String password="0000";
        logger.info("未加密密码:{}",password);
        String newPassword = sm4Utils.encryptData_CBC(password);
        logger.info("加密后密码:{}",newPassword);
    }
}
