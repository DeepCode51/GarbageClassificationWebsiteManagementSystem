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


import com.dao.LajitupuDao;
import com.entity.LajitupuEntity;
import com.service.LajitupuService;
import com.entity.vo.LajitupuVO;
import com.entity.view.LajitupuView;

@Service("lajitupuService")
public class LajitupuServiceImpl extends ServiceImpl<LajitupuDao, LajitupuEntity> implements LajitupuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LajitupuEntity> page = this.selectPage(
                new Query<LajitupuEntity>(params).getPage(),
                new EntityWrapper<LajitupuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LajitupuEntity> wrapper) {
		  Page<LajitupuView> page =new Query<LajitupuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LajitupuVO> selectListVO(Wrapper<LajitupuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LajitupuVO selectVO(Wrapper<LajitupuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LajitupuView> selectListView(Wrapper<LajitupuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LajitupuView selectView(Wrapper<LajitupuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
