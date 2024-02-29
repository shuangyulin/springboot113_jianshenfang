package com.dao;

import com.entity.JianshenhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenhuodongVO;
import com.entity.view.JianshenhuodongView;


/**
 * 健身活动
 * 
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
public interface JianshenhuodongDao extends BaseMapper<JianshenhuodongEntity> {
	
	List<JianshenhuodongVO> selectListVO(@Param("ew") Wrapper<JianshenhuodongEntity> wrapper);
	
	JianshenhuodongVO selectVO(@Param("ew") Wrapper<JianshenhuodongEntity> wrapper);
	
	List<JianshenhuodongView> selectListView(@Param("ew") Wrapper<JianshenhuodongEntity> wrapper);

	List<JianshenhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenhuodongEntity> wrapper);
	
	JianshenhuodongView selectView(@Param("ew") Wrapper<JianshenhuodongEntity> wrapper);
	
}
