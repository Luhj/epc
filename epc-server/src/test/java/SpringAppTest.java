import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luhaijie on 2017/12/14.
 */
@RestController
@EnableAutoConfiguration
public class SpringAppTest {

    @RequestMapping("/")
    String home() {
        return "EL PSY CONGROO";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAppTest.class, args);
    }
}
