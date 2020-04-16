package com.liyiruo.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @ConfigurationProperties 这个注解能把 配置文件里的数据读出来 给本类属性赋值
 * @author liyiruo
 * @data 2020/3/19  1:04 下午
 */

@Data
@Getter
@Setter
@Component
@ToString
@ConfigurationProperties(prefix = "emp")
public class Emp {
    private String lastName;
    @Value("#{2*3}")
    private Integer age;
    private Double salary;
    private Boolean boss;
    private Date birthday;
    private Map map;
    private List list;
    private Forte forte;
}
