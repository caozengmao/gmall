package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author caozengmao
 * @email czm@atguigu.com
 * @date 2020-12-14 18:37:10
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
