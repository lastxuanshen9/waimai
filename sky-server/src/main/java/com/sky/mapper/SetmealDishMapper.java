package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查套餐
     * @param dishIds
     * @return
     */
    //select setmeal_id from setmeal dish where dish_id in (1,2,3,4)
    List<Long> getSetmealIdsByDIshIds(List<Long> dishIds);
}