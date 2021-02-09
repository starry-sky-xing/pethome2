package cn.itsource.org.domain;

import cn.itsource.basic.domain.BaseDomain;
import lombok.Data;

@Data
public class DictionaryDetail extends BaseDomain {
    private String name;
    private String types_id;
}
