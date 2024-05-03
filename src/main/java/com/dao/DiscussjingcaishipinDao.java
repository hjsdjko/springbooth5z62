package com.dao;

import com.entity.DiscussjingcaishipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingcaishipinVO;
import com.entity.view.DiscussjingcaishipinView;


/**
 * 精彩视频评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface DiscussjingcaishipinDao extends BaseMapper<DiscussjingcaishipinEntity> {
	
	List<DiscussjingcaishipinVO> selectListVO(@Param("ew") Wrapper<DiscussjingcaishipinEntity> wrapper);
	
	DiscussjingcaishipinVO selectVO(@Param("ew") Wrapper<DiscussjingcaishipinEntity> wrapper);
	
	List<DiscussjingcaishipinView> selectListView(@Param("ew") Wrapper<DiscussjingcaishipinEntity> wrapper);

	List<DiscussjingcaishipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingcaishipinEntity> wrapper);
	
	DiscussjingcaishipinView selectView(@Param("ew") Wrapper<DiscussjingcaishipinEntity> wrapper);
	

}
