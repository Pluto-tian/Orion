package com.Pluto.E_Commerce_Platform.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "e_commerce_platform..product_params")
public class ProductParams {
    /**
     * ��Ʒ����id
     */
    @Id
    @Column(name = "param_id")
    private String paramId;

    /**
     * ��Ʒid
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * ���� ���أ������й�����
     */
    @Column(name = "product_place")
    private String productPlace;

    /**
     * ������ �����ڣ�����180��
     */
    @Column(name = "foot_period")
    private String footPeriod;

    /**
     * Ʒ���� Ʒ������������ֻ�����
     */
    private String brand;

    /**
     * �������� ������������������ǹ���
     */
    @Column(name = "factory_name")
    private String factoryName;

    /**
     * ������ַ ������ַ�������������������
     */
    @Column(name = "factory_address")
    private String factoryAddress;

    /**
     * ��װ��ʽ ��װ��ʽ��������װ
     */
    @Column(name = "packaging_method")
    private String packagingMethod;

    /**
     * ������� �������������35g
     */
    private String weight;

    /**
     * �洢���� �洢��������������5~25��
     */
    @Column(name = "storage_method")
    private String storageMethod;

    /**
     * ʳ�÷�ʽ ʳ�÷�ʽ������������ʳ
     */
    @Column(name = "eat_method")
    private String eatMethod;

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
     * ��ȡ��Ʒ����id
     *
     * @return param_id - ��Ʒ����id
     */
    public String getParamId() {
        return paramId;
    }

    /**
     * ������Ʒ����id
     *
     * @param paramId ��Ʒ����id
     */
    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    /**
     * ��ȡ��Ʒid
     *
     * @return product_id - ��Ʒid
     */
    public String getProductId() {
        return productId;
    }

    /**
     * ������Ʒid
     *
     * @param productId ��Ʒid
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * ��ȡ���� ���أ������й�����
     *
     * @return product_place - ���� ���أ������й�����
     */
    public String getProductPlace() {
        return productPlace;
    }

    /**
     * ���ò��� ���أ������й�����
     *
     * @param productPlace ���� ���أ������й�����
     */
    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    /**
     * ��ȡ������ �����ڣ�����180��
     *
     * @return foot_period - ������ �����ڣ�����180��
     */
    public String getFootPeriod() {
        return footPeriod;
    }

    /**
     * ���ñ����� �����ڣ�����180��
     *
     * @param footPeriod ������ �����ڣ�����180��
     */
    public void setFootPeriod(String footPeriod) {
        this.footPeriod = footPeriod;
    }

    /**
     * ��ȡƷ���� Ʒ������������ֻ�����
     *
     * @return brand - Ʒ���� Ʒ������������ֻ�����
     */
    public String getBrand() {
        return brand;
    }

    /**
     * ����Ʒ���� Ʒ������������ֻ�����
     *
     * @param brand Ʒ���� Ʒ������������ֻ�����
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * ��ȡ�������� ������������������ǹ���
     *
     * @return factory_name - �������� ������������������ǹ���
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * ������������ ������������������ǹ���
     *
     * @param factoryName �������� ������������������ǹ���
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    /**
     * ��ȡ������ַ ������ַ�������������������
     *
     * @return factory_address - ������ַ ������ַ�������������������
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * ����������ַ ������ַ�������������������
     *
     * @param factoryAddress ������ַ ������ַ�������������������
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    /**
     * ��ȡ��װ��ʽ ��װ��ʽ��������װ
     *
     * @return packaging_method - ��װ��ʽ ��װ��ʽ��������װ
     */
    public String getPackagingMethod() {
        return packagingMethod;
    }

    /**
     * ���ð�װ��ʽ ��װ��ʽ��������װ
     *
     * @param packagingMethod ��װ��ʽ ��װ��ʽ��������װ
     */
    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    /**
     * ��ȡ������� �������������35g
     *
     * @return weight - ������� �������������35g
     */
    public String getWeight() {
        return weight;
    }

    /**
     * ���ù������ �������������35g
     *
     * @param weight ������� �������������35g
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * ��ȡ�洢���� �洢��������������5~25��
     *
     * @return storage_method - �洢���� �洢��������������5~25��
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * ���ô洢���� �洢��������������5~25��
     *
     * @param storageMethod �洢���� �洢��������������5~25��
     */
    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    /**
     * ��ȡʳ�÷�ʽ ʳ�÷�ʽ������������ʳ
     *
     * @return eat_method - ʳ�÷�ʽ ʳ�÷�ʽ������������ʳ
     */
    public String getEatMethod() {
        return eatMethod;
    }

    /**
     * ����ʳ�÷�ʽ ʳ�÷�ʽ������������ʳ
     *
     * @param eatMethod ʳ�÷�ʽ ʳ�÷�ʽ������������ʳ
     */
    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod;
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