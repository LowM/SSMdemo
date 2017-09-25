package com.wuhao.model;

public class usr {
    private Integer id;
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "usr{" +
                "id=" + id +
                ", name=" + name +
                ", sex='" + sex + '\'' +
                '}';
    }
}