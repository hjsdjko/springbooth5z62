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


import com.dao.DiscussjingcaishipinDao;
import com.entity.DiscussjingcaishipinEntity;
import com.service.DiscussjingcaishipinService;
import com.entity.vo.DiscussjingcaishipinVO;
import com.entity.view.DiscussjingcaishipinView;

@Service("discussjingcaishipinService")
public class DiscussjingcaishipinServiceImpl extends ServiceImpl<DiscussjingcaishipinDao, DiscussjingcaishipinEntity> implements DiscussjingcaishipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingcaishipinEntity> page = this.selectPage(
                new Query<DiscussjingcaishipinEntity>(params).getPage(),
                new EntityWrapper<DiscussjingcaishipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingcaishipinEntity> wrapper) {
		  Page<DiscussjingcaishipinView> page =new Query<DiscussjingcaishipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingcaishipinVO> selectListVO(Wrapper<DiscussjingcaishipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingcaishipinVO selectVO(Wrapper<DiscussjingcaishipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingcaishipinView> selectListView(Wrapper<DiscussjingcaishipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingcaishipinView selectView(Wrapper<DiscussjingcaishipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
