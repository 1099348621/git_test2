package com.itheima.pojo;

/**
 * @author ben
 * @version 1.0.0
 * @description 说明
 * @createTime 2021年03月03日 02:50:00
 */
public class User {

    private String name;

    private Integer age;

    private String addr;
	
   //远程仓库中新增内容
   private String remote;

    //新增内容
    private String new;

    //新增内容11111
    private String new1;

    //dev分支新增内容
    private String dev;

    //dev分支新增内容22222
    private String dev;
	
   //远程仓库中新增内容2222222
   private String remote;
	
    //git_test2新增内容	
    private String git_test2_clone;

    //git_test2新增内容2
    private String git_test2_clone222;

    //git_test2新增内容3
    private String git_test2_clone333;

    //git新增内容
    private String git;

    public User() {
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
