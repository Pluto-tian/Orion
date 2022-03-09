package com.Pluto.E_Commerce_Platform.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "e_commerce_platform..orders")
public class Orders {
    /**
     * ����ID ͬʱҲ�Ƕ������
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * �û�ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * ��Ʒ���ƣ������Ʒ��,������
     */
    private String untitled;

    /**
     * �ջ��˿���
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * �ջ����ֻ��ſ���
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * �ջ���ַ����
     */
    @Column(name = "receiver_address")
    private String receiverAddress;

    /**
     * �����ܼ۸�
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * ʵ��֧���ܼ۸�
     */
    @Column(name = "actual_amount")
    private Integer actualAmount;

    /**
     * ֧����ʽ 1:΢�� 2:֧����
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * ������ע
     */
    @Column(name = "order_remark")
    private String orderRemark;

    /**
     * ����״̬ 1:������ 2:������ 3:���ջ� 4:������ 5:����� 6:�ѹر�
     */
    private String status;

    /**
     * ���ͷ�ʽ
     */
    @Column(name = "delivery_type")
    private String deliveryType;

    /**
     * ��������
     */
    @Column(name = "delivery_flow_id")
    private String deliveryFlowId;

    /**
     * �����˷� Ĭ�Ͽ���Ϊ�㣬�������
     */
    @Column(name = "order_freight")
    private BigDecimal orderFreight;

    /**
     * �߼�ɾ��״̬ 1: ɾ�� 0:δɾ��
     */
    @Column(name = "delete_status")
    private Integer deleteStatus;

    /**
     * ����ʱ�䣨�ɽ�ʱ�䣩
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ����ʱ��
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * ����ʱ��
     */
    @Column(name = "delivery_time")
    private Date deliveryTime;

    /**
     * ���ʱ��
     */
    @Column(name = "flish_time")
    private Date flishTime;

    /**
     * ȡ��ʱ��
     */
    @Column(name = "cancel_time")
    private Date cancelTime;

    /**
     * �����ر�����1-��ʱδ֧�� 2-�˿�ر� 4-���ȡ�� 15-��ͨ�����������
     */
    @Column(name = "close_type")
    private Integer closeType;

    /**
     * ��ȡ����ID ͬʱҲ�Ƕ������
     *
     * @return order_id - ����ID ͬʱҲ�Ƕ������
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * ���ö���ID ͬʱҲ�Ƕ������
     *
     * @param orderId ����ID ͬʱҲ�Ƕ������
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * ��ȡ��Ʒ���ƣ������Ʒ��,������
     *
     * @return untitled - ��Ʒ���ƣ������Ʒ��,������
     */
    public String getUntitled() {
        return untitled;
    }

    /**
     * ���ò�Ʒ���ƣ������Ʒ��,������
     *
     * @param untitled ��Ʒ���ƣ������Ʒ��,������
     */
    public void setUntitled(String untitled) {
        this.untitled = untitled;
    }

    /**
     * ��ȡ�ջ��˿���
     *
     * @return receiver_name - �ջ��˿���
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * �����ջ��˿���
     *
     * @param receiverName �ջ��˿���
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * ��ȡ�ջ����ֻ��ſ���
     *
     * @return receiver_mobile - �ջ����ֻ��ſ���
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * �����ջ����ֻ��ſ���
     *
     * @param receiverMobile �ջ����ֻ��ſ���
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * ��ȡ�ջ���ַ����
     *
     * @return receiver_address - �ջ���ַ����
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * �����ջ���ַ����
     *
     * @param receiverAddress �ջ���ַ����
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * ��ȡ�����ܼ۸�
     *
     * @return total_amount - �����ܼ۸�
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * ���ö����ܼ۸�
     *
     * @param totalAmount �����ܼ۸�
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * ��ȡʵ��֧���ܼ۸�
     *
     * @return actual_amount - ʵ��֧���ܼ۸�
     */
    public Integer getActualAmount() {
        return actualAmount;
    }

    /**
     * ����ʵ��֧���ܼ۸�
     *
     * @param actualAmount ʵ��֧���ܼ۸�
     */
    public void setActualAmount(Integer actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * ��ȡ֧����ʽ 1:΢�� 2:֧����
     *
     * @return pay_type - ֧����ʽ 1:΢�� 2:֧����
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * ����֧����ʽ 1:΢�� 2:֧����
     *
     * @param payType ֧����ʽ 1:΢�� 2:֧����
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * ��ȡ������ע
     *
     * @return order_remark - ������ע
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * ���ö�����ע
     *
     * @param orderRemark ������ע
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    /**
     * ��ȡ����״̬ 1:������ 2:������ 3:���ջ� 4:������ 5:����� 6:�ѹر�
     *
     * @return status - ����״̬ 1:������ 2:������ 3:���ջ� 4:������ 5:����� 6:�ѹر�
     */
    public String getStatus() {
        return status;
    }

    /**
     * ���ö���״̬ 1:������ 2:������ 3:���ջ� 4:������ 5:����� 6:�ѹر�
     *
     * @param status ����״̬ 1:������ 2:������ 3:���ջ� 4:������ 5:����� 6:�ѹر�
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ���ͷ�ʽ
     *
     * @return delivery_type - ���ͷ�ʽ
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * �������ͷ�ʽ
     *
     * @param deliveryType ���ͷ�ʽ
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * ��ȡ��������
     *
     * @return delivery_flow_id - ��������
     */
    public String getDeliveryFlowId() {
        return deliveryFlowId;
    }

    /**
     * ������������
     *
     * @param deliveryFlowId ��������
     */
    public void setDeliveryFlowId(String deliveryFlowId) {
        this.deliveryFlowId = deliveryFlowId;
    }

    /**
     * ��ȡ�����˷� Ĭ�Ͽ���Ϊ�㣬�������
     *
     * @return order_freight - �����˷� Ĭ�Ͽ���Ϊ�㣬�������
     */
    public BigDecimal getOrderFreight() {
        return orderFreight;
    }

    /**
     * ���ö����˷� Ĭ�Ͽ���Ϊ�㣬�������
     *
     * @param orderFreight �����˷� Ĭ�Ͽ���Ϊ�㣬�������
     */
    public void setOrderFreight(BigDecimal orderFreight) {
        this.orderFreight = orderFreight;
    }

    /**
     * ��ȡ�߼�ɾ��״̬ 1: ɾ�� 0:δɾ��
     *
     * @return delete_status - �߼�ɾ��״̬ 1: ɾ�� 0:δɾ��
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * �����߼�ɾ��״̬ 1: ɾ�� 0:δɾ��
     *
     * @param deleteStatus �߼�ɾ��״̬ 1: ɾ�� 0:δɾ��
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * ��ȡ����ʱ�䣨�ɽ�ʱ�䣩
     *
     * @return create_time - ����ʱ�䣨�ɽ�ʱ�䣩
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ�䣨�ɽ�ʱ�䣩
     *
     * @param createTime ����ʱ�䣨�ɽ�ʱ�䣩
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
     * ��ȡ����ʱ��
     *
     * @return pay_time - ����ʱ��
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param payTime ����ʱ��
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return delivery_time - ����ʱ��
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * ���÷���ʱ��
     *
     * @param deliveryTime ����ʱ��
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * ��ȡ���ʱ��
     *
     * @return flish_time - ���ʱ��
     */
    public Date getFlishTime() {
        return flishTime;
    }

    /**
     * �������ʱ��
     *
     * @param flishTime ���ʱ��
     */
    public void setFlishTime(Date flishTime) {
        this.flishTime = flishTime;
    }

    /**
     * ��ȡȡ��ʱ��
     *
     * @return cancel_time - ȡ��ʱ��
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * ����ȡ��ʱ��
     *
     * @param cancelTime ȡ��ʱ��
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * ��ȡ�����ر�����1-��ʱδ֧�� 2-�˿�ر� 4-���ȡ�� 15-��ͨ�����������
     *
     * @return close_type - �����ر�����1-��ʱδ֧�� 2-�˿�ر� 4-���ȡ�� 15-��ͨ�����������
     */
    public Integer getCloseType() {
        return closeType;
    }

    /**
     * ���ö����ر�����1-��ʱδ֧�� 2-�˿�ر� 4-���ȡ�� 15-��ͨ�����������
     *
     * @param closeType �����ر�����1-��ʱδ֧�� 2-�˿�ر� 4-���ȡ�� 15-��ͨ�����������
     */
    public void setCloseType(Integer closeType) {
        this.closeType = closeType;
    }
}