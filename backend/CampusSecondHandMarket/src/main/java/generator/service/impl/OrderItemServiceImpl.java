package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.OrderItem;
import generator.service.OrderItemService;
import generator.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【order_item】的数据库操作Service实现
* @createDate 2025-04-27 14:45:49
*/
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService{

}




