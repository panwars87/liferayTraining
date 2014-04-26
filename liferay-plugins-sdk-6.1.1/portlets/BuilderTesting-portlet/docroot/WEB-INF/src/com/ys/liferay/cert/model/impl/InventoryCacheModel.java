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

package com.ys.liferay.cert.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.ys.liferay.cert.model.Inventory;

import java.io.Serializable;

/**
 * The cache model class for representing Inventory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Inventory
 * @generated
 */
public class InventoryCacheModel implements CacheModel<Inventory>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{productId=");
		sb.append(productId);
		sb.append(", productName=");
		sb.append(productName);
		sb.append(", productCode=");
		sb.append(productCode);
		sb.append("}");

		return sb.toString();
	}

	public Inventory toEntityModel() {
		InventoryImpl inventoryImpl = new InventoryImpl();

		inventoryImpl.setProductId(productId);

		if (productName == null) {
			inventoryImpl.setProductName(StringPool.BLANK);
		}
		else {
			inventoryImpl.setProductName(productName);
		}

		inventoryImpl.setProductCode(productCode);

		inventoryImpl.resetOriginalValues();

		return inventoryImpl;
	}

	public long productId;
	public String productName;
	public long productCode;
}