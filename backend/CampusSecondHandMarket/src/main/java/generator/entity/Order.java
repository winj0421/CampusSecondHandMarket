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
 * @TableName order
 */
@TableName(value ="order")
@Data
public class Order {
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
    private Long seller_id;

    /**
     * 
     */
    private BigDecimal total_amount;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private Integer payment_type;

    /**
     * 
     */
    private Date created_at;

    /**
     * 
     */
    private Date updated_at;
}