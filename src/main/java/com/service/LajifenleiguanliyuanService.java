package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LajifenleiguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LajifenleiguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LajifenleiguanliyuanView;


/**
 * 垃圾分类管理员
 *
 * @author 
 * @email 
 * @date 2021-02-26 22:27:18
 */
public interface LajifenleiguanliyuanService extends IService<LajifenleiguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LajifenleiguanliyuanVO> selectListVO(Wrapper<LajifenleiguanliyuanEntity> wrapper);
   	
   	LajifenleiguanliyuanVO selectVO(@Param("ew") Wrapper<LajifenleiguanliyuanEntity> wrapper);
   	
   	List<LajifenleiguanliyuanView> selectListView(Wrapper<LajifenleiguanliyuanEntity> wrapper);
   	
   	LajifenleiguanliyuanView selectView(@Param("ew") Wrapper<LajifenleiguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LajifenleiguanliyuanEntity> wrapper);
   	
}

