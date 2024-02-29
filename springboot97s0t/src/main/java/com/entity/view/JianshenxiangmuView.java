package com.entity.view;

import com.entity.JianshenxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
@TableName("jianshenxiangmu")
public class JianshenxiangmuView  extends JianshenxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenxiangmuView(){
	}
 
 	public JianshenxiangmuView(JianshenxiangmuEntity jianshenxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
