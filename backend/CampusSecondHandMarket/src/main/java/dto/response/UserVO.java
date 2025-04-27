package dto.response;

import lombok.Data;
import java.util.Date;

@Data
public class UserVO {
    private Long id;
    private String username;
    private String realName;
    private String phone;
    private String email;
    private String city;
    private Integer gender;
    private String bankAccount;
    private String avatar;
    private Integer role;
    private Integer status;
    private Date createTime;
    private Date updateTime;

    // 添加角色名称（便于前端显示）
    public String getRoleName() {
        switch (role) {
            case 1: return "商家";
            case 2: return "管理员";
            default: return "普通用户";
        }
    }

    // 添加状态名称
    public String getStatusName() {
        switch (status) {
            case 0: return "未审核";
            case 1: return "已审核";
            case 2: return "已禁用";
            default: return "未知状态";
        }
    }

    // 添加性别名称
    public String getGenderName() {
        switch (gender) {
            case 1: return "男";
            case 2: return "女";
            default: return "未知";
        }
    }
}
