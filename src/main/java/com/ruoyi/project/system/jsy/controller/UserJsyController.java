package com.ruoyi.project.system.jsy.controller;

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
import com.ruoyi.project.system.jsy.domain.UserJsy;
import com.ruoyi.project.system.jsy.service.IUserJsyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 驾驶员管理Controller
 * 
 * @author rcx
 * @date 2022-04-01
 */
@Controller
@RequestMapping("/system/jsy")
public class UserJsyController extends BaseController
{
    private String prefix = "system/jsy";

    @Autowired
    private IUserJsyService userJsyService;

    @RequiresPermissions("system:jsy:view")
    @GetMapping()
    public String jsy()
    {
        return prefix + "/jsy";
    }

    /**
     * 查询驾驶员管理列表
     */
    @RequiresPermissions("system:jsy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(UserJsy userJsy)
    {
        startPage();
        List<UserJsy> list = userJsyService.selectUserJsyList(userJsy);
        return getDataTable(list);
    }

    /**
     * 导出驾驶员管理列表
     */
    @RequiresPermissions("system:jsy:export")
    @Log(title = "驾驶员管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserJsy userJsy)
    {
        List<UserJsy> list = userJsyService.selectUserJsyList(userJsy);
        ExcelUtil<UserJsy> util = new ExcelUtil<UserJsy>(UserJsy.class);
        return util.exportExcel(list, "驾驶员管理数据");
    }

    /**
     * 新增驾驶员管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存驾驶员管理
     */
    @RequiresPermissions("system:jsy:add")
    @Log(title = "驾驶员管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(UserJsy userJsy)
    {
        return toAjax(userJsyService.insertUserJsy(userJsy));
    }

    /**
     * 修改驾驶员管理
     */
    @RequiresPermissions("system:jsy:edit")
    @GetMapping("/edit/{jsyId}")
    public String edit(@PathVariable("jsyId") Long jsyId, ModelMap mmap)
    {
        UserJsy userJsy = userJsyService.selectUserJsyByJsyId(jsyId);
        mmap.put("userJsy", userJsy);
        return prefix + "/edit";
    }

    /**
     * 修改保存驾驶员管理
     */
    @RequiresPermissions("system:jsy:edit")
    @Log(title = "驾驶员管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(UserJsy userJsy)
    {
        return toAjax(userJsyService.updateUserJsy(userJsy));
    }

    /**
     * 删除驾驶员管理
     */
    @RequiresPermissions("system:jsy:remove")
    @Log(title = "驾驶员管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(userJsyService.deleteUserJsyByJsyIds(ids));
    }
}
