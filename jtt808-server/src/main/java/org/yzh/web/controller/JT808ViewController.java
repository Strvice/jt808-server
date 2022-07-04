package org.yzh.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yzh.web.entity.T0200Entity;
import org.yzh.web.service.IT0200Service;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JT808ViewController {
    @Autowired
    IT0200Service it0200Service;
    @Operation(summary = "获取位置信息")
    @GetMapping("get/gps")
    public ModelAndView  getGps() {
        T0200Entity t0200Entity=new T0200Entity();
        t0200Entity.setClientId("14161905775");
        List<T0200Entity> t0200EntityList=it0200Service.selectT0200List(t0200Entity);
        List<List<Double>> lists=new ArrayList<>();

        t0200EntityList.forEach(t0200Entity1 ->{
            List<Double> list=new ArrayList<>();

            list.add(t0200Entity1.getLatitude());

            list.add(t0200Entity1.getLongitude());
            lists.add(list);
        });
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("lists", lists);
        modelAndView.setViewName("/gps");
        return modelAndView;
    }
}
