package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author caozengmao
 * @email czm@atguigu.com
 * @date 2020-12-14 18:28:50
 */
@Mapper
public interface SeckillSessionMapper extends BaseMapper<SeckillSessionEntity> {
	
}
