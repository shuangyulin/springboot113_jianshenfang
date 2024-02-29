package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianshenhuodongDao;
import com.entity.JianshenhuodongEntity;
import com.service.JianshenhuodongService;
import com.entity.vo.JianshenhuodongVO;
import com.entity.view.JianshenhuodongView;

@Service("jianshenhuodongService")
public class JianshenhuodongServiceImpl extends ServiceImpl<JianshenhuodongDao, JianshenhuodongEntity> implements JianshenhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenhuodongEntity> page = this.selectPage(
                new Query<JianshenhuodongEntity>(params).getPage(),
                new EntityWrapper<JianshenhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenhuodongEntity> wrapper) {
		  Page<JianshenhuodongView> page =new Query<JianshenhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenhuodongVO> selectListVO(Wrapper<JianshenhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenhuodongVO selectVO(Wrapper<JianshenhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenhuodongView> selectListView(Wrapper<JianshenhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenhuodongView selectView(Wrapper<JianshenhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
