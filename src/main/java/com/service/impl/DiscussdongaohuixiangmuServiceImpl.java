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


import com.dao.DiscussdongaohuixiangmuDao;
import com.entity.DiscussdongaohuixiangmuEntity;
import com.service.DiscussdongaohuixiangmuService;
import com.entity.vo.DiscussdongaohuixiangmuVO;
import com.entity.view.DiscussdongaohuixiangmuView;

@Service("discussdongaohuixiangmuService")
public class DiscussdongaohuixiangmuServiceImpl extends ServiceImpl<DiscussdongaohuixiangmuDao, DiscussdongaohuixiangmuEntity> implements DiscussdongaohuixiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdongaohuixiangmuEntity> page = this.selectPage(
                new Query<DiscussdongaohuixiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussdongaohuixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdongaohuixiangmuEntity> wrapper) {
		  Page<DiscussdongaohuixiangmuView> page =new Query<DiscussdongaohuixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdongaohuixiangmuVO> selectListVO(Wrapper<DiscussdongaohuixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdongaohuixiangmuVO selectVO(Wrapper<DiscussdongaohuixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdongaohuixiangmuView> selectListView(Wrapper<DiscussdongaohuixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdongaohuixiangmuView selectView(Wrapper<DiscussdongaohuixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
