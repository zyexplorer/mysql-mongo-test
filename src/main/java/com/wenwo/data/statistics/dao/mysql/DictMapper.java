package com.wenwo.data.statistics.dao.mysql;

import java.util.List;
import com.wenwo.data.statistics.entity.mysql.Dict;
import tk.mybatis.mapper.common.Mapper;

public interface DictMapper extends Mapper<Dict> {

	List<Dict> findAll();
}
