package com.Pluto.E_Commerce_Platform.entity;

import javax.persistence.*;

@Table(name = "e_commerce_platform..user_login_history")
public class UserLoginHistory {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ����
     */
    @Column(name = "AREA")
    private String area;

    /**
     * ����
     */
    @Column(name = "COUNTRY")
    private String country;

    /**
     * �û�id
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * IP
     */
    @Column(name = "IP")
    private String ip;

    /**
     * ʱ��
     */
    @Column(name = "LOGIN_TIME")
    private String loginTime;

    /**
     * ��ȡID
     *
     * @return ID - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ����
     *
     * @return AREA - ����
     */
    public String getArea() {
        return area;
    }

    /**
     * ���õ���
     *
     * @param area ����
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * ��ȡ����
     *
     * @return COUNTRY - ����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���
     *
     * @param country ����
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * ��ȡ�û�id
     *
     * @return USER_ID - �û�id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �����û�id
     *
     * @param userId �û�id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡIP
     *
     * @return IP - IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * ����IP
     *
     * @param ip IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * ��ȡʱ��
     *
     * @return LOGIN_TIME - ʱ��
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * ����ʱ��
     *
     * @param loginTime ʱ��
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}