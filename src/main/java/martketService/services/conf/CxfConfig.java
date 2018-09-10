package martketService.services.conf;

import javax.xml.ws.Endpoint;





import martketService.services.MGoodsService;
import martketService.services.Impl.MGoodsServiceImpl;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CxfConfig {
//    @Autowired
//    private Bus bus;
//    @Autowired
//    private MGoodsService mgoodsServices;
    
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
         return new ServletRegistrationBean(new CXFServlet(), "/test/*");
    }
    
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean
    public MGoodsServiceImpl mgoodsServices() {
        return new MGoodsServiceImpl();
    }
    
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), mgoodsServices());
        endpoint.publish("/MGoodsService");//接口发布在 /NetbarServices 目录下
        return endpoint;
    }

}
