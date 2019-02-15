package com.wangfan.docker.springboot.repository;

import com.wangfan.docker.springboot.pojo.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : wangfan
 * @Description :
 * @Date : 2019/2/14 9:41
 */
public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByIp(String ip);
}
