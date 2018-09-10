package martketService.services;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import martketService.model.MGoods;


@WebService(targetNamespace = "http://services.martketService/")
public interface MGoodsService {
    @WebMethod
    String sayHello(@WebParam(name = "userName") String name);
    
    @WebMethod
    String getMGoodsName(@WebParam(name = "id") String id);
    
    @WebMethod
    MGoods getMGoods(String id);
}
