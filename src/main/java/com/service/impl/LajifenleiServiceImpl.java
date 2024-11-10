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


import com.dao.LajifenleiDao;
import com.entity.LajifenleiEntity;
import com.service.LajifenleiService;
import com.entity.vo.LajifenleiVO;
import com.entity.view.LajifenleiView;

@Service("lajifenleiService")
public class LajifenleiServiceImpl extends ServiceImpl<LajifenleiDao, LajifenleiEntity> implements LajifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LajifenleiEntity> page = this.selectPage(
                new Query<LajifenleiEntity>(params).getPage(),
                new EntityWrapper<LajifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LajifenleiEntity> wrapper) {
		  Page<LajifenleiView> page =new Query<LajifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LajifenleiVO> selectListVO(Wrapper<LajifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LajifenleiVO selectVO(Wrapper<LajifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LajifenleiView> selectListView(Wrapper<LajifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LajifenleiView selectView(Wrapper<LajifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
