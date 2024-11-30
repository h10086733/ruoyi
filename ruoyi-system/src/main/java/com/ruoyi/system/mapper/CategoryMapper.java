package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Category;

/**
 * 商品分类Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-30
 */
public interface CategoryMapper 
{
    /**
     * 查询商品分类
     * 
     * @param id 商品分类主键
     * @return 商品分类
     */
    public Category selectCategoryById(Long id);

    /**
     * 查询商品分类列表
     * 
     * @param category 商品分类
     * @return 商品分类集合
     */
    public List<Category> selectCategoryList(Category category);

    /**
     * 新增商品分类
     * 
     * @param category 商品分类
     * @return 结果
     */
    public int insertCategory(Category category);

    /**
     * 修改商品分类
     * 
     * @param category 商品分类
     * @return 结果
     */
    public int updateCategory(Category category);

    /**
     * 删除商品分类
     * 
     * @param id 商品分类主键
     * @return 结果
     */
    public int deleteCategoryById(Long id);

    /**
     * 批量删除商品分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCategoryByIds(String[] ids);
}
