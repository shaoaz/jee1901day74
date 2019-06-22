import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;

/**
 * Created by Administrator on 2019/6/5.
 */
public class HelloWorld {
    @org.junit.Test
    public void testHelloWorld(){
        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager  Factory<org.apache.shiro.mgt.SecurityManager> factory =
     Factory<SecurityManager> factory =new IniSecurityManagerFactory("shiro.xml");
        //2、得到SecurityManager实例 并绑定给SecurityUtils   org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityManager securityManager=factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("zhang","123");
        try {
            //4、登录，即身份验证
            subject.login(token);
        }catch (AuthenticationException e){
            System.out.println("登录失败");
        }
        Assert.assertEquals(true,subject.isAuthenticated()); //断言用户已经登录
        subject.logout(); //6、退出
    }
}
