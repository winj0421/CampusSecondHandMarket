package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Order;
import generator.service.OrderService;
import generator.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【order】的数据库操作Service实现
* @createDate 2025-04-27 14:45:43
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




