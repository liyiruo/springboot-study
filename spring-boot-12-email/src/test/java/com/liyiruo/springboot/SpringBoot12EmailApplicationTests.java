package com.liyiruo.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot12EmailApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("liyiruo1234567890@qq.com");
        simpleMailMessage.setTo("liyiruo1234567890@qq.com");
        simpleMailMessage.setSubject("test email");
        simpleMailMessage.setText("你好啊");
        //密送
        simpleMailMessage.setBcc("liyiruo1234567890@qq.com");
        //抄送人
        simpleMailMessage.setCc("liyiruo1234567890@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

    @Test
    public void testMimeMail() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        messageHelper.setSubject("这个是邮件通知");
        messageHelper.setFrom("liyiruo1234567890@qq.com");
        messageHelper.setTo("liyiruo1234567890@qq.com");

        String text = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"utf-8\">\n" +
                "\t\t<title></title>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t\t<img alt=\"图片1\" src=\"http://t9.baidu.com/it/u=4169540006,4220376401&fm=79&app=86&f=JPEG?w=1000&h=1500\" width=\"20%\" height=\"20%\"/>\n" +
                "\t\t\t<!-- <img alt=\"图片2\" src=\"/Users/liyiruo/Desktop/1.jpg\" /> -->\n" +
                "\t\t\t<h1 style=\"color: pink;text-align: center;background-color: antiquewhite;\">i love spring</h1>\n" +
                "\t</body>\n" +
                "</html>\n";

        messageHelper.setText(text,true);

        messageHelper.addAttachment("只是一个附件名.java",new File("/Users/liyiruo/IdeaProjects/spring-boot-study/spring-boot-12-email/src/main/java/com/liyiruo/springboot/SpringBoot12EmailApplication.java"));

        javaMailSender.send(mimeMessage);
    }
}
