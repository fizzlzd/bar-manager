package com.ruoyi.project.system.jsy.mapper;

import java.util.List;
import com.ruoyi.project.system.jsy.domain.UserJsy;

/**
 * 驾驶员管理Mapper接口
 * 
 * @author rcx
 * @date 2022-04-01
 */
public interface UserJsyMapper 
{
    /**
     * 查询驾驶员管理
     * 
     * @param jsyId 驾驶员管理主键
     * @return 驾驶员管理
     */
    public UserJsy selectUserJsyByJsyId(Long jsyId);

    /**
     * 查询驾驶员管理列表
     * 
     * @param userJsy 驾驶员管理
     * @return 驾驶员管理集合
     */
    public List<UserJsy> selectUserJsyList(UserJsy userJsy);

    /**
     * 新增驾驶员管理
     * 
     * @param userJsy 驾驶员管理
     * @return 结果
     */
    public int insertUserJsy(UserJsy userJsy);

    /**
     * 修改驾驶员管理
     * 
     * @param userJsy 驾驶员管理
     * @return 结果
     */
    public int updateUserJsy(UserJsy userJsy);

    /**
     * 删除驾驶员管理
     * 
     * @param jsyId 驾驶员管理主键
     * @return 结果
     */
    public int deleteUserJsyByJsyId(Long jsyId);

    /**
     * 批量删除驾驶员管理
     * 
     * @param jsyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserJsyByJsyIds(String[] jsyIds);
}
