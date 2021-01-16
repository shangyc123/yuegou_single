package com.zr.yuegou_single.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Long productId;

    private String productName;

    private BigDecimal productCostprice;

    private String productImage;

    private Long productTypeid;

    private String productTypename;

    private String productSalepoint;

    private BigDecimal productValue;

    private Byte productStatus;

    private Date productCreatetime;

    private Date productUpdatetime;

    private String productCreateuser;

    private String productUpdateuser;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getProductCostprice() {
        return productCostprice;
    }

    public void setProductCostprice(BigDecimal productCostprice) {
        this.productCostprice = productCostprice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage == null ? null : productImage.trim();
    }

    public Long getProductTypeid() {
        return productTypeid;
    }

    public void setProductTypeid(Long productTypeid) {
        this.productTypeid = productTypeid;
    }

    public String getProductTypename() {
        return productTypename;
    }

    public void setProductTypename(String productTypename) {
        this.productTypename = productTypename == null ? null : productTypename.trim();
    }

    public String getProductSalepoint() {
        return productSalepoint;
    }

    public void setProductSalepoint(String productSalepoint) {
        this.productSalepoint = productSalepoint == null ? null : productSalepoint.trim();
    }

    public BigDecimal getProductValue() {
        return productValue;
    }

    public void setProductValue(BigDecimal productValue) {
        this.productValue = productValue;
    }

    public Byte getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Byte productStatus) {
        this.productStatus = productStatus;
    }

    public Date getProductCreatetime() {
        return productCreatetime;
    }

    public void setProductCreatetime(Date productCreatetime) {
        this.productCreatetime = productCreatetime;
    }

    public Date getProductUpdatetime() {
        return productUpdatetime;
    }

    public void setProductUpdatetime(Date productUpdatetime) {
        this.productUpdatetime = productUpdatetime;
    }

    public String getProductCreateuser() {
        return productCreateuser;
    }

    public void setProductCreateuser(String productCreateuser) {
        this.productCreateuser = productCreateuser == null ? null : productCreateuser.trim();
    }

    public String getProductUpdateuser() {
        return productUpdateuser;
    }

    public void setProductUpdateuser(String productUpdateuser) {
        this.productUpdateuser = productUpdateuser == null ? null : productUpdateuser.trim();
    }
}