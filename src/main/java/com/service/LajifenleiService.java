package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LajifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LajifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LajifenleiView;


/**
 * 垃圾分类
 *
 * @author 
 * @email 
 * @date 2021-02-26 22:27:18
 */
public interface LajifenleiService extends IService<LajifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LajifenleiVO> selectListVO(Wrapper<LajifenleiEntity> wrapper);
   	
   	LajifenleiVO selectVO(@Param("ew") Wrapper<LajifenleiEntity> wrapper);
   	
   	List<LajifenleiView> selectListView(Wrapper<LajifenleiEntity> wrapper);
   	
   	LajifenleiView selectView(@Param("ew") Wrapper<LajifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LajifenleiEntity> wrapper);
   	
}

