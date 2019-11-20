package com.cgo.mobile;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *  手动注入 dataSource 避免 DruidAutoConfigure   dataSourceAutoConfigure 起bean冲突
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@ComponentScan(basePackages ={
        "com.cgo.db",
        "com.cgo.mobile",
        "com.cgo.common"
} )
@MapperScan(basePackages = "com.cgo.db.mapper")
public class MobileApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileApplication.class, args);
    }
}
