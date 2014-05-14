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

package com.ys.cert.cars.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Cars}.
 * </p>
 *
 * @author    AC70602
 * @see       Cars
 * @generated
 */
public class CarsWrapper implements Cars, ModelWrapper<Cars> {
	public CarsWrapper(Cars cars) {
		_cars = cars;
	}

	public Class<?> getModelClass() {
		return Cars.class;
	}

	public String getModelClassName() {
		return Cars.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("carId", getCarId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("carName", getCarName());
		attributes.put("carModel", getCarModel());
		attributes.put("carModelYear", getCarModelYear());
		attributes.put("carColor", getCarColor());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long carId = (Long)attributes.get("carId");

		if (carId != null) {
			setCarId(carId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String carName = (String)attributes.get("carName");

		if (carName != null) {
			setCarName(carName);
		}

		String carModel = (String)attributes.get("carModel");

		if (carModel != null) {
			setCarModel(carModel);
		}

		Integer carModelYear = (Integer)attributes.get("carModelYear");

		if (carModelYear != null) {
			setCarModelYear(carModelYear);
		}

		String carColor = (String)attributes.get("carColor");

		if (carColor != null) {
			setCarColor(carColor);
		}
	}

	/**
	* Returns the primary key of this cars.
	*
	* @return the primary key of this cars
	*/
	public long getPrimaryKey() {
		return _cars.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cars.
	*
	* @param primaryKey the primary key of this cars
	*/
	public void setPrimaryKey(long primaryKey) {
		_cars.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the car ID of this cars.
	*
	* @return the car ID of this cars
	*/
	public long getCarId() {
		return _cars.getCarId();
	}

	/**
	* Sets the car ID of this cars.
	*
	* @param carId the car ID of this cars
	*/
	public void setCarId(long carId) {
		_cars.setCarId(carId);
	}

	/**
	* Returns the group ID of this cars.
	*
	* @return the group ID of this cars
	*/
	public long getGroupId() {
		return _cars.getGroupId();
	}

	/**
	* Sets the group ID of this cars.
	*
	* @param groupId the group ID of this cars
	*/
	public void setGroupId(long groupId) {
		_cars.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this cars.
	*
	* @return the company ID of this cars
	*/
	public long getCompanyId() {
		return _cars.getCompanyId();
	}

	/**
	* Sets the company ID of this cars.
	*
	* @param companyId the company ID of this cars
	*/
	public void setCompanyId(long companyId) {
		_cars.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this cars.
	*
	* @return the user ID of this cars
	*/
	public long getUserId() {
		return _cars.getUserId();
	}

	/**
	* Sets the user ID of this cars.
	*
	* @param userId the user ID of this cars
	*/
	public void setUserId(long userId) {
		_cars.setUserId(userId);
	}

	/**
	* Returns the user uuid of this cars.
	*
	* @return the user uuid of this cars
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cars.getUserUuid();
	}

	/**
	* Sets the user uuid of this cars.
	*
	* @param userUuid the user uuid of this cars
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_cars.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this cars.
	*
	* @return the user name of this cars
	*/
	public java.lang.String getUserName() {
		return _cars.getUserName();
	}

	/**
	* Sets the user name of this cars.
	*
	* @param userName the user name of this cars
	*/
	public void setUserName(java.lang.String userName) {
		_cars.setUserName(userName);
	}

	/**
	* Returns the create date of this cars.
	*
	* @return the create date of this cars
	*/
	public java.util.Date getCreateDate() {
		return _cars.getCreateDate();
	}

	/**
	* Sets the create date of this cars.
	*
	* @param createDate the create date of this cars
	*/
	public void setCreateDate(java.util.Date createDate) {
		_cars.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this cars.
	*
	* @return the modified date of this cars
	*/
	public java.util.Date getModifiedDate() {
		return _cars.getModifiedDate();
	}

	/**
	* Sets the modified date of this cars.
	*
	* @param modifiedDate the modified date of this cars
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_cars.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the car name of this cars.
	*
	* @return the car name of this cars
	*/
	public java.lang.String getCarName() {
		return _cars.getCarName();
	}

	/**
	* Sets the car name of this cars.
	*
	* @param carName the car name of this cars
	*/
	public void setCarName(java.lang.String carName) {
		_cars.setCarName(carName);
	}

	/**
	* Returns the car model of this cars.
	*
	* @return the car model of this cars
	*/
	public java.lang.String getCarModel() {
		return _cars.getCarModel();
	}

	/**
	* Sets the car model of this cars.
	*
	* @param carModel the car model of this cars
	*/
	public void setCarModel(java.lang.String carModel) {
		_cars.setCarModel(carModel);
	}

	/**
	* Returns the car model year of this cars.
	*
	* @return the car model year of this cars
	*/
	public int getCarModelYear() {
		return _cars.getCarModelYear();
	}

	/**
	* Sets the car model year of this cars.
	*
	* @param carModelYear the car model year of this cars
	*/
	public void setCarModelYear(int carModelYear) {
		_cars.setCarModelYear(carModelYear);
	}

	/**
	* Returns the car color of this cars.
	*
	* @return the car color of this cars
	*/
	public java.lang.String getCarColor() {
		return _cars.getCarColor();
	}

	/**
	* Sets the car color of this cars.
	*
	* @param carColor the car color of this cars
	*/
	public void setCarColor(java.lang.String carColor) {
		_cars.setCarColor(carColor);
	}

	public boolean isNew() {
		return _cars.isNew();
	}

	public void setNew(boolean n) {
		_cars.setNew(n);
	}

	public boolean isCachedModel() {
		return _cars.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_cars.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _cars.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _cars.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cars.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cars.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cars.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CarsWrapper((Cars)_cars.clone());
	}

	public int compareTo(Cars cars) {
		return _cars.compareTo(cars);
	}

	@Override
	public int hashCode() {
		return _cars.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Cars> toCacheModel() {
		return _cars.toCacheModel();
	}

	public Cars toEscapedModel() {
		return new CarsWrapper(_cars.toEscapedModel());
	}

	public Cars toUnescapedModel() {
		return new CarsWrapper(_cars.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cars.toString();
	}

	public java.lang.String toXmlString() {
		return _cars.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cars.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CarsWrapper)) {
			return false;
		}

		CarsWrapper carsWrapper = (CarsWrapper)obj;

		if (Validator.equals(_cars, carsWrapper._cars)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Cars getWrappedCars() {
		return _cars;
	}

	public Cars getWrappedModel() {
		return _cars;
	}

	public void resetOriginalValues() {
		_cars.resetOriginalValues();
	}

	private Cars _cars;
}