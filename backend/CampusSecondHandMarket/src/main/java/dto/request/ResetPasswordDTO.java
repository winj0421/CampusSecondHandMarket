package dto.request;

import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class ResetPasswordDTO {
    @NotBlank(message = "手机号或邮箱不能为空")
    private String account;

    @NotBlank(message = "验证码不能为空")
    private String captcha;

    @NotBlank(message = "新密码不能为空")
    @Size(min = 6, max = 20, message = "密码长度6-20个字符")
    private String newPassword;
}
