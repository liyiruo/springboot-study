package com.liyiruo.springboot.bean;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Iterator;
import java.util.Map;

/**
 * 发生错误时，错误的信息存在一个map里，只需要获取到这个map 并且在map里新增加 就可以了。
 * @author liyiruo
 * @data 2020/3/30  10:34 上午
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {

        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);

        map.put("company", "liyiruo");
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        return map;
    }

}
