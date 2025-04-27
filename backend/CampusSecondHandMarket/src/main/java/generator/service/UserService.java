package generator.service;

import generator.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sia_y
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2025-04-27 19:27:06
*/

import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface UserService extends com.baomidou.mybatisplus.extension.service.IService<User> {
    boolean register(User user, MultipartFile businessLicense, String captcha, String sessionCaptcha);
    List<User> getUsersByStatus(int status);
    boolean updateUserStatus(Long id, int status);
    String saveBusinessLicense(MultipartFile file);
}
