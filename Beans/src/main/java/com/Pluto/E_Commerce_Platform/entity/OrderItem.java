package com.Pluto.E_Commerce_Platform.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "e_commerce_platform..order_item")
public class OrderItem {
    /**
     * ������ID
     */
    @Id
    @Column(name = "item_id")
    private String itemId;

    /**
     * ����ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * ��ƷID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * ��Ʒ����
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * ��ƷͼƬ
     */
    @Column(name = "product_img")
    private String productImg;

    /**
     * skuID
     */
    @Column(name = "sku_id")
    private String skuId;

    /**
     * sku����
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * ��Ʒ�۸�
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * ��������
     */
    @Column(name = "buy_counts")
    private Integer buyCounts;

    /**
     * ��Ʒ�ܽ��
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * ���빺�ﳵʱ��
     */
    @Column(name = "basket_date")
    private Date basketDate;

    /**
     * ����ʱ��
     */
    @Column(name = "buy_time")
    private Date buyTime;

    /**
     * ����״̬�� 0 δ����  1 ������
     */
    @Column(name = "is_comment")
    private Integer isComment;

    /**
     * ��ȡ������ID
     *
     * @return item_id - ������ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * ���ö�����ID
     *
     * @param itemId ������ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * ��ȡ����ID
     *
     * @return order_id - ����ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * ���ö���ID
     *
     * @param orderId ����ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * ��ȡ��ƷID
     *
     * @return product_id - ��ƷID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * ������ƷID
     *
     * @param productId ��ƷID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return product_name - ��Ʒ����
     */
    public String getProductName() {
        return productName;
    }

    /**
     * ������Ʒ����
     *
     * @param productName ��Ʒ����
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * ��ȡ��ƷͼƬ
     *
     * @return product_img - ��ƷͼƬ
     */
    public String getProductImg() {
        return productImg;
    }

    /**
     * ������ƷͼƬ
     *
     * @param productImg ��ƷͼƬ
     */
    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    /**
     * ��ȡskuID
     *
     * @return sku_id - skuID
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * ����skuID
     *
     * @param skuId skuID
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
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
     * ��ȡ��Ʒ�۸�
     *
     * @return product_price - ��Ʒ�۸�
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * ������Ʒ�۸�
     *
     * @param productPrice ��Ʒ�۸�
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * ��ȡ��������
     *
     * @return buy_counts - ��������
     */
    public Integer getBuyCounts() {
        return buyCounts;
    }

    /**
     * ���ù�������
     *
     * @param buyCounts ��������
     */
    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    /**
     * ��ȡ��Ʒ�ܽ��
     *
     * @return total_amount - ��Ʒ�ܽ��
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * ������Ʒ�ܽ��
     *
     * @param totalAmount ��Ʒ�ܽ��
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * ��ȡ���빺�ﳵʱ��
     *
     * @return basket_date - ���빺�ﳵʱ��
     */
    public Date getBasketDate() {
        return basketDate;
    }

    /**
     * ���ü��빺�ﳵʱ��
     *
     * @param basketDate ���빺�ﳵʱ��
     */
    public void setBasketDate(Date basketDate) {
        this.basketDate = basketDate;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return buy_time - ����ʱ��
     */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
     * ���ù���ʱ��
     *
     * @param buyTime ����ʱ��
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * ��ȡ����״̬�� 0 δ����  1 ������
     *
     * @return is_comment - ����״̬�� 0 δ����  1 ������
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * ��������״̬�� 0 δ����  1 ������
     *
     * @param isComment ����״̬�� 0 δ����  1 ������
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }
}