package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UserAddressEntity;

import java.util.Map;

/**
 * 收货地址表
 *
 * @author caozengmao
 * @email czm@atguigu.com
 * @date 2020-12-14 18:49:13
 */
public interface UserAddressService extends IService<UserAddressEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

