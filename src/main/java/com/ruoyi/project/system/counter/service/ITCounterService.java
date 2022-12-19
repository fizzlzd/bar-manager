package com.ruoyi.project.system.counter.service;

import java.util.List;
import com.ruoyi.project.system.counter.domain.TCounter;

/**
 * 吧台信息Service接口
 * 
 * @author ry
 * @date 2022-12-07
 */
public interface ITCounterService 
{
    /**
     * 查询吧台信息
     * 
     * @param id 吧台信息主键
     * @return 吧台信息
     */
    public TCounter selectTCounterById(Long id);

    /**
     * 查询吧台信息列表
     * 
     * @param tCounter 吧台信息
     * @return 吧台信息集合
     */
    public List<TCounter> selectTCounterList(TCounter tCounter);

    /**
     * 新增吧台信息
     * 
     * @param tCounter 吧台信息
     * @return 结果
     */
    public int insertTCounter(TCounter tCounter);

    /**
     * 修改吧台信息
     * 
     * @param tCounter 吧台信息
     * @return 结果
     */
    public int updateTCounter(TCounter tCounter);

    /**
     * 批量删除吧台信息
     * 
     * @param ids 需要删除的吧台信息主键集合
     * @return 结果
     */
    public int deleteTCounterByIds(String ids);

    /**
     * 删除吧台信息信息
     * 
     * @param id 吧台信息主键
     * @return 结果
     */
    public int deleteTCounterById(Long id);
}
