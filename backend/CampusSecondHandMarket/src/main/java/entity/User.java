package entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class User {
    @TableId
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String role;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
}