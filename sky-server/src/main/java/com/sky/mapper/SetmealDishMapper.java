package com.sky.mapper;

import com.sky.entity.SetmealDish;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    /**
     * 批量保存套餐和菜品的关联关系
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id删除套餐和菜品的关联关系
     * @param setmealId
     */
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);
    /**
     * 根据套餐id查询套餐和菜品的关联关系
     * @param setmealId
     * @return
     */
    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);
}
