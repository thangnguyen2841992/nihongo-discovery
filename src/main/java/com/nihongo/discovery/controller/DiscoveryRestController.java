package com.nihongo.discovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DiscoveryRestController {
    @GetMapping("/hello")
    public String hello() { return "ok"; }
}
