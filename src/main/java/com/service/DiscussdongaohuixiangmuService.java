package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdongaohuixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdongaohuixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdongaohuixiangmuView;


/**
 * 冬奥会项目评论表
 *
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface DiscussdongaohuixiangmuService extends IService<DiscussdongaohuixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdongaohuixiangmuVO> selectListVO(Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
   	
   	DiscussdongaohuixiangmuVO selectVO(@Param("ew") Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
   	
   	List<DiscussdongaohuixiangmuView> selectListView(Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
   	
   	DiscussdongaohuixiangmuView selectView(@Param("ew") Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
   	

}

