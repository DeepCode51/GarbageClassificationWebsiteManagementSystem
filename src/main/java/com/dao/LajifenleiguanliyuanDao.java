package com.dao;

import com.entity.LajifenleiguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LajifenleiguanliyuanVO;
import com.entity.view.LajifenleiguanliyuanView;


/**
 * 垃圾分类管理员
 * 
 * @author 
 * @email 
 * @date 2021-02-26 22:27:18
 */
public interface LajifenleiguanliyuanDao extends BaseMapper<LajifenleiguanliyuanEntity> {
	
	List<LajifenleiguanliyuanVO> selectListVO(@Param("ew") Wrapper<LajifenleiguanliyuanEntity> wrapper);
	
	LajifenleiguanliyuanVO selectVO(@Param("ew") Wrapper<LajifenleiguanliyuanEntity> wrapper);
	
	List<LajifenleiguanliyuanView> selectListView(@Param("ew") Wrapper<LajifenleiguanliyuanEntity> wrapper);

	List<LajifenleiguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<LajifenleiguanliyuanEntity> wrapper);
	
	LajifenleiguanliyuanView selectView(@Param("ew") Wrapper<LajifenleiguanliyuanEntity> wrapper);
	
}
