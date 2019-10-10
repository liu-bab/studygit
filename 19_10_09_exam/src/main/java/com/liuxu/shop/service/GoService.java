package com.liuxu.shop.service;

import java.util.List;

import com.liuxu.shop.domain.Brand;
import com.liuxu.shop.domain.Goods;
import com.liuxu.shop.domain.Goodskind;

public interface GoService {
    // 查找列表
	List<Goods> getList(String name);
	// 查找商品品牌
	List<Brand> getBrand();
	// 查找商品类型
	List<Goodskind> getGoodskin(); 
	// 添加商品
	boolean addGoods(Goods goods);
	// 查找商品得对象
	Goods getGoodsByid(Integer gid);
	// 商品得批删
	boolean delsGoods(String id);

}
