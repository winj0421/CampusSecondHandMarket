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
 * @TableName product
 */
@TableName(value ="product")
@Data
public class Product {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long seller_id;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private BigDecimal price;

    /**
     * 
     */
    private Long category_id;

    /**
     * 
     */
    private String size;

    /**
     * 
     */
    private String images;

    /**
     * 
     */
    private Integer stock;

    /**
     * 
     */
    private Integer sales_count;

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