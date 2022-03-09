package com.Pluto.E_Commerce_Platform.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "users")
public class Users {
    /**
     * ����id �û�id
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * �û��� �û���
     */
    private String username;

    /**
     * ���� ����
     */
    private String password;

    /**
     * �ǳ� �ǳ�
     */
    private String nickname;

    /**
     * ��ʵ���� ��ʵ����
     */
    private String realname;

    /**
     * ͷ�� ͷ��
     */
    @Column(name = "user_img")
    private String userImg;

    /**
     * �ֻ��� �ֻ���
     */
    @Column(name = "user_mobile")
    private String userMobile;

    /**
     * �����ַ �����ַ
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * �Ա� M(��) or F(Ů)
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * ���� ����
     */
    @Column(name = "user_birth")
    private Date userBirth;

    /**
     * ע��ʱ�� ����ʱ��
     */
    @Column(name = "user_regtime")
    private Date userRegtime;

    /**
     * ����ʱ�� ����ʱ��
     */
    @Column(name = "user_modtime")
    private Date userModtime;

    /**
     * ��ȡ����id �û�id
     *
     * @return user_id - ����id �û�id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * ��������id �û�id
     *
     * @param userId ����id �û�id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�û��� �û���
     *
     * @return username - �û��� �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û��� �û���
     *
     * @param username �û��� �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ���� ����
     *
     * @return password - ���� ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * �������� ����
     *
     * @param password ���� ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ�ǳ� �ǳ�
     *
     * @return nickname - �ǳ� �ǳ�
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * �����ǳ� �ǳ�
     *
     * @param nickname �ǳ� �ǳ�
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * ��ȡ��ʵ���� ��ʵ����
     *
     * @return realname - ��ʵ���� ��ʵ����
     */
    public String getRealname() {
        return realname;
    }

    /**
     * ������ʵ���� ��ʵ����
     *
     * @param realname ��ʵ���� ��ʵ����
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * ��ȡͷ�� ͷ��
     *
     * @return user_img - ͷ�� ͷ��
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * ����ͷ�� ͷ��
     *
     * @param userImg ͷ�� ͷ��
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    /**
     * ��ȡ�ֻ��� �ֻ���
     *
     * @return user_mobile - �ֻ��� �ֻ���
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * �����ֻ��� �ֻ���
     *
     * @param userMobile �ֻ��� �ֻ���
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     * ��ȡ�����ַ �����ַ
     *
     * @return user_email - �����ַ �����ַ
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * ���������ַ �����ַ
     *
     * @param userEmail �����ַ �����ַ
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * ��ȡ�Ա� M(��) or F(Ů)
     *
     * @return user_sex - �Ա� M(��) or F(Ů)
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * �����Ա� M(��) or F(Ů)
     *
     * @param userSex �Ա� M(��) or F(Ů)
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * ��ȡ���� ����
     *
     * @return user_birth - ���� ����
     */
    public Date getUserBirth() {
        return userBirth;
    }

    /**
     * �������� ����
     *
     * @param userBirth ���� ����
     */
    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    /**
     * ��ȡע��ʱ�� ����ʱ��
     *
     * @return user_regtime - ע��ʱ�� ����ʱ��
     */
    public Date getUserRegtime() {
        return userRegtime;
    }

    /**
     * ����ע��ʱ�� ����ʱ��
     *
     * @param userRegtime ע��ʱ�� ����ʱ��
     */
    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }

    /**
     * ��ȡ����ʱ�� ����ʱ��
     *
     * @return user_modtime - ����ʱ�� ����ʱ��
     */
    public Date getUserModtime() {
        return userModtime;
    }

    /**
     * ���ø���ʱ�� ����ʱ��
     *
     * @param userModtime ����ʱ�� ����ʱ��
     */
    public void setUserModtime(Date userModtime) {
        this.userModtime = userModtime;
    }
}