package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuankaleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuankaleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuankaleixingView;


/**
 * 会员卡类型
 *
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
public interface HuiyuankaleixingService extends IService<HuiyuankaleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuankaleixingVO> selectListVO(Wrapper<HuiyuankaleixingEntity> wrapper);
   	
   	HuiyuankaleixingVO selectVO(@Param("ew") Wrapper<HuiyuankaleixingEntity> wrapper);
   	
   	List<HuiyuankaleixingView> selectListView(Wrapper<HuiyuankaleixingEntity> wrapper);
   	
   	HuiyuankaleixingView selectView(@Param("ew") Wrapper<HuiyuankaleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuankaleixingEntity> wrapper);
   	
}

