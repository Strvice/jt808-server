package org.yzh.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yzh.protocol.t808.T0200;
import org.yzh.web.entity.T0200Entity;

import java.util.List;
@Mapper
public interface T0200Mapper {

    public T0200Entity selectT0200ById(Long id);


    public List<T0200Entity> selectT0200List(T0200Entity T0200);


    public int insertT0200(T0200Entity T0200);


    public int updateT0200(T0200Entity T0200);


    public int deleteT0200ById(Long id);


    public int deleteT0200ByIds(String[] ids);


    boolean saveBatchReport(List<T0200> list);
}
