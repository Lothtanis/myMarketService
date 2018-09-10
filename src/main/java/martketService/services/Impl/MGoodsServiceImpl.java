package martketService.services.Impl;

import javax.annotation.Resource;
import javax.jws.WebService;

import martketService.dao.MGoodsDao;


import martketService.model.MGoods;
import martketService.services.MGoodsService;

import org.springframework.stereotype.Component;

@WebService(serviceName = "MGoodsService"//服务名
                        ,targetNamespace = "http://services.martketService/"//报名倒叙，并且和接口定义保持一致
                        ,endpointInterface = "martketService.services.MGoodsService")//包名
@Component
public class MGoodsServiceImpl implements MGoodsService {
    
    @Resource
    MGoodsDao MGoodsDao;
    
    public String sayHello(String name) {
        return "hello , "+ name;
    }
    
    public String getMGoodsName(String id){
        return MGoodsDao.getMGoodsName(id);
    }
    
    public MGoods getMGoods(String id){
        
        return MGoodsDao.getMGoods(id);
    }
}
