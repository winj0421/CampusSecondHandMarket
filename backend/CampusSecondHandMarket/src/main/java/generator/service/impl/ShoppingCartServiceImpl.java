package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ShoppingCart;
import generator.service.ShoppingCartService;
import generator.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【shopping_cart】的数据库操作Service实现
* @createDate 2025-04-27 14:46:09
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}




