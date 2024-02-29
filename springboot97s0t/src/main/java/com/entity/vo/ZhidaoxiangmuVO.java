package com.entity.vo;

import com.entity.ZhidaoxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 指导项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
public class ZhidaoxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 项目价格
	 */
	
	private Integer xiangmujiage;
		
	/**
	 * 收费标准
	 */
	
	private String shoufeibiaozhun;
		
	/**
	 * 课时数
	 */
	
	private String keshishu;
		
	/**
	 * 指导项目
	 */
	
	private String zhidaoxiangmu;
		
	/**
	 * 指导教练
	 */
	
	private String zhidaojiaolian;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：项目类型
	 */
	 
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
				
	
	/**
	 * 设置：项目价格
	 */
	 
	public void setXiangmujiage(Integer xiangmujiage) {
		this.xiangmujiage = xiangmujiage;
	}
	
	/**
	 * 获取：项目价格
	 */
	public Integer getXiangmujiage() {
		return xiangmujiage;
	}
				
	
	/**
	 * 设置：收费标准
	 */
	 
	public void setShoufeibiaozhun(String shoufeibiaozhun) {
		this.shoufeibiaozhun = shoufeibiaozhun;
	}
	
	/**
	 * 获取：收费标准
	 */
	public String getShoufeibiaozhun() {
		return shoufeibiaozhun;
	}
				
	
	/**
	 * 设置：课时数
	 */
	 
	public void setKeshishu(String keshishu) {
		this.keshishu = keshishu;
	}
	
	/**
	 * 获取：课时数
	 */
	public String getKeshishu() {
		return keshishu;
	}
				
	
	/**
	 * 设置：指导项目
	 */
	 
	public void setZhidaoxiangmu(String zhidaoxiangmu) {
		this.zhidaoxiangmu = zhidaoxiangmu;
	}
	
	/**
	 * 获取：指导项目
	 */
	public String getZhidaoxiangmu() {
		return zhidaoxiangmu;
	}
				
	
	/**
	 * 设置：指导教练
	 */
	 
	public void setZhidaojiaolian(String zhidaojiaolian) {
		this.zhidaojiaolian = zhidaojiaolian;
	}
	
	/**
	 * 获取：指导教练
	 */
	public String getZhidaojiaolian() {
		return zhidaojiaolian;
	}
			
}
