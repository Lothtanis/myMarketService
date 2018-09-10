package martketService.dao;

import javax.annotation.Resource;
import martketService.model.MGoods;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class MGoodsDao {

    @Resource
    public JdbcTemplate jdbcTemplate;
    
    public String getMGoodsName(String id){
        StringBuffer sql = new StringBuffer();
          sql.append(" SELECT name FROM m_goods WHERE id = ? ");
          
      String name =  this.jdbcTemplate.queryForObject(sql.toString(), new Object[]{id}, String.class);
      
      return name;
    }

    public MGoods getMGoods(String id) {
        StringBuffer sql = new StringBuffer();
        sql.append(" SELECT * FROM m_goods WHERE id = ? ");
        
        MGoods goods = this.jdbcTemplate.queryForObject(sql.toString(),
                new Object[] { id }, new BeanPropertyRowMapper<MGoods>(MGoods.class));
    
        return goods;
    }

}
