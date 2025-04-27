package generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName transaction
 */
@TableName(value ="transaction")
@Data
public class Transaction {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long user_id;

    /**
     * 
     */
    private Long order_id;

    /**
     * 
     */
    private BigDecimal amount;

    /**
     * 
     */
    private Integer type;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Date created_at;

    /**
     * 
     */
    private Date updated_at;
}