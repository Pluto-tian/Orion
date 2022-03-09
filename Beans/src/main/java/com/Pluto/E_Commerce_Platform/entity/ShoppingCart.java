package com.Pluto.E_Commerce_Platform.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "e_commerce_platform..shopping_cart")
public class ShoppingCart {
    /**
     * ����
     */
    @Id
    @Column(name = "cart_id")
    private Integer cartId;

    /**
     * ��ƷID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * skuID
     */
    @Column(name = "sku_id")
    private String skuId;

    /**
     * �û�ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * ���ﳵ��Ʒ����
     */
    @Column(name = "cart_num")
    private String cartNum;

    /**
     * ��ӹ��ﳵʱ��
     */
    @Column(name = "cart_time")
    private String cartTime;

    /**
     * ��ӹ��ﳵʱ��Ʒ�۸�
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * ѡ����ײ͵�����
     */
    @Column(name = "sku_props")
    private String skuProps;

    /**
     * ��ȡ����
     *
     * @return cart_id - ����
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * ��������
     *
     * @param cartId ����
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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
     * ��ȡ���ﳵ��Ʒ����
     *
     * @return cart_num - ���ﳵ��Ʒ����
     */
    public String getCartNum() {
        return cartNum;
    }

    /**
     * ���ù��ﳵ��Ʒ����
     *
     * @param cartNum ���ﳵ��Ʒ����
     */
    public void setCartNum(String cartNum) {
        this.cartNum = cartNum;
    }

    /**
     * ��ȡ��ӹ��ﳵʱ��
     *
     * @return cart_time - ��ӹ��ﳵʱ��
     */
    public String getCartTime() {
        return cartTime;
    }

    /**
     * ������ӹ��ﳵʱ��
     *
     * @param cartTime ��ӹ��ﳵʱ��
     */
    public void setCartTime(String cartTime) {
        this.cartTime = cartTime;
    }

    /**
     * ��ȡ��ӹ��ﳵʱ��Ʒ�۸�
     *
     * @return product_price - ��ӹ��ﳵʱ��Ʒ�۸�
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * ������ӹ��ﳵʱ��Ʒ�۸�
     *
     * @param productPrice ��ӹ��ﳵʱ��Ʒ�۸�
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * ��ȡѡ����ײ͵�����
     *
     * @return sku_props - ѡ����ײ͵�����
     */
    public String getSkuProps() {
        return skuProps;
    }

    /**
     * ����ѡ����ײ͵�����
     *
     * @param skuProps ѡ����ײ͵�����
     */
    public void setSkuProps(String skuProps) {
        this.skuProps = skuProps;
    }
}