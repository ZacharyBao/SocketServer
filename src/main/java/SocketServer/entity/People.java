package SocketServer.entity;

import java.io.Serializable;

/**
 * Created by BaoDong on 2018/4/6.
 */
public class People implements Serializable{
    private String name;
    private int age;

    public People(){

    }

    public People(String name,int age){
        this.name =name;
        this.age=age;
    }

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
}
