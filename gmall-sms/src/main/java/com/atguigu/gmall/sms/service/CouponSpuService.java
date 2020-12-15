package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.CouponSpuEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author caozengmao
 * @email czm@atguigu.com
 * @date 2020-12-14 18:28:51
 */
public interface CouponSpuService extends IService<CouponSpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}
