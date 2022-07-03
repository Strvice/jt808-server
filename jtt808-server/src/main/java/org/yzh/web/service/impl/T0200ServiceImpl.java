package org.yzh.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzh.protocol.t808.T0200;
import org.yzh.web.mapper.T0200Mapper;
import org.yzh.web.service.IT0200Service;

import java.util.List;

@Service
public class T0200ServiceImpl implements IT0200Service {
    @Autowired
    private T0200Mapper t0200Mapper;
    @Override
    public T0200 selectT0200ById(Long id) {
        return null;
    }

    @Override
    public List<T0200> selectT0200List(T0200 T0200) {
        return null;
    }

    @Override
    public List<T0200> queryNum() {
        return null;
    }

    @Override
    public int insertT0200(T0200 t0200) {
        return t0200Mapper.insertT0200(t0200);
    }

    @Override
    public boolean saveBatchReport(List<T0200> list) {
        return false;
    }

    @Override
    public int updateT0200(T0200 T0200) {
        return 0;
    }

    @Override
    public int deleteT0200ByIds(String ids) {
        return 0;
    }

    @Override
    public int deleteT0200ById(Long id) {
        return 0;
    }
}
