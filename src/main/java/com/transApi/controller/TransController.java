package com.transApi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class TransController {
    @GetMapping(value = "/")
    public String adminList() {

        return "menu/admin/admin-list";
    }

}
