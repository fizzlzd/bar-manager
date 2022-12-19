package com.ruoyi.project.system.jsy.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 驾驶员管理对象 user_jsy
 * 
 * @author rcx
 * @date 2022-04-01
 */
public class UserJsy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 驾驶员ID */
    private Long jsyId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String jsyxm;

    /** 驾驶证号 */
    @Excel(name = "驾驶证号")
    private String jszh;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String sfzhm;

    /** 住址 */
    @Excel(name = "住址")
    private String zz;

    /** 初次领证日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "初次领证日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cclzDate;

    /** 年审到期日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "年审到期日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nsdqDate;

    /** 准驾车型 */
    @Excel(name = "准驾车型")
    private String zjcx;

    /** 有效期 */
    @Excel(name = "有效期")
    private String xxq;

    /** 交通事故 */
    @Excel(name = "交通事故")
    private String jtsg;

    /** 驾驶证正面 */
    @Excel(name = "驾驶证正面")
    private String jszzm;

    /** 驾驶证反面 */
    @Excel(name = "驾驶证反面")
    private String jszfm;

    public void setJsyId(Long jsyId)
    {
        this.jsyId = jsyId;
    }

    public Long getJsyId()
    {
        return jsyId;
    }
    public void setJsyxm(String jsyxm)
    {
        this.jsyxm = jsyxm;
    }

    public String getJsyxm()
    {
        return jsyxm;
    }
    public void setJszh(String jszh)
    {
        this.jszh = jszh;
    }

    public String getJszh()
    {
        return jszh;
    }
    public void setSfzhm(String sfzhm)
    {
        this.sfzhm = sfzhm;
    }

    public String getSfzhm()
    {
        return sfzhm;
    }
    public void setZz(String zz)
    {
        this.zz = zz;
    }

    public String getZz()
    {
        return zz;
    }
    public void setCclzDate(Date cclzDate)
    {
        this.cclzDate = cclzDate;
    }

    public Date getCclzDate()
    {
        return cclzDate;
    }
    public void setNsdqDate(Date nsdqDate)
    {
        this.nsdqDate = nsdqDate;
    }

    public Date getNsdqDate()
    {
        return nsdqDate;
    }
    public void setZjcx(String zjcx)
    {
        this.zjcx = zjcx;
    }

    public String getZjcx()
    {
        return zjcx;
    }
    public void setXxq(String xxq)
    {
        this.xxq = xxq;
    }

    public String getXxq()
    {
        return xxq;
    }
    public void setJtsg(String jtsg)
    {
        this.jtsg = jtsg;
    }

    public String getJtsg()
    {
        return jtsg;
    }
    public void setJszzm(String jszzm)
    {
        this.jszzm = jszzm;
    }

    public String getJszzm()
    {
        return jszzm;
    }
    public void setJszfm(String jszfm)
    {
        this.jszfm = jszfm;
    }

    public String getJszfm()
    {
        return jszfm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jsyId", getJsyId())
            .append("jsyxm", getJsyxm())
            .append("jszh", getJszh())
            .append("sfzhm", getSfzhm())
            .append("zz", getZz())
            .append("cclzDate", getCclzDate())
            .append("nsdqDate", getNsdqDate())
            .append("zjcx", getZjcx())
            .append("xxq", getXxq())
            .append("jtsg", getJtsg())
            .append("jszzm", getJszzm())
            .append("jszfm", getJszfm())
            .toString();
    }
}
