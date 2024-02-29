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
 * 会员卡类型
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
@TableName("huiyuankaleixing")
public class HuiyuankaleixingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuankaleixingEntity() {
		
	}
	
	public HuiyuankaleixingEntity(T t) {
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
	 * 会员卡名称
	 */
					
	private String huiyuankamingcheng;
	
	/**
	 * 会员卡图片
	 */
					
	private String huiyuankatupian;
	
	/**
	 * 会员卡类型
	 */
					
	private String huiyuankaleixing;
	
	/**
	 * 会员卡功能
	 */
					
	private String huiyuankagongneng;
	
	/**
	 * 会员卡价格
	 */
					
	private Integer huiyuankajiage;
	
	/**
	 * 有效时间
	 */
					
	private String youxiaoshijian;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
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
	 * 设置：会员卡名称
	 */
	public void setHuiyuankamingcheng(String huiyuankamingcheng) {
		this.huiyuankamingcheng = huiyuankamingcheng;
	}
	/**
	 * 获取：会员卡名称
	 */
	public String getHuiyuankamingcheng() {
		return huiyuankamingcheng;
	}
	/**
	 * 设置：会员卡图片
	 */
	public void setHuiyuankatupian(String huiyuankatupian) {
		this.huiyuankatupian = huiyuankatupian;
	}
	/**
	 * 获取：会员卡图片
	 */
	public String getHuiyuankatupian() {
		return huiyuankatupian;
	}
	/**
	 * 设置：会员卡类型
	 */
	public void setHuiyuankaleixing(String huiyuankaleixing) {
		this.huiyuankaleixing = huiyuankaleixing;
	}
	/**
	 * 获取：会员卡类型
	 */
	public String getHuiyuankaleixing() {
		return huiyuankaleixing;
	}
	/**
	 * 设置：会员卡功能
	 */
	public void setHuiyuankagongneng(String huiyuankagongneng) {
		this.huiyuankagongneng = huiyuankagongneng;
	}
	/**
	 * 获取：会员卡功能
	 */
	public String getHuiyuankagongneng() {
		return huiyuankagongneng;
	}
	/**
	 * 设置：会员卡价格
	 */
	public void setHuiyuankajiage(Integer huiyuankajiage) {
		this.huiyuankajiage = huiyuankajiage;
	}
	/**
	 * 获取：会员卡价格
	 */
	public Integer getHuiyuankajiage() {
		return huiyuankajiage;
	}
	/**
	 * 设置：有效时间
	 */
	public void setYouxiaoshijian(String youxiaoshijian) {
		this.youxiaoshijian = youxiaoshijian;
	}
	/**
	 * 获取：有效时间
	 */
	public String getYouxiaoshijian() {
		return youxiaoshijian;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}

}
