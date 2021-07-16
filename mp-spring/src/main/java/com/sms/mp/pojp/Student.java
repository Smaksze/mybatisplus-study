package com.sms.mp.pojp;


public class Student {

  private String id;

  public Student() {
  }

  public Student(String id, String name, long age, String loginName, String pwd) {

    this.id = id;
    this.name = name;
    this.age = age;
    this.loginName = loginName;
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", loginName='" + loginName + '\'' +
            ", pwd='" + pwd + '\'' +
            '}';
  }

  private String name;
  private long age;
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


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
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
