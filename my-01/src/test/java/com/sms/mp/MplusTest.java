package com.sms.mp;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.sms.mp.mapper.StudentMapper;
import com.sms.mp.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author sunms
 * @create 2020-09-04 10:45
 */
public class MplusTest {

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSessionFactory factory = new MybatisSqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //List<Student> all = mapper.getAll();
        Student student = mapper.selectById(23);
        System.out.println(student);

        List<Student> all = mapper.selectList(null);

        for (Student stu : all) {
            System.out.println(stu);
        }
    }

}
