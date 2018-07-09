package send.sms.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author gurunath k
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "send.sms.service.config")
public class ApplicationConfiguration {
}
