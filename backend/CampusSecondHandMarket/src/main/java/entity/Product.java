package entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("product")
public class Product {
    @TableId
    private Long id;
    private String name;
    private String category;
    private Double price;
    private Integer stock;
    private String description;
    private String merchantId;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
}


