package com.entity.view;

import com.entity.LajifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 垃圾分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 22:27:18
 */
@TableName("lajifenlei")
public class LajifenleiView  extends LajifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LajifenleiView(){
	}
 
 	public LajifenleiView(LajifenleiEntity lajifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, lajifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
