package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DongaohuixiangmuDao;
import com.entity.DongaohuixiangmuEntity;
import com.service.DongaohuixiangmuService;
import com.entity.vo.DongaohuixiangmuVO;
import com.entity.view.DongaohuixiangmuView;

@Service("dongaohuixiangmuService")
public class DongaohuixiangmuServiceImpl extends ServiceImpl<DongaohuixiangmuDao, DongaohuixiangmuEntity> implements DongaohuixiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongaohuixiangmuEntity> page = this.selectPage(
                new Query<DongaohuixiangmuEntity>(params).getPage(),
                new EntityWrapper<DongaohuixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongaohuixiangmuEntity> wrapper) {
		  Page<DongaohuixiangmuView> page =new Query<DongaohuixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongaohuixiangmuVO> selectListVO(Wrapper<DongaohuixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongaohuixiangmuVO selectVO(Wrapper<DongaohuixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongaohuixiangmuView> selectListView(Wrapper<DongaohuixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongaohuixiangmuView selectView(Wrapper<DongaohuixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
