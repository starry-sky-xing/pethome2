package cn.itsource.org.query;

import cn.itsource.basic.query.BaseQuery;
import lombok.Data;

@Data
public class DictionaryDetailQuery extends BaseQuery {
    //明细表typesid
    private String types_id;
}
