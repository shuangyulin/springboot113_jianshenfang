package com.entity.view;

import com.entity.HuiyuankaleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员卡类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
@TableName("huiyuankaleixing")
public class HuiyuankaleixingView  extends HuiyuankaleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuankaleixingView(){
	}
 
 	public HuiyuankaleixingView(HuiyuankaleixingEntity huiyuankaleixingEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuankaleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
