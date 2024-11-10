package com.dao;

import com.entity.LajileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LajileixingVO;
import com.entity.view.LajileixingView;


/**
 * 垃圾类型
 * 
 * @author 
 * @email 
 * @date 2021-02-26 22:27:19
 */
public interface LajileixingDao extends BaseMapper<LajileixingEntity> {
	
	List<LajileixingVO> selectListVO(@Param("ew") Wrapper<LajileixingEntity> wrapper);
	
	LajileixingVO selectVO(@Param("ew") Wrapper<LajileixingEntity> wrapper);
	
	List<LajileixingView> selectListView(@Param("ew") Wrapper<LajileixingEntity> wrapper);

	List<LajileixingView> selectListView(Pagination page,@Param("ew") Wrapper<LajileixingEntity> wrapper);
	
	LajileixingView selectView(@Param("ew") Wrapper<LajileixingEntity> wrapper);
	
}
