package net.gwy.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoweiyang
 * @date 2019-07-06
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/info")
    public String info(){
        return "hello jenkins";
    }
}
