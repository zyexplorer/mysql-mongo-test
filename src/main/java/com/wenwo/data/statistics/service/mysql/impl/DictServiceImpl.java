package com.wenwo.data.statistics.service.mysql.impl;

import com.wenwo.data.statistics.dao.mysql.DictMapper;
import com.wenwo.data.statistics.entity.mysql.Dict;
import com.wenwo.data.statistics.service.mysql.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: DictServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2020年01月02日  12:50
 */
@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<Dict> getAllDict() {
        return dictMapper.findAll();
    }
}
