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


import com.dao.LajileixingDao;
import com.entity.LajileixingEntity;
import com.service.LajileixingService;
import com.entity.vo.LajileixingVO;
import com.entity.view.LajileixingView;

@Service("lajileixingService")
public class LajileixingServiceImpl extends ServiceImpl<LajileixingDao, LajileixingEntity> implements LajileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LajileixingEntity> page = this.selectPage(
                new Query<LajileixingEntity>(params).getPage(),
                new EntityWrapper<LajileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LajileixingEntity> wrapper) {
		  Page<LajileixingView> page =new Query<LajileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LajileixingVO> selectListVO(Wrapper<LajileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LajileixingVO selectVO(Wrapper<LajileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LajileixingView> selectListView(Wrapper<LajileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LajileixingView selectView(Wrapper<LajileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
