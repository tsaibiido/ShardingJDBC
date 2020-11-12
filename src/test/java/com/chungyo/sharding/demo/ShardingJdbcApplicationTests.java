package com.chungyo.sharding.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chungyo.sharding.demo.entity.ChauDan;
import com.chungyo.sharding.demo.entity.Course;
import com.chungyo.sharding.demo.mapper.ChauDanMapper;
import com.chungyo.sharding.demo.mapper.CouseMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingJdbcApplicationTests {

  @Autowired private CouseMapper couseMapper;
  @Autowired private ChauDanMapper chaudanMapper;

  @Test
  void addCourse() {

    Course course = new Course();
    course.setCname("name");
    course.setCstatus("status");
    course.setUserId(1l);
    couseMapper.insert(course);
  }

  @Test
  public void findCourseDbAll() {
    QueryWrapper<Course> wrapper = new QueryWrapper<>();
    wrapper.eq("cstatus", "Normal");
    wrapper.orderBy(true, false, "user_id");
    List<Course> course = couseMapper.selectList(wrapper);
    System.out.println("Course Size:" + course.size());

    course
        .stream()
        .forEach(
            a -> {
              System.out.println("cname:" + a.getCname());
            });
  }

  @Test
  public void findCourseDbAllbySql() {
    QueryWrapper<Course> wrapper = new QueryWrapper<>();
    wrapper.eq("cstatus", "Normal");
    wrapper.orderBy(true, false, "user_id");
    List<Course> course = couseMapper.selectList(wrapper);
    System.out.println("Course Size:" + course.size());

    course
        .stream()
        .forEach(
            a -> {
              System.out.println("cname:" + a.getCname());
            });
  }

  @Test
  public void findCourseDb() {
    QueryWrapper<Course> wrapper = new QueryWrapper<>();
    wrapper.eq("user_id", 100L);
    wrapper.eq("cid", 465162909769531393L);
    Course course = couseMapper.selectOne(wrapper);
    System.out.println("Course:" + course);
  }

  @Test
  void addChauDan() {
    ChauDan chauDan = ChauDan.build();
    chauDan.setAGID(11);

    chaudanMapper.insert(chauDan);
  }
}
