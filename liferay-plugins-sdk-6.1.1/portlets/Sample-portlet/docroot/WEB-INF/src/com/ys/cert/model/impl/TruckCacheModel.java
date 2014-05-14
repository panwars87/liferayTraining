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

package com.ys.cert.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.ys.cert.model.Truck;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Truck in entity cache.
 *
 * @author AC70602
 * @see Truck
 * @generated
 */
public class TruckCacheModel implements CacheModel<Truck>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{truckId=");
		sb.append(truckId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", truckName=");
		sb.append(truckName);
		sb.append(", truckModel=");
		sb.append(truckModel);
		sb.append(", truckModelYear=");
		sb.append(truckModelYear);
		sb.append(", truckColor=");
		sb.append(truckColor);
		sb.append("}");

		return sb.toString();
	}

	public Truck toEntityModel() {
		TruckImpl truckImpl = new TruckImpl();

		truckImpl.setTruckId(truckId);
		truckImpl.setGroupId(groupId);
		truckImpl.setCompanyId(companyId);
		truckImpl.setUserId(userId);

		if (userName == null) {
			truckImpl.setUserName(StringPool.BLANK);
		}
		else {
			truckImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			truckImpl.setCreateDate(null);
		}
		else {
			truckImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			truckImpl.setModifiedDate(null);
		}
		else {
			truckImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (truckName == null) {
			truckImpl.setTruckName(StringPool.BLANK);
		}
		else {
			truckImpl.setTruckName(truckName);
		}

		if (truckModel == null) {
			truckImpl.setTruckModel(StringPool.BLANK);
		}
		else {
			truckImpl.setTruckModel(truckModel);
		}

		truckImpl.setTruckModelYear(truckModelYear);

		if (truckColor == null) {
			truckImpl.setTruckColor(StringPool.BLANK);
		}
		else {
			truckImpl.setTruckColor(truckColor);
		}

		truckImpl.resetOriginalValues();

		return truckImpl;
	}

	public long truckId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String truckName;
	public String truckModel;
	public int truckModelYear;
	public String truckColor;
}