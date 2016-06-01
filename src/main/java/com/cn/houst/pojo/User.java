package com.cn.houst.pojo;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 5224713489669852010L;

	/**
     * user_t.id
     * @ibatorgenerated 2016-04-20 11:10:59
     */
    private Integer id;

    /**
     * user_t.user_name
     * @ibatorgenerated 2016-04-20 11:10:59
     */
    private String userName;

    /**
     * user_t.password
     * @ibatorgenerated 2016-04-20 11:10:59
     */
    private String password;

    /**
     * user_t.age
     * @ibatorgenerated 2016-04-20 11:10:59
     */
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}