package com.dao;

import com.entity.DongaohuixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongaohuixiangmuVO;
import com.entity.view.DongaohuixiangmuView;


/**
 * 冬奥会项目
 * 
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
public interface DongaohuixiangmuDao extends BaseMapper<DongaohuixiangmuEntity> {
	
	List<DongaohuixiangmuVO> selectListVO(@Param("ew") Wrapper<DongaohuixiangmuEntity> wrapper);
	
	DongaohuixiangmuVO selectVO(@Param("ew") Wrapper<DongaohuixiangmuEntity> wrapper);
	
	List<DongaohuixiangmuView> selectListView(@Param("ew") Wrapper<DongaohuixiangmuEntity> wrapper);

	List<DongaohuixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DongaohuixiangmuEntity> wrapper);
	
	DongaohuixiangmuView selectView(@Param("ew") Wrapper<DongaohuixiangmuEntity> wrapper);
	

}
