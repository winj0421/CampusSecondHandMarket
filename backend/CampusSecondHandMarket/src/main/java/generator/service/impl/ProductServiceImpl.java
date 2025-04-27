package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Product;
import generator.service.ProductService;
import generator.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【product】的数据库操作Service实现
* @createDate 2025-04-27 14:45:20
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




