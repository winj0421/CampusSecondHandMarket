package dto.request;

import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class BindEmailDTO {
    @NotNull(message = "用户ID不能为空")
    private Long userId;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    @NotBlank(message = "验证码不能为空")
    @Size(min = 6, max = 6, message = "验证码必须为6位")
    private String captcha;

    /**
     * 验证码类型：BIND-绑定邮箱 CHANGE-更换邮箱
     */
    @NotBlank(message = "验证码类型不能为空")
    @Pattern(regexp = "^(BIND|CHANGE)$", message = "验证码类型参数错误")
    private String captchaType;
}
