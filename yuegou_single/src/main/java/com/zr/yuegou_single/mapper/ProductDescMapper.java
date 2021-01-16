package com.zr.yuegou_single.mapper;

import com.zr.yuegou_single.entity.ProductDesc;
import com.zr.yuegou_single.entity.ProductDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDescMapper {
    long countByExample(ProductDescExample example);

    int deleteByExample(ProductDescExample example);

    int deleteByPrimaryKey(Long productDescId);

    int insert(ProductDesc record);

    int insertSelective(ProductDesc record);

    List<ProductDesc> selectByExample(ProductDescExample example);

    ProductDesc selectByPrimaryKey(Long productDescId);

    int updateByExampleSelective(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExample(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByPrimaryKeySelective(ProductDesc record);

    int updateByPrimaryKey(ProductDesc record);
}