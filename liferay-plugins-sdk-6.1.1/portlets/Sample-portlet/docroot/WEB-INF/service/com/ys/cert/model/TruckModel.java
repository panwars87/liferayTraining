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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Truck service. Represents a row in the &quot;Vehicle_Truck&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ys.cert.model.impl.TruckModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ys.cert.model.impl.TruckImpl}.
 * </p>
 *
 * @author AC70602
 * @see Truck
 * @see com.ys.cert.model.impl.TruckImpl
 * @see com.ys.cert.model.impl.TruckModelImpl
 * @generated
 */
public interface TruckModel extends BaseModel<Truck>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a truck model instance should use the {@link Truck} interface instead.
	 */

	/**
	 * Returns the primary key of this truck.
	 *
	 * @return the primary key of this truck
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this truck.
	 *
	 * @param primaryKey the primary key of this truck
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the truck ID of this truck.
	 *
	 * @return the truck ID of this truck
	 */
	public long getTruckId();

	/**
	 * Sets the truck ID of this truck.
	 *
	 * @param truckId the truck ID of this truck
	 */
	public void setTruckId(long truckId);

	/**
	 * Returns the group ID of this truck.
	 *
	 * @return the group ID of this truck
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this truck.
	 *
	 * @param groupId the group ID of this truck
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this truck.
	 *
	 * @return the company ID of this truck
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this truck.
	 *
	 * @param companyId the company ID of this truck
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this truck.
	 *
	 * @return the user ID of this truck
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this truck.
	 *
	 * @param userId the user ID of this truck
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this truck.
	 *
	 * @return the user uuid of this truck
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this truck.
	 *
	 * @param userUuid the user uuid of this truck
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this truck.
	 *
	 * @return the user name of this truck
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this truck.
	 *
	 * @param userName the user name of this truck
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this truck.
	 *
	 * @return the create date of this truck
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this truck.
	 *
	 * @param createDate the create date of this truck
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this truck.
	 *
	 * @return the modified date of this truck
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this truck.
	 *
	 * @param modifiedDate the modified date of this truck
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the truck name of this truck.
	 *
	 * @return the truck name of this truck
	 */
	@AutoEscape
	public String getTruckName();

	/**
	 * Sets the truck name of this truck.
	 *
	 * @param truckName the truck name of this truck
	 */
	public void setTruckName(String truckName);

	/**
	 * Returns the truck model of this truck.
	 *
	 * @return the truck model of this truck
	 */
	@AutoEscape
	public String getTruckModel();

	/**
	 * Sets the truck model of this truck.
	 *
	 * @param truckModel the truck model of this truck
	 */
	public void setTruckModel(String truckModel);

	/**
	 * Returns the truck model year of this truck.
	 *
	 * @return the truck model year of this truck
	 */
	public int getTruckModelYear();

	/**
	 * Sets the truck model year of this truck.
	 *
	 * @param truckModelYear the truck model year of this truck
	 */
	public void setTruckModelYear(int truckModelYear);

	/**
	 * Returns the truck color of this truck.
	 *
	 * @return the truck color of this truck
	 */
	@AutoEscape
	public String getTruckColor();

	/**
	 * Sets the truck color of this truck.
	 *
	 * @param truckColor the truck color of this truck
	 */
	public void setTruckColor(String truckColor);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Truck truck);

	public int hashCode();

	public CacheModel<Truck> toCacheModel();

	public Truck toEscapedModel();

	public Truck toUnescapedModel();

	public String toString();

	public String toXmlString();
}