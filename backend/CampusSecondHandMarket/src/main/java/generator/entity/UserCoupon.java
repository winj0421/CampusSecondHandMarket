package generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user_coupon
 */
@TableName(value ="user_coupon")
@Data
public class UserCoupon {
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
    private Long coupon_id;

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
    private Date used_at;
}