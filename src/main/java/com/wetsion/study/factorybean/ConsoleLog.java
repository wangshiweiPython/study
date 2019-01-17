package com.wetsion.study.factorybean;

import org.springframework.stereotype.Component;

/**
 * @CLassName: ConsoleLog
 * @Author: weixin
 * @Description: TODO
 * @DATE: 2019/1/11 3:07 PM
 * @Version: 1.0
 */
@Component
public class ConsoleLog implements ILog {
    @Override
    public void print(String msg) {
        System.out.println("console log:" + msg);
    }

    @Override
    public boolean verify(Integer condition) {
        return condition <= 10;
    }
}
