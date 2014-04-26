/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ys.liferay.cert.model;

import com.ys.liferay.cert.service.persistence.InventoryPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ys.liferay.cert.service.http.InventoryServiceSoap}.
 *
 * @author    Brian Wing Shun Chan
 * @see       com.ys.liferay.cert.service.http.InventoryServiceSoap
 * @generated
 */
public class InventorySoap implements Serializable {
	public static InventorySoap toSoapModel(Inventory model) {
		InventorySoap soapModel = new InventorySoap();

		soapModel.setProductId(model.getProductId());
		soapModel.setProductName(model.getProductName());
		soapModel.setProductCode(model.getProductCode());

		return soapModel;
	}

	public static InventorySoap[] toSoapModels(Inventory[] models) {
		InventorySoap[] soapModels = new InventorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InventorySoap[][] toSoapModels(Inventory[][] models) {
		InventorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InventorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new InventorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InventorySoap[] toSoapModels(List<Inventory> models) {
		List<InventorySoap> soapModels = new ArrayList<InventorySoap>(models.size());

		for (Inventory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InventorySoap[soapModels.size()]);
	}

	public InventorySoap() {
	}

	public InventoryPK getPrimaryKey() {
		return new InventoryPK(_productId, _productCode);
	}

	public void setPrimaryKey(InventoryPK pk) {
		setProductId(pk.productId);
		setProductCode(pk.productCode);
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public String getProductName() {
		return _productName;
	}

	public void setProductName(String productName) {
		_productName = productName;
	}

	public long getProductCode() {
		return _productCode;
	}

	public void setProductCode(long productCode) {
		_productCode = productCode;
	}

	private long _productId;
	private String _productName;
	private long _productCode;
}