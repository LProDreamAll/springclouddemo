package config;


import com.lhh.rule.MyRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PowerRuleConfig {
    @Bean
    public IRule iRule(){

        return  new MyRule();
    }
}
