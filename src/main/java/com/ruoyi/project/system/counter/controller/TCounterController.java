package com.ruoyi.project.system.counter.controller;

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
import com.ruoyi.project.system.counter.domain.TCounter;
import com.ruoyi.project.system.counter.service.ITCounterService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 吧台信息Controller
 * 
 */
@Controller
@RequestMapping("/system/counter")
public class TCounterController extends BaseController
{
    private String prefix = "system/counter";

    @Autowired
    private ITCounterService tCounterService;

    @RequiresPermissions("system:counter:view")
    @GetMapping()
    public String counter()
    {
        return prefix + "/counter";
    }

    /**
     * 查询吧台信息列表
     */
    @RequiresPermissions("system:counter:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TCounter tCounter)
    {
        startPage();
        List<TCounter> list = tCounterService.selectTCounterList(tCounter);
        return getDataTable(list);
    }

    /**
     * 导出吧台信息列表
     */
    @RequiresPermissions("system:counter:export")
    @Log(title = "吧台信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TCounter tCounter)
    {
        List<TCounter> list = tCounterService.selectTCounterList(tCounter);
        ExcelUtil<TCounter> util = new ExcelUtil<TCounter>(TCounter.class);
        return util.exportExcel(list, "吧台信息数据");
    }

    /**
     * 新增吧台信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存吧台信息
     */
    @RequiresPermissions("system:counter:add")
    @Log(title = "吧台信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TCounter tCounter)
    {
        return toAjax(tCounterService.insertTCounter(tCounter));
    }

    /**
     * 修改吧台信息
     */
    @RequiresPermissions("system:counter:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TCounter tCounter = tCounterService.selectTCounterById(id);
        mmap.put("tCounter", tCounter);
        return prefix + "/edit";
    }

    /**
     * 修改保存吧台信息
     */
    @RequiresPermissions("system:counter:edit")
    @Log(title = "吧台信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TCounter tCounter)
    {
        return toAjax(tCounterService.updateTCounter(tCounter));
    }

    /**
     * 删除吧台信息
     */
    @RequiresPermissions("system:counter:remove")
    @Log(title = "吧台信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tCounterService.deleteTCounterByIds(ids));
    }
}
