package com.entity.model;

import com.entity.JiepinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 解聘
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
public class JiepinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiepinshijian;
				
	
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
