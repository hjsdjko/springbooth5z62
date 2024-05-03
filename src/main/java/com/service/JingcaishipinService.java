package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingcaishipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingcaishipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingcaishipinView;


/**
 * 精彩视频
 *
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface JingcaishipinService extends IService<JingcaishipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingcaishipinVO> selectListVO(Wrapper<JingcaishipinEntity> wrapper);
   	
   	JingcaishipinVO selectVO(@Param("ew") Wrapper<JingcaishipinEntity> wrapper);
   	
   	List<JingcaishipinView> selectListView(Wrapper<JingcaishipinEntity> wrapper);
   	
   	JingcaishipinView selectView(@Param("ew") Wrapper<JingcaishipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingcaishipinEntity> wrapper);
   	

}

