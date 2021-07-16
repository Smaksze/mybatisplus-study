package com.sms.mp;

import com.sms.mp.mapper.StudentMapper;
import com.sms.mp.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author sunms
 * @create 2020-09-04 10:45
 */
public class MpTest {

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Map<String, Student>> all = mapper.getAll();
        System.out.println(all);
        all.forEach(System.out::println);
    }

    @Test
    public void testXml() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Map<String, Integer> count = mapper.getCount();
        System.out.println(count);
    }


}
