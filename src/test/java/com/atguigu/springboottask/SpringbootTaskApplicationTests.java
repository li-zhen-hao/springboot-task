package com.atguigu.springboottask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setSubject("开会！");
        simpleMailMessage.setText("今晚开会");
        simpleMailMessage.setTo("18737325037@163.com");
        simpleMailMessage.setFrom("347843976@qq.com");
        javaMailSender.send(simpleMailMessage);

    }
    @Test
    public void contextLoads02() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setSubject("开会！");
        mimeMessageHelper.setText("<b style='color:red'>今晚开会</b>",true);
        mimeMessageHelper.setTo("18737325037@163.com");
        mimeMessageHelper.setFrom("347843976@qq.com");
        mimeMessageHelper.addAttachment("1.jpg", new File("C:\\Users\\Administrator\\Desktop\\1.jpg"));

        javaMailSender.send(mimeMessage);

    }

}

