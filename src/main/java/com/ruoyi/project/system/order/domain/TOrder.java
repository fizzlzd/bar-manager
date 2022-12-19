package com.ruoyi.project.system.order.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 消费记录信息对象 t_order
 * 
 * @author ry
 * @date 2022-12-07
 */
public class TOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderCode;

    /** 吧台名称 */
    @Excel(name = "吧台名称")
    private String counterName;

    /** 消费金额 */
    @Excel(name = "消费金额")
    private BigDecimal price;

    /** 人数 */
    @Excel(name = "人数")
    private Long count;

    /** 消费日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "消费日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setOrderCode(String orderCode)
    {
        this.orderCode = orderCode;
    }

    public String getOrderCode()
    {
        return orderCode;
    }
    public void setCounterName(String counterName)
    {
        this.counterName = counterName;
    }

    public String getCounterName()
    {
        return counterName;
    }
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal getPrice()
    {
        return price;
    }
    public void setCount(Long count)
    {
        this.count = count;
    }

    public Long getCount()
    {
        return count;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderCode", getOrderCode())
            .append("counterName", getCounterName())
            .append("price", getPrice())
            .append("count", getCount())
            .append("date", getDate())
            .toString();
    }
}
