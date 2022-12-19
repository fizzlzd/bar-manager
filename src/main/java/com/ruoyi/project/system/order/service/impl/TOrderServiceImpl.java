package com.ruoyi.project.system.order.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.order.mapper.TOrderMapper;
import com.ruoyi.project.system.order.domain.TOrder;
import com.ruoyi.project.system.order.service.ITOrderService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 消费记录信息Service业务层处理
 * 
 * @author ry
 * @date 2022-12-07
 */
@Service
public class TOrderServiceImpl implements ITOrderService 
{
    @Autowired
    private TOrderMapper tOrderMapper;

    /**
     * 查询消费记录信息
     * 
     * @param id 消费记录信息主键
     * @return 消费记录信息
     */
    @Override
    public TOrder selectTOrderById(Long id)
    {
        return tOrderMapper.selectTOrderById(id);
    }

    /**
     * 查询消费记录信息列表
     * 
     * @param tOrder 消费记录信息
     * @return 消费记录信息
     */
    @Override
    public List<TOrder> selectTOrderList(TOrder tOrder)
    {
        return tOrderMapper.selectTOrderList(tOrder);
    }

    /**
     * 新增消费记录信息
     * 
     * @param tOrder 消费记录信息
     * @return 结果
     */
    @Override
    public int insertTOrder(TOrder tOrder)
    {
        return tOrderMapper.insertTOrder(tOrder);
    }

    /**
     * 修改消费记录信息
     * 
     * @param tOrder 消费记录信息
     * @return 结果
     */
    @Override
    public int updateTOrder(TOrder tOrder)
    {
        return tOrderMapper.updateTOrder(tOrder);
    }

    /**
     * 批量删除消费记录信息
     * 
     * @param ids 需要删除的消费记录信息主键
     * @return 结果
     */
    @Override
    public int deleteTOrderByIds(String ids)
    {
        return tOrderMapper.deleteTOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除消费记录信息信息
     * 
     * @param id 消费记录信息主键
     * @return 结果
     */
    @Override
    public int deleteTOrderById(Long id)
    {
        return tOrderMapper.deleteTOrderById(id);
    }
}
