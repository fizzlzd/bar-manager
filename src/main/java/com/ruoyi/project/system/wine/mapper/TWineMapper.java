package com.ruoyi.project.system.wine.mapper;

import java.util.List;
import com.ruoyi.project.system.wine.domain.TWine;

/**
 * 酒类信息Mapper接口
 * 
 * @author ry
 * @date 2022-12-07
 */
public interface TWineMapper 
{
    /**
     * 查询酒类信息
     * 
     * @param id 酒类信息主键
     * @return 酒类信息
     */
    public TWine selectTWineById(Long id);

    /**
     * 查询酒类信息列表
     * 
     * @param tWine 酒类信息
     * @return 酒类信息集合
     */
    public List<TWine> selectTWineList(TWine tWine);

    /**
     * 新增酒类信息
     * 
     * @param tWine 酒类信息
     * @return 结果
     */
    public int insertTWine(TWine tWine);

    /**
     * 修改酒类信息
     * 
     * @param tWine 酒类信息
     * @return 结果
     */
    public int updateTWine(TWine tWine);

    /**
     * 删除酒类信息
     * 
     * @param id 酒类信息主键
     * @return 结果
     */
    public int deleteTWineById(Long id);

    /**
     * 批量删除酒类信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTWineByIds(String[] ids);
}
