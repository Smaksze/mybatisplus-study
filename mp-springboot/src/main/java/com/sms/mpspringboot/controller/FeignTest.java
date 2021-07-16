package com.sms.mpspringboot.controller;

import com.sms.mpspringboot.pojo.CommunityManage;
import com.sms.mpspringboot.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author v-sunms.gd@chinatelecom.cn
 * @create 2020-09-24 8:50
 */
@RestController
public class FeignTest {

    @Autowired
    FeignService service;

    @PostMapping("/test")
    public CommunityManage test(@RequestBody Long id){
        CommunityManage community = service.getCommunity(id);
        return community;
    }


}
