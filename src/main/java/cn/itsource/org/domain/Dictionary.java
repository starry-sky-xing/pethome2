package cn.itsource.org.domain;

import cn.itsource.basic.domain.BaseDomain;
import lombok.Data;

@Data
public class Dictionary extends BaseDomain {
    //字典编号
    private String sn;
    //字典名字
    private String name;
}
