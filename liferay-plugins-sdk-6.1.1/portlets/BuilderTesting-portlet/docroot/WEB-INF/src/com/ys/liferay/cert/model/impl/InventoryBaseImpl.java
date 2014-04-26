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

import com.liferay.portal.kernel.exception.SystemException;

import com.ys.liferay.cert.model.Inventory;
import com.ys.liferay.cert.service.InventoryLocalServiceUtil;

/**
 * The extended model base implementation for the Inventory service. Represents a row in the &quot;LCert_Inventory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InventoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InventoryImpl
 * @see com.ys.liferay.cert.model.Inventory
 * @generated
 */
public abstract class InventoryBaseImpl extends InventoryModelImpl
	implements Inventory {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a inventory model instance should use the {@link Inventory} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			InventoryLocalServiceUtil.addInventory(this);
		}
		else {
			InventoryLocalServiceUtil.updateInventory(this);
		}
	}
}