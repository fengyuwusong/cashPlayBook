package cn.niriqiang.cashPlayBook.web;

import cn.niriqiang.cashPlayBook.core.Result;
import cn.niriqiang.cashPlayBook.core.ResultGenerator;
import cn.niriqiang.cashPlayBook.model.User;
import cn.niriqiang.cashPlayBook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 反馈发送邮件
 * Created by fengyuwusong on 2018/1/1 1:49.
 */
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private JavaMailSender mailSender; //自动注入的Bean\
    @Autowired
    private UserService userService;

    @Value("${spring.mail.username}")
    private String Sender; //读取配置文件中的参数

    @GetMapping("/{uid}/{content}")
    public Result sendSimpleMail(@PathVariable String content, @PathVariable int uid) throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(Sender); //自己给自己发送邮件
        message.setSubject("主题：小程序收到新的用户反馈啦~");
//        获取用户名
        User user = userService.findById(uid);
        message.setText("  from 用户id:" + uid + " 用户名:" + user.getNickname() + "内容：" + content);
        mailSender.send(message);
        return ResultGenerator.genSuccessResult();
    }
}
