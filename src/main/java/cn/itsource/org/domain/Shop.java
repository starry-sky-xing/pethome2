package cn.itsource.org.domain;

import cn.itsource.basic.domain.BaseDomain;
import lombok.Data;

import java.util.Date;

@Data
public class Shop extends BaseDomain{
    private String name;
    private String tel;
    private Date registerTime=new Date();
    private Integer state;
    private String address;
    private String logo;
    private Employee admin;
}
