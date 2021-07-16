package com.sms.mpspringboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sms.mpspringboot.mapper.StuMapper;
import com.sms.mpspringboot.pojo.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MpSpringbootApplicationTests {

    @Autowired
    StuMapper mapper;

    @Test
    void contextLoads() {
        Stu stu = new Stu("5", "张三", 99, "zhangsan", "zhangsan");
        Stu stu1 = new Stu("1", "里斯", 23, "lsii", "lsi");
        Stu stu2 = new Stu("2", "王五", 1, "wangwu", "wangwu");
        Stu stu3 = new Stu("3", "赵六", 42, "zhangsan", "zhangsan");
        Stu stu4 = new Stu("4", "前期", 53, "zhangsan", "zhangsan");
        int insert = mapper.insert(stu);
        mapper.insert(stu1);
        mapper.insert(stu2);
        mapper.insert(stu3);
        mapper.insert(stu4);

        System.out.println(insert);

    }

    @Test
    public void testDeleMap() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("age", 99);
        map.put("name", "张三");

        int i = mapper.deleteByMap(map);
        System.out.println(i);

    }

    @Test
    public void testDele() {

        QueryWrapper<Stu> wrapper = new QueryWrapper<>();

        wrapper.between("age", 40, 50);

        int delete = mapper.delete(wrapper);
        System.out.println(delete);

    }

    @Test
    public void testDele2(){

        mapper.deleteBatchIds(Arrays.asList("1","2"));
    }
    
    @Test
    public void testSele(){
        List<Stu> stus = mapper.selectList(null);
        for (Stu stu : stus) {
            System.out.println(stu);
        }

    }

    @Test
    public void testUpdate1(){
        Stu stu = new Stu();
        stu.setId("4");
        stu.setName("钱七");
        int i = mapper.updateById(stu);
        System.out.println(i);

    }
    
    @Test
    public void testUpdata2(){
        QueryWrapper<Stu> wrapper = new QueryWrapper<>();
        wrapper.eq("id","4");
        Stu stu = new Stu();
        stu.setName("张三");

        mapper.update(stu,wrapper);
        
    }

    @Test
    public void testUpdate3(){
        UpdateWrapper<Stu> wrapper = new UpdateWrapper<>();
        wrapper.set("name","里斯")
                .eq("id","5");
        mapper.update(null,wrapper);

    }

    @Test
    public void testUpdate4(){
        UpdateWrapper<Stu> wrapper = new UpdateWrapper<>();
        wrapper.set("login_name","ddd")
                .eq("name","李四");
        mapper.update(null,wrapper);

    }
    
    @Test
    public void testSele1(){
        List<Stu> stus = mapper.selectBatchIds(Arrays.asList("1", "2", "5"));
        for (Stu stu : stus) {
            System.out.println(stu);
        }

    }

    @Test
    public void testSele2(){
        QueryWrapper<Stu> stuQueryWrapper = new QueryWrapper<>();
        stuQueryWrapper.like("login_name","n");
        List<Stu> stus = mapper.selectList(stuQueryWrapper);
        for (Stu stu : stus) {
            System.out.println(stu);
        }

    }

    @Test
    public void testSele3(){
        HashMap<String, Object> ma = new HashMap<>();
        ma.put("age",53);
        List<Stu> stus = mapper.selectByMap(ma);
        for (Stu stu : stus) {
            System.out.println(stu);
        }

    }

    @Test
    public void testSele4(){
        QueryWrapper<Stu> wrapper = new QueryWrapper<>();
        wrapper.ge("age",80);
                /*.select("name","age");*/

        Integer integer = mapper.selectCount(wrapper);

        System.out.println("年林大于80的人有" + integer + "  个");

    }
    @Test
    public void testSele5(){
        IPage<Stu> page = new Page<Stu>(1,2);

        QueryWrapper<Stu> wrapper = new QueryWrapper<>();

        IPage<Stu> stuIPage = mapper.selectPage(page, wrapper);

        List<Stu> stus = stuIPage.getRecords();
        long pages = stuIPage.getPages();///3
        long size = stuIPage.getSize();//1
        long total = stuIPage.getTotal();//3
        /*for (Stu stu : stus) {
            System.out.println(stu);
        }*/

        System.out.println(stuIPage.getCurrent());
        System.out.println(pages);
        System.out.println(size);
        System.out.println(total);

    }

    @Test
    public void testSele6(){

        QueryWrapper<Stu> wrapper = new QueryWrapper<Stu>().lt("age", 80);
        Stu stu = mapper.selectOne(wrapper);
        System.out.println(stu);

    }

    

}
