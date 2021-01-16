package com.zr.yuegou_single.entity;

import java.util.Date;

public class ProductDesc {
    private Long productDescId;

    private Long productId;

    private Byte productDescStatus;

    private Date productDescCreatetime;

    private Date productDescUpdatetime;

    private String productDescCreateuser;

    private String productDescUpdateuser;

    private String productDescProductdesc;

    public Long getProductDescId() {
        return productDescId;
    }

    public void setProductDescId(Long productDescId) {
        this.productDescId = productDescId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Byte getProductDescStatus() {
        return productDescStatus;
    }

    public void setProductDescStatus(Byte productDescStatus) {
        this.productDescStatus = productDescStatus;
    }

    public Date getProductDescCreatetime() {
        return productDescCreatetime;
    }

    public void setProductDescCreatetime(Date productDescCreatetime) {
        this.productDescCreatetime = productDescCreatetime;
    }

    public Date getProductDescUpdatetime() {
        return productDescUpdatetime;
    }

    public void setProductDescUpdatetime(Date productDescUpdatetime) {
        this.productDescUpdatetime = productDescUpdatetime;
    }

    public String getProductDescCreateuser() {
        return productDescCreateuser;
    }

    public void setProductDescCreateuser(String productDescCreateuser) {
        this.productDescCreateuser = productDescCreateuser == null ? null : productDescCreateuser.trim();
    }

    public String getProductDescUpdateuser() {
        return productDescUpdateuser;
    }

    public void setProductDescUpdateuser(String productDescUpdateuser) {
        this.productDescUpdateuser = productDescUpdateuser == null ? null : productDescUpdateuser.trim();
    }

    public String getProductDescProductdesc() {
        return productDescProductdesc;
    }

    public void setProductDescProductdesc(String productDescProductdesc) {
        this.productDescProductdesc = productDescProductdesc == null ? null : productDescProductdesc.trim();
    }
}