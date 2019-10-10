package com.liuxu.shop.domain;

public class Goods {
	private Integer gid;
	private String name ;
	private String ename;
	private String size;
	private Integer price;
	private String biao;
	private Integer bid;
	private Integer zid;
	
	private Brand brand;
	private Goodskind goodskind;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBiao() {
		return biao;
	}
	public void setBiao(String biao) {
		this.biao = biao;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getZid() {
		return zid;
	}
	public void setZid(Integer zid) {
		this.zid = zid;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Goodskind getGoodskind() {
		return goodskind;
	}
	public void setGoodskind(Goodskind goodskind) {
		this.goodskind = goodskind;
	}
	public Goods(Integer gid, String name, String ename, String size, Integer price, String biao, Integer bid,
			Integer zid, Brand brand, Goodskind goodskind) {
		super();
		this.gid = gid;
		this.name = name;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.biao = biao;
		this.bid = bid;
		this.zid = zid;
		this.brand = brand;
		this.goodskind = goodskind;
	}
	public Goods() {
		super();
	}

}
