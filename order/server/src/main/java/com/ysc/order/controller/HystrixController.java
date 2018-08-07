package com.ysc.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    //超时配置
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    //@HystrixCommand(fallbackMethod = "fallback")

//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  //设置熔断
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), //设置最小请求数
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//设置休眠时间窗
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60") //设置错误百分比
//    })
    @HystrixCommand
    @GetMapping("/getProductInfoList")
    public String getProductInfoList(@RequestParam("number") Integer number) {
        if (number % 2 == 0) {
            return "success";
        }
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://127.0.0.1:8005/product/listForOrder",
                Arrays.asList("157875196366160022"),
                String.class);
    }

    private String fallback() {
        return "太拥挤了，请稍后再试!";
    }

    private String defaultFallback() {
        return "默认提示：太拥挤了，请稍后再试！";
    }

}