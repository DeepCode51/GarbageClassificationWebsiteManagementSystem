package com.entity.view;

import com.entity.LajifenleiguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 垃圾分类管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 22:27:18
 */
@TableName("lajifenleiguanliyuan")
public class LajifenleiguanliyuanView  extends LajifenleiguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LajifenleiguanliyuanView(){
	}
 
 	public LajifenleiguanliyuanView(LajifenleiguanliyuanEntity lajifenleiguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, lajifenleiguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
