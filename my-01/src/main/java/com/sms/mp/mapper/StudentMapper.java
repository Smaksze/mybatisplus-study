package com.sms.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sms.mp.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author sunms
 * @create 2020-09-04 10:44
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student>{

    List<Map<String,Student>> getAll();

    Map<String,Integer> getCount();

}
