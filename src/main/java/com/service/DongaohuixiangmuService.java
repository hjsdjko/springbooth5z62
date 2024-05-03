package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongaohuixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongaohuixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongaohuixiangmuView;


/**
 * 冬奥会项目
 *
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface DongaohuixiangmuService extends IService<DongaohuixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongaohuixiangmuVO> selectListVO(Wrapper<DongaohuixiangmuEntity> wrapper);
   	
   	DongaohuixiangmuVO selectVO(@Param("ew") Wrapper<DongaohuixiangmuEntity> wrapper);
   	
   	List<DongaohuixiangmuView> selectListView(Wrapper<DongaohuixiangmuEntity> wrapper);
   	
   	DongaohuixiangmuView selectView(@Param("ew") Wrapper<DongaohuixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongaohuixiangmuEntity> wrapper);
   	

}

