package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Transaction;
import generator.service.TransactionService;
import generator.mapper.TransactionMapper;
import org.springframework.stereotype.Service;

/**
* @author sia_y
* @description 针对表【transaction】的数据库操作Service实现
* @createDate 2025-04-27 14:46:17
*/
@Service
public class TransactionServiceImpl extends ServiceImpl<TransactionMapper, Transaction>
    implements TransactionService{

}




