package com.sms.mpspringboot.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author sunms
 * @create 2020-09-08 17:35
 */
@TableName("student")
public class Stu {
    public Stu(String id, String name, Integer age, String loginName, String pwd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.loginName = loginName;
        this.pwd = pwd;
    }

    public Stu() {

    }

    @Override
    public String toString() {
        return "Stu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", loginName='" + loginName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    //@TableId(type = IdType.AUTO)
    private String id;
    private String name;
    private Integer age;
    private String loginName;
    private String pwd;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
