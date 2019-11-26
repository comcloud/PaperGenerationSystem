package com.cloud.generatorsystem.model;

import lombok.Data;

@Data
public class Teacher {
    private String name;
    private String department;
    private String tel;
    private String mail;

    public Teacher() {
    }

    public Teacher(String name, String department, String tel, String mail) {
        this.name = name;
        this.department = department;
        this.tel = tel;
        this.mail = mail;
    }
}
