package dto.request;

import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class UserUpdateDTO {
    private String realName;

    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    private String phone;

    @Email(message = "邮箱格式不正确")
    private String email;

    private String city;

    @Min(value = 0, message = "性别参数错误")
    @Max(value = 2, message = "性别参数错误")
    private Integer gender;

    @Size(min = 16, max = 16, message = "银行账号必须为16位数字")
    @Pattern(regexp = "^\\d{16}$", message = "银行账号必须为16位数字")
    private String bankAccount;

    private String avatar;
}
