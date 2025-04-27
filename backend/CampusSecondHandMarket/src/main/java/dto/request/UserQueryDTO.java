package dto.request;


import lombok.Data;

import java.util.Date;

@Data
public class UserQueryDTO {
    private String username;
    private String realName;
    private String phone;
    private String email;
    private Integer gender;
    private Integer role;
    private Integer status;
    private String city;
    private Date createTimeStart;
    private Date createTimeEnd;
}