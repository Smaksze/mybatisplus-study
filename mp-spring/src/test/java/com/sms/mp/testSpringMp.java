package com.sms.mp;

import com.sms.mp.mapper.StudentMapper;
import com.sms.mp.pojp.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunms
 * @create 2020-09-04 11:26
 */
public class testSpringMp {

    @Test
    public void testSpringMp(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        SqlSessionFactory factory = context.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSession sqlSession = factory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectById(23);
        System.out.println(student);
    }
}
