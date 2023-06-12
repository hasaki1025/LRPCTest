package com.example.Controller;

import com.rpc.lrpc.Annotation.RPCController;
import com.rpc.lrpc.Annotation.RPCMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RPCController
public class ProviderController {


    @RPCMapping("test")
    public String test(String msg)
    {
        log.info("get message {}",msg);
        return "this Provider";
    }
}
