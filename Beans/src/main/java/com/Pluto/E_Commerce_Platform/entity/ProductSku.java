package com.Pluto.E_Commerce_Platform.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "e_commerce_platform..product_sku")
public class ProductSku {
    /**
     * sku���
     */
    @Id
    @Column(name = "sku_id")
    private String skuId;

    /**
     * ��Ʒid
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * sku����
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * skuͼƬ
     */
    @Column(name = "sku_img")
    private String skuImg;

    /**
     * ������ϣ���ʽ��p1:v1;p2:v2��
     */
    private String untitled;

    /**
     * ԭ��
     */
    @Column(name = "original_price")
    private Integer originalPrice;

    /**
     * ���ۼ۸�
     */
    @Column(name = "sell_price")
    private Integer sellPrice;

    /**
     * �ۿ�����
     */
    private BigDecimal discounts;

    /**
     * ���
     */
    private Integer stock;

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
     * sku״̬(1���ã�0���ã�-1ɾ��)
     */
    private Integer status;

    /**
     * ��ȡsku���
     *
     * @return sku_id - sku���
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * ����sku���
     *
     * @param skuId sku���
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
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
     * ��ȡsku����
     *
     * @return sku_name - sku����
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * ����sku����
     *
     * @param skuName sku����
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * ��ȡskuͼƬ
     *
     * @return sku_img - skuͼƬ
     */
    public String getSkuImg() {
        return skuImg;
    }

    /**
     * ����skuͼƬ
     *
     * @param skuImg skuͼƬ
     */
    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    /**
     * ��ȡ������ϣ���ʽ��p1:v1;p2:v2��
     *
     * @return untitled - ������ϣ���ʽ��p1:v1;p2:v2��
     */
    public String getUntitled() {
        return untitled;
    }

    /**
     * ����������ϣ���ʽ��p1:v1;p2:v2��
     *
     * @param untitled ������ϣ���ʽ��p1:v1;p2:v2��
     */
    public void setUntitled(String untitled) {
        this.untitled = untitled;
    }

    /**
     * ��ȡԭ��
     *
     * @return original_price - ԭ��
     */
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    /**
     * ����ԭ��
     *
     * @param originalPrice ԭ��
     */
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * ��ȡ���ۼ۸�
     *
     * @return sell_price - ���ۼ۸�
     */
    public Integer getSellPrice() {
        return sellPrice;
    }

    /**
     * �������ۼ۸�
     *
     * @param sellPrice ���ۼ۸�
     */
    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * ��ȡ�ۿ�����
     *
     * @return discounts - �ۿ�����
     */
    public BigDecimal getDiscounts() {
        return discounts;
    }

    /**
     * �����ۿ�����
     *
     * @param discounts �ۿ�����
     */
    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    /**
     * ��ȡ���
     *
     * @return stock - ���
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * ���ÿ��
     *
     * @param stock ���
     */
    public void setStock(Integer stock) {
        this.stock = stock;
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
     * ��ȡsku״̬(1���ã�0���ã�-1ɾ��)
     *
     * @return status - sku״̬(1���ã�0���ã�-1ɾ��)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����sku״̬(1���ã�0���ã�-1ɾ��)
     *
     * @param status sku״̬(1���ã�0���ã�-1ɾ��)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}