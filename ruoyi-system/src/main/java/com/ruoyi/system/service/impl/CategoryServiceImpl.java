package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CategoryMapper;
import com.ruoyi.system.domain.Category;
import com.ruoyi.system.service.ICategoryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-30
 */
@Service
public class CategoryServiceImpl implements ICategoryService 
{
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查询商品分类
     * 
     * @param id 商品分类主键
     * @return 商品分类
     */
    @Override
    public Category selectCategoryById(Long id)
    {
        return categoryMapper.selectCategoryById(id);
    }

    /**
     * 查询商品分类列表
     * 
     * @param category 商品分类
     * @return 商品分类
     */
    @Override
    public List<Category> selectCategoryList(Category category)
    {
        return categoryMapper.selectCategoryList(category);
    }

    /**
     * 新增商品分类
     * 
     * @param category 商品分类
     * @return 结果
     */
    @Override
    public int insertCategory(Category category)
    {
        return categoryMapper.insertCategory(category);
    }

    /**
     * 修改商品分类
     * 
     * @param category 商品分类
     * @return 结果
     */
    @Override
    public int updateCategory(Category category)
    {
        return categoryMapper.updateCategory(category);
    }

    /**
     * 批量删除商品分类
     * 
     * @param ids 需要删除的商品分类主键
     * @return 结果
     */
    @Override
    public int deleteCategoryByIds(String ids)
    {
        return categoryMapper.deleteCategoryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品分类信息
     * 
     * @param id 商品分类主键
     * @return 结果
     */
    @Override
    public int deleteCategoryById(Long id)
    {
        return categoryMapper.deleteCategoryById(id);
    }
}
