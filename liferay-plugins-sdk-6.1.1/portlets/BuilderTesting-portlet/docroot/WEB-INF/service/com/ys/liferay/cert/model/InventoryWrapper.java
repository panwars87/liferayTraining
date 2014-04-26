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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Inventory}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Inventory
 * @generated
 */
public class InventoryWrapper implements Inventory, ModelWrapper<Inventory> {
	public InventoryWrapper(Inventory inventory) {
		_inventory = inventory;
	}

	public Class<?> getModelClass() {
		return Inventory.class;
	}

	public String getModelClassName() {
		return Inventory.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productId", getProductId());
		attributes.put("productName", getProductName());
		attributes.put("productCode", getProductCode());

		return attributes;
	}

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

	/**
	* Returns the primary key of this inventory.
	*
	* @return the primary key of this inventory
	*/
	public com.ys.liferay.cert.service.persistence.InventoryPK getPrimaryKey() {
		return _inventory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this inventory.
	*
	* @param primaryKey the primary key of this inventory
	*/
	public void setPrimaryKey(
		com.ys.liferay.cert.service.persistence.InventoryPK primaryKey) {
		_inventory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the product ID of this inventory.
	*
	* @return the product ID of this inventory
	*/
	public long getProductId() {
		return _inventory.getProductId();
	}

	/**
	* Sets the product ID of this inventory.
	*
	* @param productId the product ID of this inventory
	*/
	public void setProductId(long productId) {
		_inventory.setProductId(productId);
	}

	/**
	* Returns the product name of this inventory.
	*
	* @return the product name of this inventory
	*/
	public java.lang.String getProductName() {
		return _inventory.getProductName();
	}

	/**
	* Sets the product name of this inventory.
	*
	* @param productName the product name of this inventory
	*/
	public void setProductName(java.lang.String productName) {
		_inventory.setProductName(productName);
	}

	/**
	* Returns the product code of this inventory.
	*
	* @return the product code of this inventory
	*/
	public long getProductCode() {
		return _inventory.getProductCode();
	}

	/**
	* Sets the product code of this inventory.
	*
	* @param productCode the product code of this inventory
	*/
	public void setProductCode(long productCode) {
		_inventory.setProductCode(productCode);
	}

	public boolean isNew() {
		return _inventory.isNew();
	}

	public void setNew(boolean n) {
		_inventory.setNew(n);
	}

	public boolean isCachedModel() {
		return _inventory.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_inventory.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _inventory.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _inventory.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_inventory.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _inventory.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_inventory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InventoryWrapper((Inventory)_inventory.clone());
	}

	public int compareTo(Inventory inventory) {
		return _inventory.compareTo(inventory);
	}

	@Override
	public int hashCode() {
		return _inventory.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Inventory> toCacheModel() {
		return _inventory.toCacheModel();
	}

	public Inventory toEscapedModel() {
		return new InventoryWrapper(_inventory.toEscapedModel());
	}

	public Inventory toUnescapedModel() {
		return new InventoryWrapper(_inventory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _inventory.toString();
	}

	public java.lang.String toXmlString() {
		return _inventory.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_inventory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InventoryWrapper)) {
			return false;
		}

		InventoryWrapper inventoryWrapper = (InventoryWrapper)obj;

		if (Validator.equals(_inventory, inventoryWrapper._inventory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Inventory getWrappedInventory() {
		return _inventory;
	}

	public Inventory getWrappedModel() {
		return _inventory;
	}

	public void resetOriginalValues() {
		_inventory.resetOriginalValues();
	}

	private Inventory _inventory;
}