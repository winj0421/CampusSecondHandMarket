package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.UserPoints;
import generator.service.UserPointsService;
import generator.mapper.UserPointsMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【user_points】的数据库操作Service实现
* @createDate 2025-04-27 14:46:38
*/
@Service
public class UserPointsServiceImpl extends ServiceImpl<UserPointsMapper, UserPoints>
    implements UserPointsService{

}




