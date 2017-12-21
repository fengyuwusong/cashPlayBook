package cn.niriqiang.cashPlayBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Created by fengyuwusong on 2017/12/18 22:15.
     */
    public static class demo {
        public static void main(String[] args) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        }
    }
}

