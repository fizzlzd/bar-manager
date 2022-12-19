package com.ruoyi.project.system.wine.controller;

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
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.wine.domain.TWine;
import com.ruoyi.project.system.wine.service.ITWineService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 酒类信息Controller
 * 
 */
@Controller
@RequestMapping("/system/wine")
public class TWineController extends BaseController
{
    private String prefix = "system/wine";

    @Autowired
    private ITWineService tWineService;

    @RequiresPermissions("system:wine:view")
    @GetMapping()
    public String wine()
    {
        return prefix + "/wine";
    }

    /**
     * 查询酒类信息列表
     */
    @RequiresPermissions("system:wine:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TWine tWine)
    {
        startPage();
        List<TWine> list = tWineService.selectTWineList(tWine);
        return getDataTable(list);
    }

    /**
     * 导出酒类信息列表
     */
    @RequiresPermissions("system:wine:export")
    @Log(title = "酒类信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TWine tWine)
    {
        List<TWine> list = tWineService.selectTWineList(tWine);
        ExcelUtil<TWine> util = new ExcelUtil<TWine>(TWine.class);
        return util.exportExcel(list, "酒类信息数据");
    }

    /**
     * 新增酒类信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存酒类信息
     */
    @RequiresPermissions("system:wine:add")
    @Log(title = "酒类信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TWine tWine)
    {
        return toAjax(tWineService.insertTWine(tWine));
    }

    /**
     * 修改酒类信息
     */
    @RequiresPermissions("system:wine:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TWine tWine = tWineService.selectTWineById(id);
        mmap.put("tWine", tWine);
        return prefix + "/edit";
    }

    /**
     * 修改保存酒类信息
     */
    @RequiresPermissions("system:wine:edit")
    @Log(title = "酒类信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TWine tWine)
    {
        return toAjax(tWineService.updateTWine(tWine));
    }

    /**
     * 删除酒类信息
     */
    @RequiresPermissions("system:wine:remove")
    @Log(title = "酒类信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tWineService.deleteTWineByIds(ids));
    }
}
