package com.lbh.Demo2;

public class JD {
    //定义家电
    private String name;
    //状态：开关
    private boolean status;//默认是关的

    public void press() {
        status = !status;
    }

    public JD() {
    }


    public JD(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "JD{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
