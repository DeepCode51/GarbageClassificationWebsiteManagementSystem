package com.entity.view;

import com.entity.LajileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 垃圾类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 22:27:19
 */
@TableName("lajileixing")
public class LajileixingView  extends LajileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LajileixingView(){
	}
 
 	public LajileixingView(LajileixingEntity lajileixingEntity){
 	try {
			BeanUtils.copyProperties(this, lajileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
