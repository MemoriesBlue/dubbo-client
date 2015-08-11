import com.elaine.test.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianlan on 15-8-11.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo_consumer.xml");
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        long start = System.currentTimeMillis();
        String msg = demoService.msg("hello");
        System.out.println("dubbo调用时间:" + (System.currentTimeMillis() - start) + "ms");
        System.out.println(msg);
    }
}
