package com.findgods.freedom.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.loginName
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.type
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.crTime
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private Date crtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastTime
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    private Date lasttime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.loginName
     *
     * @return the value of user.loginName
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.loginName
     *
     * @param loginname the value for user.loginName
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.type
     *
     * @return the value of user.type
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.type
     *
     * @param type the value for user.type
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.crTime
     *
     * @return the value of user.crTime
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public Date getCrtime() {
        return crtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.crTime
     *
     * @param crtime the value for user.crTime
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastTime
     *
     * @return the value of user.lastTime
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public Date getLasttime() {
        return lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastTime
     *
     * @param lasttime the value for user.lastTime
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}