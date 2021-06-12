package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.result.CommonResult;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    @GetMapping("/payment/creat/{id}")
    public CommonResult creat(@PathVariable("id") int count){
        log.info("*********************插入结果"+count);
        if (count>0){
            return new CommonResult(200,"c插入数据库成功",count) ;
        }else{
            return new CommonResult(404,"插入数据库失败",count);
        }

    }
}
