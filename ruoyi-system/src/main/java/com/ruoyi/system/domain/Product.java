package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品信息对象 product
 * 
 * @author ruoyi
 * @date 2024-11-30
 */
public class Product extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品ID */
    private Long id;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String name;

    /** 商品描述 */
    @Excel(name = "商品描述")
    private String description;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal price;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private Long stockQuantity;

    /** 商品分类ID */
    @Excel(name = "商品分类ID")
    private Long categoryId;

    /** 商品编码，唯一标识商品 */
    @Excel(name = "商品编码，唯一标识商品")
    private String productCode;

    /** 商品图片URL */
    @Excel(name = "商品图片URL")
    private String imageUrl;

    /** 库存预警阈值，低于此数量时触发预警 */
    @Excel(name = "库存预警阈值，低于此数量时触发预警")
    private Long stockWarningThreshold;

    /** 商品状态 1：正常 0：下架 */
    @Excel(name = "商品状态 1：正常 0：下架")
    private Integer status;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setStockQuantity(Long stockQuantity) 
    {
        this.stockQuantity = stockQuantity;
    }

    public Long getStockQuantity() 
    {
        return stockQuantity;
    }

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductCode() 
    {
        return productCode;
    }

    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }

    public void setStockWarningThreshold(Long stockWarningThreshold) 
    {
        this.stockWarningThreshold = stockWarningThreshold;
    }

    public Long getStockWarningThreshold() 
    {
        return stockWarningThreshold;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("description", getDescription())
            .append("price", getPrice())
            .append("stockQuantity", getStockQuantity())
            .append("categoryId", getCategoryId())
            .append("productCode", getProductCode())
            .append("imageUrl", getImageUrl())
            .append("stockWarningThreshold", getStockWarningThreshold())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
