package com.chungyo.sharding.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chungyo.sharding.demo.entity.ChauDan5;
import com.chungyo.sharding.demo.mapper.ChauDan5Mapper;

@RestController
public class Page3Controller {
	@Autowired ChauDan5Mapper chauDanMapper;
	
	@GetMapping(value="/addChauDan5")
	public int addCourse(@RequestParam(value="agid",required = true) String agid,
			@RequestParam(value="userid",required = true) String userid) {
	    ChauDan5 chauDan = ChauDan5.build();
	    chauDan.setAGID(Integer.parseInt(agid));
	    chauDan.setUserID(Long.parseLong(userid));
	    return chauDanMapper.insert(chauDan);
	}
	
	@GetMapping(value="/chauDan5Select")
	public int getCourseCount(@RequestParam(value="agid",required = false) String agid) {
		QueryWrapper<ChauDan5> wrapper = new QueryWrapper<>();
		if( agid != null ) {
		    wrapper.eq("agid", agid);
		}
	    List<ChauDan5> course = chauDanMapper.selectList(wrapper);
	    System.out.println("chauDan Size:" + course.size());
	    return course.size();
	}

}
