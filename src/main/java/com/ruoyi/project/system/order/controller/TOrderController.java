package com.ruoyi.project.system.order.controller;

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
import com.ruoyi.project.system.order.domain.TOrder;
import com.ruoyi.project.system.order.service.ITOrderService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 消费记录信息Controller
 * 
 */
@Controller
@RequestMapping("/system/order")
public class TOrderController extends BaseController
{
    private String prefix = "system/order";

    @Autowired
    private ITOrderService tOrderService;

    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询消费记录信息列表
     */
    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TOrder tOrder)
    {
        startPage();
        List<TOrder> list = tOrderService.selectTOrderList(tOrder);
        return getDataTable(list);
    }

    /**
     * 导出消费记录信息列表
     */
    @RequiresPermissions("system:order:export")
    @Log(title = "消费记录信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TOrder tOrder)
    {
        List<TOrder> list = tOrderService.selectTOrderList(tOrder);
        ExcelUtil<TOrder> util = new ExcelUtil<TOrder>(TOrder.class);
        return util.exportExcel(list, "消费记录信息数据");
    }

    /**
     * 新增消费记录信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存消费记录信息
     */
    @RequiresPermissions("system:order:add")
    @Log(title = "消费记录信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TOrder tOrder)
    {
        return toAjax(tOrderService.insertTOrder(tOrder));
    }

    /**
     * 修改消费记录信息
     */
    @RequiresPermissions("system:order:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TOrder tOrder = tOrderService.selectTOrderById(id);
        mmap.put("tOrder", tOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存消费记录信息
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "消费记录信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TOrder tOrder)
    {
        return toAjax(tOrderService.updateTOrder(tOrder));
    }

    /**
     * 删除消费记录信息
     */
    @RequiresPermissions("system:order:remove")
    @Log(title = "消费记录信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tOrderService.deleteTOrderByIds(ids));
    }
}
