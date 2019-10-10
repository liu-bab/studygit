package com.liuxu.shop.dao;

import java.util.List;

import com.liuxu.shop.domain.Brand;
import com.liuxu.shop.domain.Goods;
import com.liuxu.shop.domain.Goodskind;

public interface GoMapper {
	// 查找列表
	List<Goods> getList(String name);
	// 查找商品品牌
	List<Brand> getBrand();
	// 查找商品类型
	List<Goodskind> getGoodskin();
	// 添加商品
	Integer addGoods(Goods goods);
	// 查找商品的对象
	Goods getGoodsByid(Integer gid);
	// 修改商品
	Integer updGoods(Goods goods);
	// 商品的删除
	Integer delsGoods(String id);

}
