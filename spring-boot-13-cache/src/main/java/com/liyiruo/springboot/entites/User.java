package com.liyiruo.springboot.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /*
    * 'id','int unsigned','NO','PRI',NULL,'auto_increment'
'gander','varchar(100)','NO','',NULL,''
'name','varchar(40)','NO','',NULL,''
'date','date','YES','',NULL,''

    *
    * */
    private Integer id;
    private String gander;
    private String name;
    private Date date;

}
