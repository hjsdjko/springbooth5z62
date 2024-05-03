package com.dao;

import com.entity.DiscussdongaohuixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdongaohuixiangmuVO;
import com.entity.view.DiscussdongaohuixiangmuView;


/**
 * 冬奥会项目评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface DiscussdongaohuixiangmuDao extends BaseMapper<DiscussdongaohuixiangmuEntity> {
	
	List<DiscussdongaohuixiangmuVO> selectListVO(@Param("ew") Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
	
	DiscussdongaohuixiangmuVO selectVO(@Param("ew") Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
	
	List<DiscussdongaohuixiangmuView> selectListView(@Param("ew") Wrapper<DiscussdongaohuixiangmuEntity> wrapper);

	List<DiscussdongaohuixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
	
	DiscussdongaohuixiangmuView selectView(@Param("ew") Wrapper<DiscussdongaohuixiangmuEntity> wrapper);
	

}
