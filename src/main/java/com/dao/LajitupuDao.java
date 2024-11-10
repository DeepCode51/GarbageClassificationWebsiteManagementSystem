package com.dao;

import com.entity.LajitupuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LajitupuVO;
import com.entity.view.LajitupuView;


/**
 * 垃圾图谱
 * 
 * @author 
 * @email 
 * @date 2021-02-26 22:27:19
 */
public interface LajitupuDao extends BaseMapper<LajitupuEntity> {
	
	List<LajitupuVO> selectListVO(@Param("ew") Wrapper<LajitupuEntity> wrapper);
	
	LajitupuVO selectVO(@Param("ew") Wrapper<LajitupuEntity> wrapper);
	
	List<LajitupuView> selectListView(@Param("ew") Wrapper<LajitupuEntity> wrapper);

	List<LajitupuView> selectListView(Pagination page,@Param("ew") Wrapper<LajitupuEntity> wrapper);
	
	LajitupuView selectView(@Param("ew") Wrapper<LajitupuEntity> wrapper);
	
}
