package com.scut.gulimall.product.dao;

import com.scut.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lyh
 * @email lyh@gmail.com
 * @date 2023-03-07 20:47:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
