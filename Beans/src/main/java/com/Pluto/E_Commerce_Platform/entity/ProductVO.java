package com.Pluto.E_Commerce_Platform.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.*;


public class ProductVO {
    /**
     * ��Ʒ����id
     */
    @Id
    @Column(name = "product_id")
    private String productId;

    /**
     * ��Ʒ���� ��Ʒ����
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * �������id ����id
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * һ���������id һ������id�������Ż���ѯ
     */
    @Column(name = "root_category_id")
    private Integer rootCategoryId;

    /**
     * ���� �ۼ�����
     */
    @Column(name = "sold_num")
    private Integer soldNum;

    /**
     * Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼� Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼�
     */
    @Column(name = "product_status")
    private Integer productStatus;

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
     * ��Ʒ���� ��Ʒ����
     */
    private String content;

    public List<ProductImg> getImgs() {
        return imgs;
    }

    public void setImgs(List<ProductImg> imgs) {
        this.imgs = imgs;
    }

    private List<ProductImg> imgs;

    /**
     * ��ȡ��Ʒ����id
     *
     * @return product_id - ��Ʒ����id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * ������Ʒ����id
     *
     * @param productId ��Ʒ����id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * ��ȡ��Ʒ���� ��Ʒ����
     *
     * @return product_name - ��Ʒ���� ��Ʒ����
     */
    public String getProductName() {
        return productName;
    }

    /**
     * ������Ʒ���� ��Ʒ����
     *
     * @param productName ��Ʒ���� ��Ʒ����
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * ��ȡ�������id ����id
     *
     * @return category_id - �������id ����id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * ���÷������id ����id
     *
     * @param categoryId �������id ����id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * ��ȡһ���������id һ������id�������Ż���ѯ
     *
     * @return root_category_id - һ���������id һ������id�������Ż���ѯ
     */
    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    /**
     * ����һ���������id һ������id�������Ż���ѯ
     *
     * @param rootCategoryId һ���������id һ������id�������Ż���ѯ
     */
    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    /**
     * ��ȡ���� �ۼ�����
     *
     * @return sold_num - ���� �ۼ�����
     */
    public Integer getSoldNum() {
        return soldNum;
    }

    /**
     * �������� �ۼ�����
     *
     * @param soldNum ���� �ۼ�����
     */
    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    /**
     * ��ȡĬ����1����ʾ����״̬, -1��ʾɾ��, 0�¼� Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼�
     *
     * @return product_status - Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼� Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼�
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * ����Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼� Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼�
     *
     * @param productStatus Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼� Ĭ����1����ʾ����״̬, -1��ʾɾ��, 0�¼�
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
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

    /**
     * ��ȡ��Ʒ���� ��Ʒ����
     *
     * @return content - ��Ʒ���� ��Ʒ����
     */
    public String getContent() {
        return content;
    }

    /**
     * ������Ʒ���� ��Ʒ����
     *
     * @param content ��Ʒ���� ��Ʒ����
     */
    public void setContent(String content) {
        this.content = content;
    }
}