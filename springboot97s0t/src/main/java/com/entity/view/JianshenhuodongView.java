package com.entity.view;

import com.entity.JianshenhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
@TableName("jianshenhuodong")
public class JianshenhuodongView  extends JianshenhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenhuodongView(){
	}
 
 	public JianshenhuodongView(JianshenhuodongEntity jianshenhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
