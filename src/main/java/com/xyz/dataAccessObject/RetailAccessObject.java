package com.xyz.dataAccessObject;

import com.xyz.RetailModule;

public interface RetailAccessObject {
	void create(RetailModule product);
	RetailModule read(int product_id);

}
