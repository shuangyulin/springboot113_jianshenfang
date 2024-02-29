package com.entity.model;

import com.entity.HuiyuankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
public class HuiyuankaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员卡名称
	 */
	
	private String huiyuankamingcheng;
		
	/**
	 * 会员卡类型
	 */
	
	private String huiyuankaleixing;
		
	/**
	 * 会员卡价格
	 */
	
	private Integer huiyuankajiage;
		
	/**
	 * 有效时间
	 */
	
	private String youxiaoshijian;
		
	/**
	 * 消费金额
	 */
	
	private String xiaofeijine;
		
	/**
	 * 体测情况
	 */
	
	private String ticeqingkuang;
		
	/**
	 * 会员账号
	 */
	
	private String huiyuanzhanghao;
		
	/**
	 * 会员姓名
	 */
	
	private String huiyuanxingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：消费金额
	 */
	 
	public void setXiaofeijine(String xiaofeijine) {
		this.xiaofeijine = xiaofeijine;
	}
	
	/**
	 * 获取：消费金额
	 */
	public String getXiaofeijine() {
		return xiaofeijine;
	}
				
	
	/**
	 * 设置：体测情况
	 */
	 
	public void setTiceqingkuang(String ticeqingkuang) {
		this.ticeqingkuang = ticeqingkuang;
	}
	
	/**
	 * 获取：体测情况
	 */
	public String getTiceqingkuang() {
		return ticeqingkuang;
	}
				
	
	/**
	 * 设置：会员账号
	 */
	 
	public void setHuiyuanzhanghao(String huiyuanzhanghao) {
		this.huiyuanzhanghao = huiyuanzhanghao;
	}
	
	/**
	 * 获取：会员账号
	 */
	public String getHuiyuanzhanghao() {
		return huiyuanzhanghao;
	}
				
	
	/**
	 * 设置：会员姓名
	 */
	 
	public void setHuiyuanxingming(String huiyuanxingming) {
		this.huiyuanxingming = huiyuanxingming;
	}
	
	/**
	 * 获取：会员姓名
	 */
	public String getHuiyuanxingming() {
		return huiyuanxingming;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
