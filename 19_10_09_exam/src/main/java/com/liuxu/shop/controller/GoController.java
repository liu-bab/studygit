package com.liuxu.shop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuxu.shop.domain.Brand;
import com.liuxu.shop.domain.Goods;
import com.liuxu.shop.domain.Goodskind;
import com.liuxu.shop.service.GoService;

@Controller
public class GoController {
	@Resource
	private GoService ser;
	
	// 查找列表
	@RequestMapping("list")
	public String getList(Model model,String name) {
		// 去查找列表
		List<Goods> list = ser.getList(name);
		// 将列表放进去到model里面来传到list页面
		model.addAttribute("list",list);
		model.addAttribute("name",name);
		// 返回list页面
		return "list";
	}
	
	// 查找商品类型，商品品牌得集合
	@RequestMapping("addJsp")
	public String getJsp(Model model) {
		// 查找商品品牌
		List<Brand> brand = ser.getBrand();
		// 查找商品类型
		List<Goodskind> kind = ser.getGoodskin();
		// 将查找到得东西传入add页面里面
		model.addAttribute("brand",brand);
		model.addAttribute("kind",kind);
		// 返回add页面
		return "add";
	}
	
	// 添加功能
	@RequestMapping("addGoods")
	@ResponseBody
	public boolean addGoods(Goods goods) {
		
		boolean b = ser.addGoods(goods);
		
		return b;
	}	
	// 修改得回显
	@RequestMapping("updJsp")
	@ResponseBody
	public String getGoodsByid(Integer gid,Model model) {
		// 查找商品得对象
		Goods goods = ser.getGoodsByid(gid);
		// 查找商品品牌
		List<Brand> brand = ser.getBrand();
		// 查找商品类型
		List<Goodskind> kind = ser.getGoodskin();
		// 将查找到得东西放进map集合里面
		model.addAttribute("goods", goods);
		model.addAttribute("brand", brand);
		model.addAttribute("kind",kind);
		
		return "update";
		
	}
	
	// 删除\
	@RequestMapping("delsGoods")
	@ResponseBody
	public boolean delsGoods(String id) {
		
		boolean b = ser.delsGoods(id);
		
		return b;
	}
}
