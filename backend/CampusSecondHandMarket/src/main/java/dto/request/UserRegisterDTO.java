package dto.request;

import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class UserRegisterDTO {
    @NotBlank(message = "用户名不能为空")
    @Size(min = 4, max = 20, message = "用户名长度4-20个字符")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 20, message = "密码长度6-20个字符")
    private String password;

    @NotBlank(message = "真实姓名不能为空")
    private String realName;

    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    private String phone;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    private String city;

    @NotNull(message = "性别不能为空")
    @Min(value = 0, message = "性别参数错误")
    @Max(value = 2, message = "性别参数错误")
    private Integer gender;

    @Size(min = 16, max = 16, message = "银行账号必须为16位数字")
    @Pattern(regexp = "^\\d{16}$", message = "银行账号必须为16位数字")
    private String bankAccount;

    @NotNull(message = "角色不能为空")
    @Min(value = 0, message = "角色参数错误")
    @Max(value = 2, message = "角色参数错误")
    private Integer role;
}