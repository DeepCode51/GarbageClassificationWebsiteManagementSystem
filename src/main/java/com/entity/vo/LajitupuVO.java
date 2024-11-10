package com.entity.vo;

import com.entity.LajitupuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 垃圾图谱
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-26 22:27:19
 */
public class LajitupuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 垃圾类型
	 */
	
	private String lajileixing;
		
	/**
	 * 图谱
	 */
	
	private String tupu;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：垃圾类型
	 */
	 
	public void setLajileixing(String lajileixing) {
		this.lajileixing = lajileixing;
	}
	
	/**
	 * 获取：垃圾类型
	 */
	public String getLajileixing() {
		return lajileixing;
	}
				
	
	/**
	 * 设置：图谱
	 */
	 
	public void setTupu(String tupu) {
		this.tupu = tupu;
	}
	
	/**
	 * 获取：图谱
	 */
	public String getTupu() {
		return tupu;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
