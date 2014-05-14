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

import com.ys.cert.model.Cars;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Cars in entity cache.
 *
 * @author AC70602
 * @see Cars
 * @generated
 */
public class CarsCacheModel implements CacheModel<Cars>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{carId=");
		sb.append(carId);
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
		sb.append(", carName=");
		sb.append(carName);
		sb.append(", carModel=");
		sb.append(carModel);
		sb.append(", carModelYear=");
		sb.append(carModelYear);
		sb.append(", carColor=");
		sb.append(carColor);
		sb.append("}");

		return sb.toString();
	}

	public Cars toEntityModel() {
		CarsImpl carsImpl = new CarsImpl();

		carsImpl.setCarId(carId);
		carsImpl.setGroupId(groupId);
		carsImpl.setCompanyId(companyId);
		carsImpl.setUserId(userId);

		if (userName == null) {
			carsImpl.setUserName(StringPool.BLANK);
		}
		else {
			carsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			carsImpl.setCreateDate(null);
		}
		else {
			carsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			carsImpl.setModifiedDate(null);
		}
		else {
			carsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (carName == null) {
			carsImpl.setCarName(StringPool.BLANK);
		}
		else {
			carsImpl.setCarName(carName);
		}

		if (carModel == null) {
			carsImpl.setCarModel(StringPool.BLANK);
		}
		else {
			carsImpl.setCarModel(carModel);
		}

		carsImpl.setCarModelYear(carModelYear);

		if (carColor == null) {
			carsImpl.setCarColor(StringPool.BLANK);
		}
		else {
			carsImpl.setCarColor(carColor);
		}

		carsImpl.resetOriginalValues();

		return carsImpl;
	}

	public long carId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String carName;
	public String carModel;
	public int carModelYear;
	public String carColor;
}