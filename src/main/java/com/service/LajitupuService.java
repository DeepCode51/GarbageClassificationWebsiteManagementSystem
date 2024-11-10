package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LajitupuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LajitupuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LajitupuView;


/**
 * 垃圾图谱
 *
 * @author 
 * @email 
 * @date 2021-02-26 22:27:19
 */
public interface LajitupuService extends IService<LajitupuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LajitupuVO> selectListVO(Wrapper<LajitupuEntity> wrapper);
   	
   	LajitupuVO selectVO(@Param("ew") Wrapper<LajitupuEntity> wrapper);
   	
   	List<LajitupuView> selectListView(Wrapper<LajitupuEntity> wrapper);
   	
   	LajitupuView selectView(@Param("ew") Wrapper<LajitupuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LajitupuEntity> wrapper);
   	
}

