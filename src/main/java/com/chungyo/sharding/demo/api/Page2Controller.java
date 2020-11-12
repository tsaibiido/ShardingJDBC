package com.chungyo.sharding.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chungyo.sharding.demo.entity.ChauDan;
import com.chungyo.sharding.demo.mapper.ChauDanMapper;

@RestController
public class Page2Controller {
  @Autowired ChauDanMapper chauDanMapper;

  @GetMapping(value = "/addChauDan")
  public int addCourse(@RequestParam(value = "agid", required = true) String agid) {
    ChauDan chauDan = ChauDan.build();
    chauDan.setAGID(Integer.parseInt(agid));
    return chauDanMapper.insert(chauDan);
  }

  @GetMapping(value = "/chauDanSelect")
  public int getCourseCount(@RequestParam(value = "agid", required = false) String agid) {
    QueryWrapper<ChauDan> wrapper = new QueryWrapper<>();
    if (agid != null) {
      wrapper.eq("agid", Integer.parseInt(agid));
    }
    List<ChauDan> course = chauDanMapper.selectList(wrapper);
    System.out.println("chauDan Size:" + course.size());
    return course.size();
  }
}
