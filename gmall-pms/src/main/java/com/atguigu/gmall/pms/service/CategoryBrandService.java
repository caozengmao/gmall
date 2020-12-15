package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.CategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author caozengmao
 * @email czm@atguigu.com
 * @date 2020-12-14 14:41:05
 */
public interface CategoryBrandService extends IService<CategoryBrandEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

