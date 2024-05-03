package com.dao;

import com.entity.JingcaishipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingcaishipinVO;
import com.entity.view.JingcaishipinView;


/**
 * 精彩视频
 * 
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface JingcaishipinDao extends BaseMapper<JingcaishipinEntity> {
	
	List<JingcaishipinVO> selectListVO(@Param("ew") Wrapper<JingcaishipinEntity> wrapper);
	
	JingcaishipinVO selectVO(@Param("ew") Wrapper<JingcaishipinEntity> wrapper);
	
	List<JingcaishipinView> selectListView(@Param("ew") Wrapper<JingcaishipinEntity> wrapper);

	List<JingcaishipinView> selectListView(Pagination page,@Param("ew") Wrapper<JingcaishipinEntity> wrapper);
	
	JingcaishipinView selectView(@Param("ew") Wrapper<JingcaishipinEntity> wrapper);
	

}
