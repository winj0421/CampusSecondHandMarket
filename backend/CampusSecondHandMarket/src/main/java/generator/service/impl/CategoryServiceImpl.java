package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Category;
import generator.service.CategoryService;
import generator.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【category】的数据库操作Service实现
* @createDate 2025-04-27 14:45:30
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




