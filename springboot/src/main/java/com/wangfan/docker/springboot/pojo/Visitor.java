package com.wangfan.docker.springboot.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author : wangfan
 * @Description :
 * @Date : 2019/2/14 9:50
 */

@Data
@Entity
public class Visitor {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private long times;
    @Column(nullable = false)
    private String ip;
}
