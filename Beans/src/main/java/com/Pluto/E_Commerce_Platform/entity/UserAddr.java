package com.Pluto.E_Commerce_Platform.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "e_commerce_platform..user_addr")
public class UserAddr {
    /**
     * ��ַ����id
     */
    @Id
    @Column(name = "addr_id")
    private String addrId;

    /**
     * �û�ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * �ռ�������
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * �ռ����ֻ���
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * ʡ��
     */
    private String province;

    /**
     * ����
     */
    private String city;

    /**
     * ����
     */
    private String area;

    /**
     * ��ϸ��ַ
     */
    private String addr;

    /**
     * �ʱ�
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * ״̬,1������0��Ч
     */
    private Integer status;

    /**
     * �Ƿ�Ĭ�ϵ�ַ 1�� 1:��  0:��
     */
    @Column(name = "common_addr")
    private Integer commonAddr;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ��ȡ��ַ����id
     *
     * @return addr_id - ��ַ����id
     */
    public String getAddrId() {
        return addrId;
    }

    /**
     * ���õ�ַ����id
     *
     * @param addrId ��ַ����id
     */
    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    /**
     * ��ȡ�û�ID
     *
     * @return user_id - �û�ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �����û�ID
     *
     * @param userId �û�ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�ռ�������
     *
     * @return receiver_name - �ռ�������
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * �����ռ�������
     *
     * @param receiverName �ռ�������
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * ��ȡ�ռ����ֻ���
     *
     * @return receiver_mobile - �ռ����ֻ���
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * �����ռ����ֻ���
     *
     * @param receiverMobile �ռ����ֻ���
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * ��ȡʡ��
     *
     * @return province - ʡ��
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����ʡ��
     *
     * @param province ʡ��
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * ��ȡ����
     *
     * @return city - ����
     */
    public String getCity() {
        return city;
    }

    /**
     * ���ó���
     *
     * @param city ����
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * ��ȡ����
     *
     * @return area - ����
     */
    public String getArea() {
        return area;
    }

    /**
     * ��������
     *
     * @param area ����
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * ��ȡ��ϸ��ַ
     *
     * @return addr - ��ϸ��ַ
     */
    public String getAddr() {
        return addr;
    }

    /**
     * ������ϸ��ַ
     *
     * @param addr ��ϸ��ַ
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * ��ȡ�ʱ�
     *
     * @return post_code - �ʱ�
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * �����ʱ�
     *
     * @param postCode �ʱ�
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * ��ȡ״̬,1������0��Ч
     *
     * @return status - ״̬,1������0��Ч
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����״̬,1������0��Ч
     *
     * @param status ״̬,1������0��Ч
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ�Ƿ�Ĭ�ϵ�ַ 1�� 1:��  0:��
     *
     * @return common_addr - �Ƿ�Ĭ�ϵ�ַ 1�� 1:��  0:��
     */
    public Integer getCommonAddr() {
        return commonAddr;
    }

    /**
     * �����Ƿ�Ĭ�ϵ�ַ 1�� 1:��  0:��
     *
     * @param commonAddr �Ƿ�Ĭ�ϵ�ַ 1�� 1:��  0:��
     */
    public void setCommonAddr(Integer commonAddr) {
        this.commonAddr = commonAddr;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_time - ����ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateTime ����ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}