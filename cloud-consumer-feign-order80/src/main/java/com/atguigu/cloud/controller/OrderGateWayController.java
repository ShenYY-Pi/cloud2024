package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.resp.ResultData;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderGateWayController
{
    @Resource
    private PayFeignApi payFeignApi;

    @GetMapping(value = "/feign/pay/gateway/get/{id}")
    @CircuitBreaker(name = "cloud-gateway", fallbackMethod = "myCircuitFallback")
    public ResultData getById(@PathVariable("id") Integer id)
    {
        return payFeignApi.getById(id);
    }

    //myCircuitFallback就是服务降级后的兜底处理方法
    public ResultData myCircuitFallback(Integer id, Throwable t) {
        // 这里是容错处理逻辑，返回备用结果
        return ResultData.fail("401","还未到抢购时间！！！");
    }



    @GetMapping(value = "/feign/pay/gateway/info")
    public ResultData<String> getGatewayInfo()
    {
        return payFeignApi.getGatewayInfo();
    }
}