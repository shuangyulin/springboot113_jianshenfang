package com.entity.vo;

import com.entity.JianshenqicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健身器材
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
public class JianshenqicaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材名称
	 */
	
	private String qicaimingcheng;
		
	/**
	 * 器材图片
	 */
	
	private String qicaitupian;
		
	/**
	 * 器材类型
	 */
	
	private String qicaileixing;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 使用方法
	 */
	
	private String shiyongfangfa;
		
	/**
	 * 瘦身效果
	 */
	
	private String shoushenxiaoguo;
		
	/**
	 * 器材介绍
	 */
	
	private String qicaijieshao;
				
	
	/**
	 * 设置：器材名称
	 */
	 
	public void setQicaimingcheng(String qicaimingcheng) {
		this.qicaimingcheng = qicaimingcheng;
	}
	
	/**
	 * 获取：器材名称
	 */
	public String getQicaimingcheng() {
		return qicaimingcheng;
	}
				
	
	/**
	 * 设置：器材图片
	 */
	 
	public void setQicaitupian(String qicaitupian) {
		this.qicaitupian = qicaitupian;
	}
	
	/**
	 * 获取：器材图片
	 */
	public String getQicaitupian() {
		return qicaitupian;
	}
				
	
	/**
	 * 设置：器材类型
	 */
	 
	public void setQicaileixing(String qicaileixing) {
		this.qicaileixing = qicaileixing;
	}
	
	/**
	 * 获取：器材类型
	 */
	public String getQicaileixing() {
		return qicaileixing;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：使用方法
	 */
	 
	public void setShiyongfangfa(String shiyongfangfa) {
		this.shiyongfangfa = shiyongfangfa;
	}
	
	/**
	 * 获取：使用方法
	 */
	public String getShiyongfangfa() {
		return shiyongfangfa;
	}
				
	
	/**
	 * 设置：瘦身效果
	 */
	 
	public void setShoushenxiaoguo(String shoushenxiaoguo) {
		this.shoushenxiaoguo = shoushenxiaoguo;
	}
	
	/**
	 * 获取：瘦身效果
	 */
	public String getShoushenxiaoguo() {
		return shoushenxiaoguo;
	}
				
	
	/**
	 * 设置：器材介绍
	 */
	 
	public void setQicaijieshao(String qicaijieshao) {
		this.qicaijieshao = qicaijieshao;
	}
	
	/**
	 * 获取：器材介绍
	 */
	public String getQicaijieshao() {
		return qicaijieshao;
	}
			
}
