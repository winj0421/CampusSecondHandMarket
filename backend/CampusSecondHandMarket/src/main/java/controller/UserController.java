package controller;

import generator.entity.User;
import generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import generator.entity.User;
import generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

import java.util.List;

@RestController
@RequestMapping("/users")


public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(
            @ModelAttribute User user,
            @RequestParam(required = false) MultipartFile businessLicense,
            @RequestParam String captcha,
            HttpSession session
    ) {
        String sessionCaptcha = (String) session.getAttribute("captcha");
        boolean success = userService.register(user, businessLicense, captcha, sessionCaptcha);
        if (success) {
            return ResponseEntity.ok("注册成功，等待管理员审核");
        } else {
            return ResponseEntity.badRequest().body("注册失败，验证码错误或数据有误");
        }
    }
}