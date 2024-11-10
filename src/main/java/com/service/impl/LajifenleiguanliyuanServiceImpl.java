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


import com.dao.LajifenleiguanliyuanDao;
import com.entity.LajifenleiguanliyuanEntity;
import com.service.LajifenleiguanliyuanService;
import com.entity.vo.LajifenleiguanliyuanVO;
import com.entity.view.LajifenleiguanliyuanView;

@Service("lajifenleiguanliyuanService")
public class LajifenleiguanliyuanServiceImpl extends ServiceImpl<LajifenleiguanliyuanDao, LajifenleiguanliyuanEntity> implements LajifenleiguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LajifenleiguanliyuanEntity> page = this.selectPage(
                new Query<LajifenleiguanliyuanEntity>(params).getPage(),
                new EntityWrapper<LajifenleiguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LajifenleiguanliyuanEntity> wrapper) {
		  Page<LajifenleiguanliyuanView> page =new Query<LajifenleiguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LajifenleiguanliyuanVO> selectListVO(Wrapper<LajifenleiguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LajifenleiguanliyuanVO selectVO(Wrapper<LajifenleiguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LajifenleiguanliyuanView> selectListView(Wrapper<LajifenleiguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LajifenleiguanliyuanView selectView(Wrapper<LajifenleiguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
