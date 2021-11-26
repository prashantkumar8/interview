package acko.testing.acko.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class ApplicationConfig {

    @Configuration
    @Profile("dev")
    @PropertySource("classpath:configuration.properties")
    @PropertySource("classpath:database.properties")
    @ConditionalOnProperty(value = "SPRING_CLOUD_CONFIG_ENABLED_AUDIT_LOG" , havingValue = "false", matchIfMissing = true)
    class DevProfileConfig {
    }

}
