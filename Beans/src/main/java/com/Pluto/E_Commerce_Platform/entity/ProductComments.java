package com.Pluto.E_Commerce_Platform.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "e_commerce_platform..product_comments")
public class ProductComments {
    /**
     * ID
     */
    @Id
    @Column(name = "comm_id")
    private String commId;

    /**
     * ��Ʒid
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * ��Ʒ����
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * ������(��Ʒ����)ID ��Ϊ��
     */
    @Column(name = "order_item_id")
    private String orderItemId;

    /**
     * �����û�id �û���������
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * �Ƿ�������1:�ǣ�0:��
     */
    @Column(name = "is_anonymous")
    private Integer isAnonymous;

    /**
     * �������ͣ�1������0������-1������
     */
    @Column(name = "comm_type")
    private Integer commType;

    /**
     * ���۵ȼ� 1������ 2������ 3������
     */
    @Column(name = "comm_level")
    private Integer commLevel;

    /**
     * ��������
     */
    @Column(name = "comm_content")
    private String commContent;

    /**
     * ����ɹͼ(JSON {img1:url1,img2:url2}  )
     */
    @Column(name = "comm_imgs")
    private String commImgs;

    /**
     * ����ʱ�� ��Ϊ��
     */
    @Column(name = "sepc_name")
    private Date sepcName;

    /**
     * �Ƿ�ظ���0:δ�ظ���1:�ѻظ���
     */
    @Column(name = "reply_status")
    private Integer replyStatus;

    /**
     * �ظ�����
     */
    @Column(name = "reply_content")
    private String replyContent;

    /**
     * �ظ�ʱ��
     */
    @Column(name = "reply_time")
    private Date replyTime;

    /**
     * �Ƿ���ʾ��1:�ǣ�0:��
     */
    @Column(name = "is_show")
    private Integer isShow;

    /**
     * ��ȡID
     *
     * @return comm_id - ID
     */
    public String getCommId() {
        return commId;
    }

    /**
     * ����ID
     *
     * @param commId ID
     */
    public void setCommId(String commId) {
        this.commId = commId;
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
     * ��ȡ������(��Ʒ����)ID ��Ϊ��
     *
     * @return order_item_id - ������(��Ʒ����)ID ��Ϊ��
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * ���ö�����(��Ʒ����)ID ��Ϊ��
     *
     * @param orderItemId ������(��Ʒ����)ID ��Ϊ��
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * ��ȡ�����û�id �û���������
     *
     * @return user_id - �����û�id �û���������
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���������û�id �û���������
     *
     * @param userId �����û�id �û���������
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�Ƿ�������1:�ǣ�0:��
     *
     * @return is_anonymous - �Ƿ�������1:�ǣ�0:��
     */
    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    /**
     * �����Ƿ�������1:�ǣ�0:��
     *
     * @param isAnonymous �Ƿ�������1:�ǣ�0:��
     */
    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    /**
     * ��ȡ�������ͣ�1������0������-1������
     *
     * @return comm_type - �������ͣ�1������0������-1������
     */
    public Integer getCommType() {
        return commType;
    }

    /**
     * �����������ͣ�1������0������-1������
     *
     * @param commType �������ͣ�1������0������-1������
     */
    public void setCommType(Integer commType) {
        this.commType = commType;
    }

    /**
     * ��ȡ���۵ȼ� 1������ 2������ 3������
     *
     * @return comm_level - ���۵ȼ� 1������ 2������ 3������
     */
    public Integer getCommLevel() {
        return commLevel;
    }

    /**
     * �������۵ȼ� 1������ 2������ 3������
     *
     * @param commLevel ���۵ȼ� 1������ 2������ 3������
     */
    public void setCommLevel(Integer commLevel) {
        this.commLevel = commLevel;
    }

    /**
     * ��ȡ��������
     *
     * @return comm_content - ��������
     */
    public String getCommContent() {
        return commContent;
    }

    /**
     * ������������
     *
     * @param commContent ��������
     */
    public void setCommContent(String commContent) {
        this.commContent = commContent;
    }

    /**
     * ��ȡ����ɹͼ(JSON {img1:url1,img2:url2}  )
     *
     * @return comm_imgs - ����ɹͼ(JSON {img1:url1,img2:url2}  )
     */
    public String getCommImgs() {
        return commImgs;
    }

    /**
     * ��������ɹͼ(JSON {img1:url1,img2:url2}  )
     *
     * @param commImgs ����ɹͼ(JSON {img1:url1,img2:url2}  )
     */
    public void setCommImgs(String commImgs) {
        this.commImgs = commImgs;
    }

    /**
     * ��ȡ����ʱ�� ��Ϊ��
     *
     * @return sepc_name - ����ʱ�� ��Ϊ��
     */
    public Date getSepcName() {
        return sepcName;
    }

    /**
     * ��������ʱ�� ��Ϊ��
     *
     * @param sepcName ����ʱ�� ��Ϊ��
     */
    public void setSepcName(Date sepcName) {
        this.sepcName = sepcName;
    }

    /**
     * ��ȡ�Ƿ�ظ���0:δ�ظ���1:�ѻظ���
     *
     * @return reply_status - �Ƿ�ظ���0:δ�ظ���1:�ѻظ���
     */
    public Integer getReplyStatus() {
        return replyStatus;
    }

    /**
     * �����Ƿ�ظ���0:δ�ظ���1:�ѻظ���
     *
     * @param replyStatus �Ƿ�ظ���0:δ�ظ���1:�ѻظ���
     */
    public void setReplyStatus(Integer replyStatus) {
        this.replyStatus = replyStatus;
    }

    /**
     * ��ȡ�ظ�����
     *
     * @return reply_content - �ظ�����
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * ���ûظ�����
     *
     * @param replyContent �ظ�����
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    /**
     * ��ȡ�ظ�ʱ��
     *
     * @return reply_time - �ظ�ʱ��
     */
    public Date getReplyTime() {
        return replyTime;
    }

    /**
     * ���ûظ�ʱ��
     *
     * @param replyTime �ظ�ʱ��
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * ��ȡ�Ƿ���ʾ��1:�ǣ�0:��
     *
     * @return is_show - �Ƿ���ʾ��1:�ǣ�0:��
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * �����Ƿ���ʾ��1:�ǣ�0:��
     *
     * @param isShow �Ƿ���ʾ��1:�ǣ�0:��
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }
}