package org.yzh.web.service;

import org.yzh.protocol.t808.T0200;

import java.util.List;

public interface IT0200Service {

    public T0200 selectT0200ById(Long id);


    public List<T0200> selectT0200List(T0200 T0200);

    List<T0200> queryNum();

    public int insertT0200(T0200 T0200);


    public boolean saveBatchReport(List<T0200> list);


    public int updateT0200(T0200 T0200);


    public int deleteT0200ByIds(String ids);

 
    public int deleteT0200ById(Long id);
}
