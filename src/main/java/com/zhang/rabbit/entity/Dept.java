package com.zhang.rabbit.entity;

/**
 * @author jiwei.zhang
 * @DATE 2018-04-04 上午 9:33
 */
public class Dept {

    public String name;
    protected int age;
    char sex;
    private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    private void showName(String name,int age){
        System.out.println(name+"=="+age);
    }
    protected void showName2(String name,int age){
        System.out.println(name+"=="+age);
    }
    void showName3(String name,int age){
        System.out.println(name+"=="+age);
    }
    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", num='" + num + '\'' +
                '}';
    }
}
