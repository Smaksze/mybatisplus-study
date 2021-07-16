package com.sms.mpspringboot.service;

import com.sms.mpspringboot.pojo.CommunityManage;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author v-sunms.gd@chinatelecom.cn
 * @create 2020-09-24 8:54
 */
@Service
@FeignClient(url = "${all.url}",name = "allurl")
public interface FeignService {

    @PostMapping("/manage/devcom-manage/get")
    CommunityManage getCommunity(@RequestBody Long id);


}
