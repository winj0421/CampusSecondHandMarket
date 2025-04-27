package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.User;
import generator.service.UserService;
import generator.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.User;
import generator.mapper.UserMapper;
import generator.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
* @author sia_y
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2025-04-27 19:27:06
*/
@Service


public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean register(User user, MultipartFile businessLicense, String captcha, String sessionCaptcha) {
        // 1. 校验验证码
        if (sessionCaptcha == null || !sessionCaptcha.equalsIgnoreCase(captcha)) {
            return false;
        }
        // 2. 处理商家营业执照
        if (user.getRole() != null && user.getRole() == 1 && businessLicense != null && !businessLicense.isEmpty()) {
            String url = saveBusinessLicense(businessLicense);
            user.setBusiness_license(url);
        }
        // 3. 设置初始状态
        user.setStatus(0); // 待审核
        // 4. 保存用户
        return this.save(user);
    }

    @Override
    public String saveBusinessLicense(MultipartFile file) {
        String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
        String path = "upload/business_license/" + fileName;
        File dest = new File(path);
        dest.getParentFile().mkdirs();
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return path;
    }

    @Override
    public List<User> getUsersByStatus(int status) {
        return this.list(new QueryWrapper<User>().eq("status", status));
    }

    @Override
    public boolean updateUserStatus(Long id, int status) {
        User user = this.getById(id);
        if (user == null) return false;
        user.setStatus(status);
        return this.updateById(user);
    }
}




