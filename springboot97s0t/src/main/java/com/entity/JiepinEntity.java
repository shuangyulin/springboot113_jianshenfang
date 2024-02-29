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
 * 解聘
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
@TableName("jiepin")
public class JiepinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiepinEntity() {
		
	}
	
	public JiepinEntity(T t) {
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
	 * 解聘编号
	 */
					
	private String jiepinbianhao;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 教练类型
	 */
					
	private String jiaolianleixing;
	
	/**
	 * 教练价格
	 */
					
	private String jiaolianjiage;
	
	/**
	 * 解聘原因
	 */
					
	private String jiepinyuanyin;
	
	/**
	 * 解聘时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiepinshijian;
	
	
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
	 * 设置：解聘编号
	 */
	public void setJiepinbianhao(String jiepinbianhao) {
		this.jiepinbianhao = jiepinbianhao;
	}
	/**
	 * 获取：解聘编号
	 */
	public String getJiepinbianhao() {
		return jiepinbianhao;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
	/**
	 * 设置：教练类型
	 */
	public void setJiaolianleixing(String jiaolianleixing) {
		this.jiaolianleixing = jiaolianleixing;
	}
	/**
	 * 获取：教练类型
	 */
	public String getJiaolianleixing() {
		return jiaolianleixing;
	}
	/**
	 * 设置：教练价格
	 */
	public void setJiaolianjiage(String jiaolianjiage) {
		this.jiaolianjiage = jiaolianjiage;
	}
	/**
	 * 获取：教练价格
	 */
	public String getJiaolianjiage() {
		return jiaolianjiage;
	}
	/**
	 * 设置：解聘原因
	 */
	public void setJiepinyuanyin(String jiepinyuanyin) {
		this.jiepinyuanyin = jiepinyuanyin;
	}
	/**
	 * 获取：解聘原因
	 */
	public String getJiepinyuanyin() {
		return jiepinyuanyin;
	}
	/**
	 * 设置：解聘时间
	 */
	public void setJiepinshijian(Date jiepinshijian) {
		this.jiepinshijian = jiepinshijian;
	}
	/**
	 * 获取：解聘时间
	 */
	public Date getJiepinshijian() {
		return jiepinshijian;
	}

}
