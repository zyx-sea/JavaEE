package com.qst.chapter03.action;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private int productId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	// 编辑商品
	public String edit() {
		System.out.println("编辑商品" + productId);
		// ...省略一些编辑商品的业务
		return "edit";
	}

	// 删除商品
	public String del() {
		System.out.println("删除商品" + productId);
		// ...省略一些删除商品的业务
		return "del";
	}
}
