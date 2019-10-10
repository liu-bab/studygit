package com.liuxu.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuxu.shop.dao.GoMapper;
import com.liuxu.shop.domain.Brand;
import com.liuxu.shop.domain.Goods;
import com.liuxu.shop.domain.Goodskind;
import com.liuxu.shop.service.GoService;
@Service
public class GoServiceImp implements GoService{
	@Resource
	private GoMapper mapper;
	// 查找列表
	@Override
	public List<Goods> getList(String name) {
		
		return mapper.getList(name);
	}
	// 查找商品品牌
	@Override
	public List<Brand> getBrand() {

		return mapper.getBrand();
	}
	// 查找商品类型
	@Override
	public List<Goodskind> getGoodskin() {

		return mapper.getGoodskin();
	}
	// 添加商品
	@Override
	public boolean addGoods(Goods goods) {
		if(goods.getGid()!=null) {
			Integer i = mapper.updGoods(goods);
			if(i > 0) {
				return true;
			}
		}else {
			Integer i = mapper.addGoods(goods);
			if(i > 0) {
				return true;
			}
		}
		return false;
	}
	// 查找商品得对象
	@Override
	public Goods getGoodsByid(Integer gid) {
	
		return mapper.getGoodsByid(gid);
	}
	// 商品得删除
	@Override
	public boolean delsGoods(String id) {
		Integer i = mapper.delsGoods(id);
		if(i > 0) {
			return true;
		}
		return false;
	}
}
