package cn.yswu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yswu
 * @date 2021-07-19 22:35
 */
@SpringBootApplication
@MapperScan("cn.yswu.mapper")
public class QuickStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickStartApplication.class,args);
    }
}
