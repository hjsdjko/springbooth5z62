package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingcaishipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingcaishipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingcaishipinView;


/**
 * 精彩视频评论表
 *
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface DiscussjingcaishipinService extends IService<DiscussjingcaishipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingcaishipinVO> selectListVO(Wrapper<DiscussjingcaishipinEntity> wrapper);
   	
   	DiscussjingcaishipinVO selectVO(@Param("ew") Wrapper<DiscussjingcaishipinEntity> wrapper);
   	
   	List<DiscussjingcaishipinView> selectListView(Wrapper<DiscussjingcaishipinEntity> wrapper);
   	
   	DiscussjingcaishipinView selectView(@Param("ew") Wrapper<DiscussjingcaishipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingcaishipinEntity> wrapper);
   	

}

