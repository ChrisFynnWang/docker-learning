package com.wangfan.docker.springboot.controller;

import com.wangfan.docker.springboot.repository.VisitorRepository;
import com.wangfan.docker.springboot.pojo.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/10/14
 * @Other:
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class IndexController {

    @Autowired
    private VisitorRepository repository;

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        Visitor visitor = repository.findByIp(ip);
        if (null == visitor) {
            visitor = new Visitor();
            visitor.setIp(ip);
            visitor.setTimes(1);
        } else {
            visitor.setTimes(visitor.getTimes() + 1);
        }
        repository.save(visitor);
        return "I have been seen ip" + visitor.getIp() + " " + visitor.getTimes() + " times.";
    }
}
