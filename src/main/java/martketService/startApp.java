package martketService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan("market.controller")
@SpringBootApplication
public class startApp extends SpringBootServletInitializer{
    
    //可在在servlet中部署的war包
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(startApp.class);
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(startApp.class, args);
    }
}