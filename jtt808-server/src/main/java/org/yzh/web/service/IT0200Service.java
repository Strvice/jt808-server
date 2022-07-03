package org.yzh.web.service;


import org.yzh.web.entity.T0200Entity;

import java.util.List;

public interface IT0200Service {

    public T0200Entity selectT0200ById(Long id);


    public List<T0200Entity> selectT0200List(T0200Entity t0200Entity);

    public int insertT0200(T0200Entity T0200);


    public boolean saveBatchReport(List<T0200Entity> list);


    public int updateT0200(T0200Entity t0200Entity);


    public int deleteT0200ByIds(String ids);

 
    public int deleteT0200ById(Long id);
}
