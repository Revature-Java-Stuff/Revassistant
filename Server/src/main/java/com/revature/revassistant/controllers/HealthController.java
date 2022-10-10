package com.revature.revassistant.controllers;

import com.revature.revassistant.entities.Test;
import com.revature.revassistant.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/health")
public class HealthController {
    public final TestService testService;

    @Autowired
    public HealthController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody public String ping() {
        return "pong!";
    }

    @RequestMapping(value = "/test/{testMessage}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody public String test(@PathVariable String testMessage) {
        this.testService.save(new Test(testMessage));
        return testMessage;
    }

}
