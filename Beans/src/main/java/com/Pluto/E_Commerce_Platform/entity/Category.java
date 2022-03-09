package com.Pluto.E_Commerce_Platform.entity;

import javax.persistence.*;

@Table(name = "e_commerce_platform..category")
public class Category {
    /**
     * ���� ����id����
     */
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * �������� ��������
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * ����㼶 ��������ͣ�
1:һ�������
2:��������
3:����С����
     */
    @Column(name = "category_level")
    private Integer categoryLevel;

    /**
     * ���㼶id ��id ��һ��������id��1��������Ϊ0�����������ֱ�������һ��
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * ͼ�� logo
     */
    @Column(name = "category_icon")
    private String categoryIcon;

    /**
     * �ں�
     */
    @Column(name = "category_slogan")
    private String categorySlogan;

    /**
     * ����ͼ
     */
    @Column(name = "category_pic")
    private String categoryPic;

    /**
     * ������ɫ
     */
    @Column(name = "category_bg_color")
    private String categoryBgColor;

    /**
     * ��ȡ���� ����id����
     *
     * @return category_id - ���� ����id����
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * �������� ����id����
     *
     * @param categoryId ���� ����id����
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * ��ȡ�������� ��������
     *
     * @return category_name - �������� ��������
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * ���÷������� ��������
     *
     * @param categoryName �������� ��������
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * ��ȡ����㼶 ��������ͣ�
1:һ�������
2:��������
3:����С����
     *
     * @return category_level - ����㼶 ��������ͣ�
1:һ�������
2:��������
3:����С����
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * ���÷���㼶 ��������ͣ�
1:һ�������
2:��������
3:����С����
     *
     * @param categoryLevel ����㼶 ��������ͣ�
1:һ�������
2:��������
3:����С����
     */
    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * ��ȡ���㼶id ��id ��һ��������id��1��������Ϊ0�����������ֱ�������һ��
     *
     * @return parent_id - ���㼶id ��id ��һ��������id��1��������Ϊ0�����������ֱ�������һ��
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * ���ø��㼶id ��id ��һ��������id��1��������Ϊ0�����������ֱ�������һ��
     *
     * @param parentId ���㼶id ��id ��һ��������id��1��������Ϊ0�����������ֱ�������һ��
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * ��ȡͼ�� logo
     *
     * @return category_icon - ͼ�� logo
     */
    public String getCategoryIcon() {
        return categoryIcon;
    }

    /**
     * ����ͼ�� logo
     *
     * @param categoryIcon ͼ�� logo
     */
    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    /**
     * ��ȡ�ں�
     *
     * @return category_slogan - �ں�
     */
    public String getCategorySlogan() {
        return categorySlogan;
    }

    /**
     * ���ÿں�
     *
     * @param categorySlogan �ں�
     */
    public void setCategorySlogan(String categorySlogan) {
        this.categorySlogan = categorySlogan;
    }

    /**
     * ��ȡ����ͼ
     *
     * @return category_pic - ����ͼ
     */
    public String getCategoryPic() {
        return categoryPic;
    }

    /**
     * ���÷���ͼ
     *
     * @param categoryPic ����ͼ
     */
    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    /**
     * ��ȡ������ɫ
     *
     * @return category_bg_color - ������ɫ
     */
    public String getCategoryBgColor() {
        return categoryBgColor;
    }

    /**
     * ���ñ�����ɫ
     *
     * @param categoryBgColor ������ɫ
     */
    public void setCategoryBgColor(String categoryBgColor) {
        this.categoryBgColor = categoryBgColor;
    }
}