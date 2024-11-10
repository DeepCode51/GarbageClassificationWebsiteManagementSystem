package com.dao;

import com.entity.LajifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LajifenleiVO;
import com.entity.view.LajifenleiView;


/**
 * 垃圾分类
 * 
 * @author 
 * @email 
 * @date 2021-02-26 22:27:18
 */
public interface LajifenleiDao extends BaseMapper<LajifenleiEntity> {
	
	List<LajifenleiVO> selectListVO(@Param("ew") Wrapper<LajifenleiEntity> wrapper);
	
	LajifenleiVO selectVO(@Param("ew") Wrapper<LajifenleiEntity> wrapper);
	
	List<LajifenleiView> selectListView(@Param("ew") Wrapper<LajifenleiEntity> wrapper);

	List<LajifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<LajifenleiEntity> wrapper);
	
	LajifenleiView selectView(@Param("ew") Wrapper<LajifenleiEntity> wrapper);
	
}
