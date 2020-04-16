package com.liyiruo.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author liyiruo
 * @data 2020/3/19  1:06 下午
 */
@Data
@Getter
@Setter
@ToString
public class Forte {
    @Value("${forte.name}")
    private String name;
//    @Value("${forte.time}")
    @Value("#{2*4}")
    private int time;

}
