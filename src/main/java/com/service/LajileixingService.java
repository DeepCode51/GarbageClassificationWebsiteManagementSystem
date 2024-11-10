package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LajileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LajileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LajileixingView;


/**
 * 垃圾类型
 *
 * @author 
 * @email 
 * @date 2021-02-26 22:27:19
 */
public interface LajileixingService extends IService<LajileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LajileixingVO> selectListVO(Wrapper<LajileixingEntity> wrapper);
   	
   	LajileixingVO selectVO(@Param("ew") Wrapper<LajileixingEntity> wrapper);
   	
   	List<LajileixingView> selectListView(Wrapper<LajileixingEntity> wrapper);
   	
   	LajileixingView selectView(@Param("ew") Wrapper<LajileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LajileixingEntity> wrapper);
   	
}

