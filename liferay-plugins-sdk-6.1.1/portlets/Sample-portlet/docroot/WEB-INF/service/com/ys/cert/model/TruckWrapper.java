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

package com.ys.cert.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Truck}.
 * </p>
 *
 * @author    AC70602
 * @see       Truck
 * @generated
 */
public class TruckWrapper implements Truck, ModelWrapper<Truck> {
	public TruckWrapper(Truck truck) {
		_truck = truck;
	}

	public Class<?> getModelClass() {
		return Truck.class;
	}

	public String getModelClassName() {
		return Truck.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("truckId", getTruckId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("truckName", getTruckName());
		attributes.put("truckModel", getTruckModel());
		attributes.put("truckModelYear", getTruckModelYear());
		attributes.put("truckColor", getTruckColor());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long truckId = (Long)attributes.get("truckId");

		if (truckId != null) {
			setTruckId(truckId);
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

		String truckName = (String)attributes.get("truckName");

		if (truckName != null) {
			setTruckName(truckName);
		}

		String truckModel = (String)attributes.get("truckModel");

		if (truckModel != null) {
			setTruckModel(truckModel);
		}

		Integer truckModelYear = (Integer)attributes.get("truckModelYear");

		if (truckModelYear != null) {
			setTruckModelYear(truckModelYear);
		}

		String truckColor = (String)attributes.get("truckColor");

		if (truckColor != null) {
			setTruckColor(truckColor);
		}
	}

	/**
	* Returns the primary key of this truck.
	*
	* @return the primary key of this truck
	*/
	public long getPrimaryKey() {
		return _truck.getPrimaryKey();
	}

	/**
	* Sets the primary key of this truck.
	*
	* @param primaryKey the primary key of this truck
	*/
	public void setPrimaryKey(long primaryKey) {
		_truck.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the truck ID of this truck.
	*
	* @return the truck ID of this truck
	*/
	public long getTruckId() {
		return _truck.getTruckId();
	}

	/**
	* Sets the truck ID of this truck.
	*
	* @param truckId the truck ID of this truck
	*/
	public void setTruckId(long truckId) {
		_truck.setTruckId(truckId);
	}

	/**
	* Returns the group ID of this truck.
	*
	* @return the group ID of this truck
	*/
	public long getGroupId() {
		return _truck.getGroupId();
	}

	/**
	* Sets the group ID of this truck.
	*
	* @param groupId the group ID of this truck
	*/
	public void setGroupId(long groupId) {
		_truck.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this truck.
	*
	* @return the company ID of this truck
	*/
	public long getCompanyId() {
		return _truck.getCompanyId();
	}

	/**
	* Sets the company ID of this truck.
	*
	* @param companyId the company ID of this truck
	*/
	public void setCompanyId(long companyId) {
		_truck.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this truck.
	*
	* @return the user ID of this truck
	*/
	public long getUserId() {
		return _truck.getUserId();
	}

	/**
	* Sets the user ID of this truck.
	*
	* @param userId the user ID of this truck
	*/
	public void setUserId(long userId) {
		_truck.setUserId(userId);
	}

	/**
	* Returns the user uuid of this truck.
	*
	* @return the user uuid of this truck
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truck.getUserUuid();
	}

	/**
	* Sets the user uuid of this truck.
	*
	* @param userUuid the user uuid of this truck
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_truck.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this truck.
	*
	* @return the user name of this truck
	*/
	public java.lang.String getUserName() {
		return _truck.getUserName();
	}

	/**
	* Sets the user name of this truck.
	*
	* @param userName the user name of this truck
	*/
	public void setUserName(java.lang.String userName) {
		_truck.setUserName(userName);
	}

	/**
	* Returns the create date of this truck.
	*
	* @return the create date of this truck
	*/
	public java.util.Date getCreateDate() {
		return _truck.getCreateDate();
	}

	/**
	* Sets the create date of this truck.
	*
	* @param createDate the create date of this truck
	*/
	public void setCreateDate(java.util.Date createDate) {
		_truck.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this truck.
	*
	* @return the modified date of this truck
	*/
	public java.util.Date getModifiedDate() {
		return _truck.getModifiedDate();
	}

	/**
	* Sets the modified date of this truck.
	*
	* @param modifiedDate the modified date of this truck
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_truck.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the truck name of this truck.
	*
	* @return the truck name of this truck
	*/
	public java.lang.String getTruckName() {
		return _truck.getTruckName();
	}

	/**
	* Sets the truck name of this truck.
	*
	* @param truckName the truck name of this truck
	*/
	public void setTruckName(java.lang.String truckName) {
		_truck.setTruckName(truckName);
	}

	/**
	* Returns the truck model of this truck.
	*
	* @return the truck model of this truck
	*/
	public java.lang.String getTruckModel() {
		return _truck.getTruckModel();
	}

	/**
	* Sets the truck model of this truck.
	*
	* @param truckModel the truck model of this truck
	*/
	public void setTruckModel(java.lang.String truckModel) {
		_truck.setTruckModel(truckModel);
	}

	/**
	* Returns the truck model year of this truck.
	*
	* @return the truck model year of this truck
	*/
	public int getTruckModelYear() {
		return _truck.getTruckModelYear();
	}

	/**
	* Sets the truck model year of this truck.
	*
	* @param truckModelYear the truck model year of this truck
	*/
	public void setTruckModelYear(int truckModelYear) {
		_truck.setTruckModelYear(truckModelYear);
	}

	/**
	* Returns the truck color of this truck.
	*
	* @return the truck color of this truck
	*/
	public java.lang.String getTruckColor() {
		return _truck.getTruckColor();
	}

	/**
	* Sets the truck color of this truck.
	*
	* @param truckColor the truck color of this truck
	*/
	public void setTruckColor(java.lang.String truckColor) {
		_truck.setTruckColor(truckColor);
	}

	public boolean isNew() {
		return _truck.isNew();
	}

	public void setNew(boolean n) {
		_truck.setNew(n);
	}

	public boolean isCachedModel() {
		return _truck.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_truck.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _truck.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _truck.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_truck.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _truck.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_truck.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TruckWrapper((Truck)_truck.clone());
	}

	public int compareTo(com.ys.cert.model.Truck truck) {
		return _truck.compareTo(truck);
	}

	@Override
	public int hashCode() {
		return _truck.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ys.cert.model.Truck> toCacheModel() {
		return _truck.toCacheModel();
	}

	public com.ys.cert.model.Truck toEscapedModel() {
		return new TruckWrapper(_truck.toEscapedModel());
	}

	public com.ys.cert.model.Truck toUnescapedModel() {
		return new TruckWrapper(_truck.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _truck.toString();
	}

	public java.lang.String toXmlString() {
		return _truck.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_truck.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TruckWrapper)) {
			return false;
		}

		TruckWrapper truckWrapper = (TruckWrapper)obj;

		if (Validator.equals(_truck, truckWrapper._truck)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Truck getWrappedTruck() {
		return _truck;
	}

	public Truck getWrappedModel() {
		return _truck;
	}

	public void resetOriginalValues() {
		_truck.resetOriginalValues();
	}

	private Truck _truck;
}