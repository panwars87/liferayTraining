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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.ys.liferay.cert.service.ClpSerializer;
import com.ys.liferay.cert.service.InventoryLocalServiceUtil;
import com.ys.liferay.cert.service.persistence.InventoryPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class InventoryClp extends BaseModelImpl<Inventory> implements Inventory {
	public InventoryClp() {
	}

	public Class<?> getModelClass() {
		return Inventory.class;
	}

	public String getModelClassName() {
		return Inventory.class.getName();
	}

	public InventoryPK getPrimaryKey() {
		return new InventoryPK(_productId, _productCode);
	}

	public void setPrimaryKey(InventoryPK primaryKey) {
		setProductId(primaryKey.productId);
		setProductCode(primaryKey.productCode);
	}

	public Serializable getPrimaryKeyObj() {
		return new InventoryPK(_productId, _productCode);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((InventoryPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productId", getProductId());
		attributes.put("productName", getProductName());
		attributes.put("productCode", getProductCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		Long productCode = (Long)attributes.get("productCode");

		if (productCode != null) {
			setProductCode(productCode);
		}
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;

		if (_inventoryRemoteModel != null) {
			try {
				Class<?> clazz = _inventoryRemoteModel.getClass();

				Method method = clazz.getMethod("setProductId", long.class);

				method.invoke(_inventoryRemoteModel, productId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getProductName() {
		return _productName;
	}

	public void setProductName(String productName) {
		_productName = productName;

		if (_inventoryRemoteModel != null) {
			try {
				Class<?> clazz = _inventoryRemoteModel.getClass();

				Method method = clazz.getMethod("setProductName", String.class);

				method.invoke(_inventoryRemoteModel, productName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getProductCode() {
		return _productCode;
	}

	public void setProductCode(long productCode) {
		_productCode = productCode;

		if (_inventoryRemoteModel != null) {
			try {
				Class<?> clazz = _inventoryRemoteModel.getClass();

				Method method = clazz.getMethod("setProductCode", long.class);

				method.invoke(_inventoryRemoteModel, productCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInventoryRemoteModel() {
		return _inventoryRemoteModel;
	}

	public void setInventoryRemoteModel(BaseModel<?> inventoryRemoteModel) {
		_inventoryRemoteModel = inventoryRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _inventoryRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_inventoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			InventoryLocalServiceUtil.addInventory(this);
		}
		else {
			InventoryLocalServiceUtil.updateInventory(this);
		}
	}

	@Override
	public Inventory toEscapedModel() {
		return (Inventory)ProxyUtil.newProxyInstance(Inventory.class.getClassLoader(),
			new Class[] { Inventory.class }, new AutoEscapeBeanHandler(this));
	}

	public Inventory toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		InventoryClp clone = new InventoryClp();

		clone.setProductId(getProductId());
		clone.setProductName(getProductName());
		clone.setProductCode(getProductCode());

		return clone;
	}

	public int compareTo(Inventory inventory) {
		int value = 0;

		if (getProductId() < inventory.getProductId()) {
			value = -1;
		}
		else if (getProductId() > inventory.getProductId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InventoryClp)) {
			return false;
		}

		InventoryClp inventory = (InventoryClp)obj;

		InventoryPK primaryKey = inventory.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{productId=");
		sb.append(getProductId());
		sb.append(", productName=");
		sb.append(getProductName());
		sb.append(", productCode=");
		sb.append(getProductCode());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.ys.liferay.cert.model.Inventory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productName</column-name><column-value><![CDATA[");
		sb.append(getProductName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productCode</column-name><column-value><![CDATA[");
		sb.append(getProductCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _productId;
	private String _productName;
	private long _productCode;
	private BaseModel<?> _inventoryRemoteModel;
}