package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.ProductReview;
import generator.service.ProductReviewService;
import generator.mapper.ProductReviewMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【product_review】的数据库操作Service实现
* @createDate 2025-04-27 14:46:02
*/
@Service
public class ProductReviewServiceImpl extends ServiceImpl<ProductReviewMapper, ProductReview>
    implements ProductReviewService{

}




