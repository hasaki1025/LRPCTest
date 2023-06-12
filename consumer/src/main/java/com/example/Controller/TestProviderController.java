package com.example.Controller;

import com.rpc.lrpc.net.RpcCallRequestSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestProviderController {

    @Autowired
    RpcCallRequestSender sender;


    final String rpcUrl="rpc://helloRpc:test";
    final String messsage="this is consumer";

    @GetMapping("/testAsyn")
    public void test()
    {
        sender.call(rpcUrl,(x)->{
            log.info("get message from Provider {}",x);
        },messsage);
    }

    @GetMapping("/testSync")
    public void testSync()
    {
        sender.callSync(rpcUrl,String.class,messsage);
    }
}
