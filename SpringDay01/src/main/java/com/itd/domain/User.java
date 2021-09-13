package com.itd.domain;

/**
 * @Author Administrator
 * @Date 2021/9/2 10:31
 * @Version 1.0
 */
public class User {
    private String name;
    private String addr;

    public String getUsername() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
