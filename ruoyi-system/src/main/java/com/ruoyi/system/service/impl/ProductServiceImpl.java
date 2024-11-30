package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProductMapper;
import com.ruoyi.system.domain.Product;
import com.ruoyi.system.service.IProductService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-30
 */
@Service
public class ProductServiceImpl implements IProductService 
{
    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询商品信息
     * 
     * @param id 商品信息主键
     * @return 商品信息
     */
    @Override
    public Product selectProductById(Long id)
    {
        return productMapper.selectProductById(id);
    }

    /**
     * 查询商品信息列表
     * 
     * @param product 商品信息
     * @return 商品信息
     */
    @Override
    public List<Product> selectProductList(Product product)
    {
        return productMapper.selectProductList(product);
    }

    /**
     * 新增商品信息
     * 
     * @param product 商品信息
     * @return 结果
     */
    @Override
    public int insertProduct(Product product)
    {
        return productMapper.insertProduct(product);
    }

    /**
     * 修改商品信息
     * 
     * @param product 商品信息
     * @return 结果
     */
    @Override
    public int updateProduct(Product product)
    {
        return productMapper.updateProduct(product);
    }

    /**
     * 批量删除商品信息
     * 
     * @param ids 需要删除的商品信息主键
     * @return 结果
     */
    @Override
    public int deleteProductByIds(String ids)
    {
        return productMapper.deleteProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品信息信息
     * 
     * @param id 商品信息主键
     * @return 结果
     */
    @Override
    public int deleteProductById(Long id)
    {
        return productMapper.deleteProductById(id);
    }
}
