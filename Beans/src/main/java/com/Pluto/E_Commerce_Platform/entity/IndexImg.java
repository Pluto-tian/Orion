package com.Pluto.E_Commerce_Platform.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "e_commerce_platform..index_img")
public class IndexImg {
    /**
     * ����
     */
    @Id
    @Column(name = "img_id")
    private String imgId;

    /**
     * ͼƬ ͼƬ��ַ
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * ����ɫ ������ɫ
     */
    @Column(name = "img_bg_color")
    private String imgBgColor;

    /**
     * ��Ʒid ��Ʒid
     */
    @Column(name = "prod_id")
    private String prodId;

    /**
     * ��Ʒ����id ��Ʒ����id
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * �ֲ�ͼ���� �ֲ�ͼ���ͣ������жϣ����Ը�����Ʒid���߷������ҳ����ת��1����Ʒ 2������
     */
    @Column(name = "index_type")
    private Integer indexType;

    /**
     * �ֲ�ͼչʾ˳�� �ֲ�ͼչʾ˳�򣬴�С����
     */
    private Integer seq;

    /**
     * �Ƿ�չʾ:1��ʾ������ʾ��0��ʾ���� �Ƿ�չʾ��1��չʾ    0����չʾ
     */
    private Integer status;

    /**
     * ����ʱ�� ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����ʱ�� ����
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ��ȡ����
     *
     * @return img_id - ����
     */
    public String getImgId() {
        return imgId;
    }

    /**
     * ��������
     *
     * @param imgId ����
     */
    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    /**
     * ��ȡͼƬ ͼƬ��ַ
     *
     * @return img_url - ͼƬ ͼƬ��ַ
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * ����ͼƬ ͼƬ��ַ
     *
     * @param imgUrl ͼƬ ͼƬ��ַ
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * ��ȡ����ɫ ������ɫ
     *
     * @return img_bg_color - ����ɫ ������ɫ
     */
    public String getImgBgColor() {
        return imgBgColor;
    }

    /**
     * ���ñ���ɫ ������ɫ
     *
     * @param imgBgColor ����ɫ ������ɫ
     */
    public void setImgBgColor(String imgBgColor) {
        this.imgBgColor = imgBgColor;
    }

    /**
     * ��ȡ��Ʒid ��Ʒid
     *
     * @return prod_id - ��Ʒid ��Ʒid
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * ������Ʒid ��Ʒid
     *
     * @param prodId ��Ʒid ��Ʒid
     */
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    /**
     * ��ȡ��Ʒ����id ��Ʒ����id
     *
     * @return category_id - ��Ʒ����id ��Ʒ����id
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * ������Ʒ����id ��Ʒ����id
     *
     * @param categoryId ��Ʒ����id ��Ʒ����id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * ��ȡ�ֲ�ͼ���� �ֲ�ͼ���ͣ������жϣ����Ը�����Ʒid���߷������ҳ����ת��1����Ʒ 2������
     *
     * @return index_type - �ֲ�ͼ���� �ֲ�ͼ���ͣ������жϣ����Ը�����Ʒid���߷������ҳ����ת��1����Ʒ 2������
     */
    public Integer getIndexType() {
        return indexType;
    }

    /**
     * �����ֲ�ͼ���� �ֲ�ͼ���ͣ������жϣ����Ը�����Ʒid���߷������ҳ����ת��1����Ʒ 2������
     *
     * @param indexType �ֲ�ͼ���� �ֲ�ͼ���ͣ������жϣ����Ը�����Ʒid���߷������ҳ����ת��1����Ʒ 2������
     */
    public void setIndexType(Integer indexType) {
        this.indexType = indexType;
    }

    /**
     * ��ȡ�ֲ�ͼչʾ˳�� �ֲ�ͼչʾ˳�򣬴�С����
     *
     * @return seq - �ֲ�ͼչʾ˳�� �ֲ�ͼչʾ˳�򣬴�С����
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * �����ֲ�ͼչʾ˳�� �ֲ�ͼչʾ˳�򣬴�С����
     *
     * @param seq �ֲ�ͼչʾ˳�� �ֲ�ͼչʾ˳�򣬴�С����
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * ��ȡ�Ƿ�չʾ:1��ʾ������ʾ��0��ʾ���� �Ƿ�չʾ��1��չʾ    0����չʾ
     *
     * @return status - �Ƿ�չʾ:1��ʾ������ʾ��0��ʾ���� �Ƿ�չʾ��1��չʾ    0����չʾ
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * �����Ƿ�չʾ:1��ʾ������ʾ��0��ʾ���� �Ƿ�չʾ��1��չʾ    0����չʾ
     *
     * @param status �Ƿ�չʾ:1��ʾ������ʾ��0��ʾ���� �Ƿ�չʾ��1��չʾ    0����չʾ
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ����ʱ�� ����ʱ��
     *
     * @return create_time - ����ʱ�� ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ�� ����ʱ��
     *
     * @param createTime ����ʱ�� ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ����ʱ�� ����
     *
     * @return update_time - ����ʱ�� ����
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ø���ʱ�� ����
     *
     * @param updateTime ����ʱ�� ����
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}