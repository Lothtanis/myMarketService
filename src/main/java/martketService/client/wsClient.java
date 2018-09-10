package martketService.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class wsClient {

    public static void main(String[] args) {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8002/test/MGoodsService?wsdl");
        // getUser 为接口中定义的方法名称 张三为传递的参数 返回一个Object数组
        Object[] objects = new Object[0];
        try {
            objects = client.invoke("sayHello", "Leftso");
            System.out.println("*****返回数据:" + objects[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
