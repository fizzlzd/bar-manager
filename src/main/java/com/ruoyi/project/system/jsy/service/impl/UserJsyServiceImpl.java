package com.ruoyi.project.system.jsy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.jsy.mapper.UserJsyMapper;
import com.ruoyi.project.system.jsy.domain.UserJsy;
import com.ruoyi.project.system.jsy.service.IUserJsyService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 驾驶员管理Service业务层处理
 * 
 * @author rcx
 * @date 2022-04-01
 */
@Service
public class UserJsyServiceImpl implements IUserJsyService 
{
    @Autowired
    private UserJsyMapper userJsyMapper;

    /**
     * 查询驾驶员管理
     * 
     * @param jsyId 驾驶员管理主键
     * @return 驾驶员管理
     */
    @Override
    public UserJsy selectUserJsyByJsyId(Long jsyId)
    {
        return userJsyMapper.selectUserJsyByJsyId(jsyId);
    }

    /**
     * 查询驾驶员管理列表
     * 
     * @param userJsy 驾驶员管理
     * @return 驾驶员管理
     */
    @Override
    public List<UserJsy> selectUserJsyList(UserJsy userJsy)
    {
        return userJsyMapper.selectUserJsyList(userJsy);
    }

    /**
     * 新增驾驶员管理
     * 
     * @param userJsy 驾驶员管理
     * @return 结果
     */
    @Override
    public int insertUserJsy(UserJsy userJsy)
    {
        return userJsyMapper.insertUserJsy(userJsy);
    }

    /**
     * 修改驾驶员管理
     * 
     * @param userJsy 驾驶员管理
     * @return 结果
     */
    @Override
    public int updateUserJsy(UserJsy userJsy)
    {
        return userJsyMapper.updateUserJsy(userJsy);
    }

    /**
     * 批量删除驾驶员管理
     * 
     * @param jsyIds 需要删除的驾驶员管理主键
     * @return 结果
     */
    @Override
    public int deleteUserJsyByJsyIds(String jsyIds)
    {
        return userJsyMapper.deleteUserJsyByJsyIds(Convert.toStrArray(jsyIds));
    }

    /**
     * 删除驾驶员管理信息
     * 
     * @param jsyId 驾驶员管理主键
     * @return 结果
     */
    @Override
    public int deleteUserJsyByJsyId(Long jsyId)
    {
        return userJsyMapper.deleteUserJsyByJsyId(jsyId);
    }
}
