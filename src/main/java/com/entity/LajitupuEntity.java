package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 垃圾图谱
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-26 22:27:19
 */
@TableName("lajitupu")
public class LajitupuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LajitupuEntity() {
		
	}
	
	public LajitupuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 垃圾名称
	 */
					
	private String lajimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：垃圾名称
	 */
	public void setLajimingcheng(String lajimingcheng) {
		this.lajimingcheng = lajimingcheng;
	}
	/**
	 * 获取：垃圾名称
	 */
	public String getLajimingcheng() {
		return lajimingcheng;
	}
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
