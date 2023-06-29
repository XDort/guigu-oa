package com.atguigu.auth.mapper;

import com.atguigu.model.system.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2023-06-13
 */
@Repository
public interface SysMenuMapper extends BaseMapper<SysMenu> {

//    @Param用于XML文件中占位符取参
    List<SysMenu> findMenuListByUserId(@Param("userId") Long userId);
}
