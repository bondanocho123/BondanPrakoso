package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/bangunruang")
public class BangunRuangController
{
    @RequestMapping(value = {"/",""}, method = RequestMethod.GET)
    public String index()
    {
        return "bangunruang/index";
    }

    @RequestMapping(value = {"/segitiga",""}, method = RequestMethod.GET)
    public String segitiga()
    {
        return "bangunruang/segitiga";
    }



}
