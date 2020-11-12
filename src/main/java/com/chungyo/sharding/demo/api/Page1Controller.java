package com.chungyo.sharding.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chungyo.sharding.demo.entity.Course;
import com.chungyo.sharding.demo.mapper.CouseMapper;

@RestController
public class Page1Controller {
	@Autowired CouseMapper couseMapper;
	
	@GetMapping(value="/hello")
	public String getHello() {
		return "hello";
	}
	

	@GetMapping(value="/exception")
	public String getException() {
		int a = 1/0;
		return "hello"+a;
	}
	
	@GetMapping(value="/addCourse")
	public void addCourse() {
		Course course = new Course();
	    course.setCname("name");
	    course.setCstatus("status");
	    course.setUserId(1l);
	    couseMapper.insert(course);
	}
	
	@GetMapping(value="/countCourse")
	public int getCourseCount(@RequestParam(value = "cstatus", required = false) String cstatus) {
		QueryWrapper<Course> wrapper = new QueryWrapper<>();
		if(cstatus != null) {
		    wrapper.eq("cstatus", cstatus);
		}
	    wrapper.orderBy(true, false, "user_id");
	    List<Course> course = couseMapper.selectList(wrapper);
	    System.out.println("Course Size:" + course.size());
	    return course.size();
	}

}
