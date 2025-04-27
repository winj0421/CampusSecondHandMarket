package generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName product_review
 */
@TableName(value ="product_review")
@Data
public class ProductReview {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long product_id;

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
    private Integer rating;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String images;

    /**
     * 
     */
    private Date created_at;
}