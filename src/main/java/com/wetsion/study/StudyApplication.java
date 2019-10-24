package com.wetsion.study;

import com.wetsion.study.factorybean.ILog;
import com.wetsion.study.self_def_config_center.EnableRmsConfigCenter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
//@EnableDiscoveryClient
@EnableTransactionManagement
@EnableAsync
@EnableRmsConfigCenter
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }
}