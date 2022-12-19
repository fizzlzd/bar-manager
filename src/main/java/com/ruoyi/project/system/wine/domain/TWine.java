package com.ruoyi.project.system.wine.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 酒类信息对象 t_wine
 * 
 * @author ry
 * @date 2022-12-07
 */
public class TWine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 酒类编码 */
    @Excel(name = "酒类编码")
    private String wineCode;

    /** 酒类名称 */
    @Excel(name = "酒类名称")
    private String wineName;

    /** 酒类型 */
    @Excel(name = "酒类型")
    private String wineType;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setWineCode(String wineCode)
    {
        this.wineCode = wineCode;
    }

    public String getWineCode()
    {
        return wineCode;
    }
    public void setWineName(String wineName)
    {
        this.wineName = wineName;
    }

    public String getWineName()
    {
        return wineName;
    }
    public void setWineType(String wineType)
    {
        this.wineType = wineType;
    }

    public String getWineType()
    {
        return wineType;
    }
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wineCode", getWineCode())
            .append("wineName", getWineName())
            .append("wineType", getWineType())
            .append("price", getPrice())
            .toString();
    }
}
