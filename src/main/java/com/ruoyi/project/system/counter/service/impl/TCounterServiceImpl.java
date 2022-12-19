package com.ruoyi.project.system.counter.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.counter.mapper.TCounterMapper;
import com.ruoyi.project.system.counter.domain.TCounter;
import com.ruoyi.project.system.counter.service.ITCounterService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 吧台信息Service业务层处理
 * 
 * @author ry
 * @date 2022-12-07
 */
@Service
public class TCounterServiceImpl implements ITCounterService 
{
    @Autowired
    private TCounterMapper tCounterMapper;

    /**
     * 查询吧台信息
     * 
     * @param id 吧台信息主键
     * @return 吧台信息
     */
    @Override
    public TCounter selectTCounterById(Long id)
    {
        return tCounterMapper.selectTCounterById(id);
    }

    /**
     * 查询吧台信息列表
     * 
     * @param tCounter 吧台信息
     * @return 吧台信息
     */
    @Override
    public List<TCounter> selectTCounterList(TCounter tCounter)
    {
        return tCounterMapper.selectTCounterList(tCounter);
    }

    /**
     * 新增吧台信息
     * 
     * @param tCounter 吧台信息
     * @return 结果
     */
    @Override
    public int insertTCounter(TCounter tCounter)
    {
        return tCounterMapper.insertTCounter(tCounter);
    }

    /**
     * 修改吧台信息
     * 
     * @param tCounter 吧台信息
     * @return 结果
     */
    @Override
    public int updateTCounter(TCounter tCounter)
    {
        return tCounterMapper.updateTCounter(tCounter);
    }

    /**
     * 批量删除吧台信息
     * 
     * @param ids 需要删除的吧台信息主键
     * @return 结果
     */
    @Override
    public int deleteTCounterByIds(String ids)
    {
        return tCounterMapper.deleteTCounterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除吧台信息信息
     * 
     * @param id 吧台信息主键
     * @return 结果
     */
    @Override
    public int deleteTCounterById(Long id)
    {
        return tCounterMapper.deleteTCounterById(id);
    }
}
