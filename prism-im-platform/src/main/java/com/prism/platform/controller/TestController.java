package com.prism.platform.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anliwen
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    private String test(){
        log.info("This log info test! come from platform!");
        return "This is test! come from platform!";
    }
}
