package com.zr.yuegou_single.entity;

import java.util.Date;

public class ProductType {
    private Long productTypeId;

    private String productTypeName;

    private Long productId;

    private Byte productTypeStatus;

    private Date productTypeCreatetime;

    private Date productTypeUpdatetime;

    private String productTypeCreateuser;

    private String productTypeUpdateuser;

    public Long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Byte getProductTypeStatus() {
        return productTypeStatus;
    }

    public void setProductTypeStatus(Byte productTypeStatus) {
        this.productTypeStatus = productTypeStatus;
    }

    public Date getProductTypeCreatetime() {
        return productTypeCreatetime;
    }

    public void setProductTypeCreatetime(Date productTypeCreatetime) {
        this.productTypeCreatetime = productTypeCreatetime;
    }

    public Date getProductTypeUpdatetime() {
        return productTypeUpdatetime;
    }

    public void setProductTypeUpdatetime(Date productTypeUpdatetime) {
        this.productTypeUpdatetime = productTypeUpdatetime;
    }

    public String getProductTypeCreateuser() {
        return productTypeCreateuser;
    }

    public void setProductTypeCreateuser(String productTypeCreateuser) {
        this.productTypeCreateuser = productTypeCreateuser == null ? null : productTypeCreateuser.trim();
    }

    public String getProductTypeUpdateuser() {
        return productTypeUpdateuser;
    }

    public void setProductTypeUpdateuser(String productTypeUpdateuser) {
        this.productTypeUpdateuser = productTypeUpdateuser == null ? null : productTypeUpdateuser.trim();
    }
}