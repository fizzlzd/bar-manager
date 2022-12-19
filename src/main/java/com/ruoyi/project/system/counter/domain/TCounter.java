package com.ruoyi.project.system.counter.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 吧台信息对象 t_counter
 * 
 * @author ry
 * @date 2022-12-07
 */
public class TCounter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 吧台名称 */
    @Excel(name = "吧台名称")
    private String counterName;

    /** 服务员 */
    @Excel(name = "服务员")
    private String waiter;

    /** 基础套餐 */
    @Excel(name = "基础套餐")
    private String basic;

    /** 使用状态 */
    @Excel(name = "使用状态")
    private String state;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setCounterName(String counterName)
    {
        this.counterName = counterName;
    }

    public String getCounterName()
    {
        return counterName;
    }
    public void setWaiter(String waiter)
    {
        this.waiter = waiter;
    }

    public String getWaiter()
    {
        return waiter;
    }
    public void setBasic(String basic)
    {
        this.basic = basic;
    }

    public String getBasic()
    {
        return basic;
    }
    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("counterName", getCounterName())
            .append("waiter", getWaiter())
            .append("basic", getBasic())
            .append("state", getState())
            .toString();
    }
}
