package com.ruoyi.project.system.order.mapper;

import java.util.List;
import com.ruoyi.project.system.order.domain.TOrder;

/**
 * 消费记录信息Mapper接口
 * 
 * @author ry
 * @date 2022-12-07
 */
public interface TOrderMapper 
{
    /**
     * 查询消费记录信息
     * 
     * @param id 消费记录信息主键
     * @return 消费记录信息
     */
    public TOrder selectTOrderById(Long id);

    /**
     * 查询消费记录信息列表
     * 
     * @param tOrder 消费记录信息
     * @return 消费记录信息集合
     */
    public List<TOrder> selectTOrderList(TOrder tOrder);

    /**
     * 新增消费记录信息
     * 
     * @param tOrder 消费记录信息
     * @return 结果
     */
    public int insertTOrder(TOrder tOrder);

    /**
     * 修改消费记录信息
     * 
     * @param tOrder 消费记录信息
     * @return 结果
     */
    public int updateTOrder(TOrder tOrder);

    /**
     * 删除消费记录信息
     * 
     * @param id 消费记录信息主键
     * @return 结果
     */
    public int deleteTOrderById(Long id);

    /**
     * 批量删除消费记录信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTOrderByIds(String[] ids);
}
