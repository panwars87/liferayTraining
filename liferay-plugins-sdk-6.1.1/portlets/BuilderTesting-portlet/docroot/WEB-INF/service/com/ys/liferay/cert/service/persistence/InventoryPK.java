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

package com.ys.liferay.cert.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 */
public class InventoryPK implements Comparable<InventoryPK>, Serializable {
	public long productId;
	public long productCode;

	public InventoryPK() {
	}

	public InventoryPK(long productId, long productCode) {
		this.productId = productId;
		this.productCode = productCode;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getProductCode() {
		return productCode;
	}

	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}

	public int compareTo(InventoryPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (productId < pk.productId) {
			value = -1;
		}
		else if (productId > pk.productId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (productCode < pk.productCode) {
			value = -1;
		}
		else if (productCode > pk.productCode) {
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

		if (!(obj instanceof InventoryPK)) {
			return false;
		}

		InventoryPK pk = (InventoryPK)obj;

		if ((productId == pk.productId) && (productCode == pk.productCode)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(productId) + String.valueOf(productCode)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("productId");
		sb.append(StringPool.EQUAL);
		sb.append(productId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("productCode");
		sb.append(StringPool.EQUAL);
		sb.append(productCode);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}