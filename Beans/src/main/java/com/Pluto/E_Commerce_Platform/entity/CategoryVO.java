package com.Pluto.E_Commerce_Platform.entity;

import javax.persistence.*;
import java.util.List;


public class CategoryVO {

    @Id
    @Column(name = "category_id")
    private Integer categoryId;


    @Column(name = "category_name")
    private String categoryName;


    @Column(name = "category_level")
    private Integer categoryLevel;


    @Column(name = "parent_id")
    private Integer parentId;


    @Column(name = "category_icon")
    private String categoryIcon;


    @Column(name = "category_slogan")
    private String categorySlogan;


    @Column(name = "category_pic")
    private String categoryPic;


    @Column(name = "category_bg_color")
    private String categoryBgColor;

    private List<Category> categoryList;

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }



    public Integer getCategoryId() {
        return categoryId;
    }


    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


    public String getCategoryName() {
        return categoryName;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public Integer getCategoryLevel() {
        return categoryLevel;
    }


    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }


    public Integer getParentId() {
        return parentId;
    }


    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


    public String getCategoryIcon() {
        return categoryIcon;
    }


    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }


    public String getCategorySlogan() {
        return categorySlogan;
    }


    public void setCategorySlogan(String categorySlogan) {
        this.categorySlogan = categorySlogan;
    }


    public String getCategoryPic() {
        return categoryPic;
    }


    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    public String getCategoryBgColor() {
        return categoryBgColor;
    }


    public void setCategoryBgColor(String categoryBgColor) {
        this.categoryBgColor = categoryBgColor;
    }
}