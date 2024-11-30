package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Product;
import com.ruoyi.system.service.IProductService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品信息Controller
 * 
 * @author ruoyi
 * @date 2024-11-30
 */
@Controller
@RequestMapping("/system/product")
public class ProductController extends BaseController
{
    private String prefix = "system/product";

    @Autowired
    private IProductService productService;

    @RequiresPermissions("system:product:view")
    @GetMapping()
    public String product()
    {
        return prefix + "/product";
    }

    /**
     * 查询商品信息列表
     */
    @RequiresPermissions("system:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Product product)
    {
        startPage();
        List<Product> list = productService.selectProductList(product);
        return getDataTable(list);
    }

    /**
     * 导出商品信息列表
     */
    @RequiresPermissions("system:product:export")
    @Log(title = "商品信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Product product)
    {
        List<Product> list = productService.selectProductList(product);
        ExcelUtil<Product> util = new ExcelUtil<Product>(Product.class);
        return util.exportExcel(list, "商品信息数据");
    }

    /**
     * 新增商品信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品信息
     */
    @RequiresPermissions("system:product:add")
    @Log(title = "商品信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Product product)
    {
        return toAjax(productService.insertProduct(product));
    }

    /**
     * 修改商品信息
     */
    @RequiresPermissions("system:product:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Product product = productService.selectProductById(id);
        mmap.put("product", product);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品信息
     */
    @RequiresPermissions("system:product:edit")
    @Log(title = "商品信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Product product)
    {
        return toAjax(productService.updateProduct(product));
    }

    /**
     * 删除商品信息
     */
    @RequiresPermissions("system:product:remove")
    @Log(title = "商品信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(productService.deleteProductByIds(ids));
    }
}
