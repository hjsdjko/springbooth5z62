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


import com.dao.JingcaishipinDao;
import com.entity.JingcaishipinEntity;
import com.service.JingcaishipinService;
import com.entity.vo.JingcaishipinVO;
import com.entity.view.JingcaishipinView;

@Service("jingcaishipinService")
public class JingcaishipinServiceImpl extends ServiceImpl<JingcaishipinDao, JingcaishipinEntity> implements JingcaishipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingcaishipinEntity> page = this.selectPage(
                new Query<JingcaishipinEntity>(params).getPage(),
                new EntityWrapper<JingcaishipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingcaishipinEntity> wrapper) {
		  Page<JingcaishipinView> page =new Query<JingcaishipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingcaishipinVO> selectListVO(Wrapper<JingcaishipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingcaishipinVO selectVO(Wrapper<JingcaishipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingcaishipinView> selectListView(Wrapper<JingcaishipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingcaishipinView selectView(Wrapper<JingcaishipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
