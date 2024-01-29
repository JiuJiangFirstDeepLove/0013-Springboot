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


import com.dao.DiscusszuixinxianluDao;
import com.entity.DiscusszuixinxianluEntity;
import com.service.DiscusszuixinxianluService;
import com.entity.vo.DiscusszuixinxianluVO;
import com.entity.view.DiscusszuixinxianluView;

@Service("discusszuixinxianluService")
public class DiscusszuixinxianluServiceImpl extends ServiceImpl<DiscusszuixinxianluDao, DiscusszuixinxianluEntity> implements DiscusszuixinxianluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuixinxianluEntity> page = this.selectPage(
                new Query<DiscusszuixinxianluEntity>(params).getPage(),
                new EntityWrapper<DiscusszuixinxianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuixinxianluEntity> wrapper) {
		  Page<DiscusszuixinxianluView> page =new Query<DiscusszuixinxianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuixinxianluVO> selectListVO(Wrapper<DiscusszuixinxianluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuixinxianluVO selectVO(Wrapper<DiscusszuixinxianluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuixinxianluView> selectListView(Wrapper<DiscusszuixinxianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuixinxianluView selectView(Wrapper<DiscusszuixinxianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
