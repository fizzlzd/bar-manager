package com.ruoyi.project.system.wine.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.wine.mapper.TWineMapper;
import com.ruoyi.project.system.wine.domain.TWine;
import com.ruoyi.project.system.wine.service.ITWineService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 酒类信息Service业务层处理
 * 
 * @author ry
 * @date 2022-12-07
 */
@Service
public class TWineServiceImpl implements ITWineService 
{
    @Autowired
    private TWineMapper tWineMapper;

    /**
     * 查询酒类信息
     * 
     * @param id 酒类信息主键
     * @return 酒类信息
     */
    @Override
    public TWine selectTWineById(Long id)
    {
        return tWineMapper.selectTWineById(id);
    }

    /**
     * 查询酒类信息列表
     * 
     * @param tWine 酒类信息
     * @return 酒类信息
     */
    @Override
    public List<TWine> selectTWineList(TWine tWine)
    {
        return tWineMapper.selectTWineList(tWine);
    }

    /**
     * 新增酒类信息
     * 
     * @param tWine 酒类信息
     * @return 结果
     */
    @Override
    public int insertTWine(TWine tWine)
    {
        return tWineMapper.insertTWine(tWine);
    }

    /**
     * 修改酒类信息
     * 
     * @param tWine 酒类信息
     * @return 结果
     */
    @Override
    public int updateTWine(TWine tWine)
    {
        return tWineMapper.updateTWine(tWine);
    }

    /**
     * 批量删除酒类信息
     * 
     * @param ids 需要删除的酒类信息主键
     * @return 结果
     */
    @Override
    public int deleteTWineByIds(String ids)
    {
        return tWineMapper.deleteTWineByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除酒类信息信息
     * 
     * @param id 酒类信息主键
     * @return 结果
     */
    @Override
    public int deleteTWineById(Long id)
    {
        return tWineMapper.deleteTWineById(id);
    }
}
