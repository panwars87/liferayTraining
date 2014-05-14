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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.ys.cert.service.ClpSerializer;
import com.ys.cert.service.TruckLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AC70602
 */
public class TruckClp extends BaseModelImpl<Truck> implements Truck {
	public TruckClp() {
	}

	public Class<?> getModelClass() {
		return Truck.class;
	}

	public String getModelClassName() {
		return Truck.class.getName();
	}

	public long getPrimaryKey() {
		return _truckId;
	}

	public void setPrimaryKey(long primaryKey) {
		setTruckId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_truckId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getTruckId() {
		return _truckId;
	}

	public void setTruckId(long truckId) {
		_truckId = truckId;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setTruckId", long.class);

				method.invoke(_truckRemoteModel, truckId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_truckRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_truckRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_truckRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_truckRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_truckRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_truckRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getTruckName() {
		return _truckName;
	}

	public void setTruckName(String truckName) {
		_truckName = truckName;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setTruckName", String.class);

				method.invoke(_truckRemoteModel, truckName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getTruckModel() {
		return _truckModel;
	}

	public void setTruckModel(String truckModel) {
		_truckModel = truckModel;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setTruckModel", String.class);

				method.invoke(_truckRemoteModel, truckModel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getTruckModelYear() {
		return _truckModelYear;
	}

	public void setTruckModelYear(int truckModelYear) {
		_truckModelYear = truckModelYear;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setTruckModelYear", int.class);

				method.invoke(_truckRemoteModel, truckModelYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getTruckColor() {
		return _truckColor;
	}

	public void setTruckColor(String truckColor) {
		_truckColor = truckColor;

		if (_truckRemoteModel != null) {
			try {
				Class<?> clazz = _truckRemoteModel.getClass();

				Method method = clazz.getMethod("setTruckColor", String.class);

				method.invoke(_truckRemoteModel, truckColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTruckRemoteModel() {
		return _truckRemoteModel;
	}

	public void setTruckRemoteModel(BaseModel<?> truckRemoteModel) {
		_truckRemoteModel = truckRemoteModel;
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

		Class<?> remoteModelClass = _truckRemoteModel.getClass();

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

		Object returnValue = method.invoke(_truckRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TruckLocalServiceUtil.addTruck(this);
		}
		else {
			TruckLocalServiceUtil.updateTruck(this);
		}
	}

	@Override
	public Truck toEscapedModel() {
		return (Truck)ProxyUtil.newProxyInstance(Truck.class.getClassLoader(),
			new Class[] { Truck.class }, new AutoEscapeBeanHandler(this));
	}

	public Truck toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		TruckClp clone = new TruckClp();

		clone.setTruckId(getTruckId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTruckName(getTruckName());
		clone.setTruckModel(getTruckModel());
		clone.setTruckModelYear(getTruckModelYear());
		clone.setTruckColor(getTruckColor());

		return clone;
	}

	public int compareTo(Truck truck) {
		int value = 0;

		value = getTruckName().compareTo(truck.getTruckName());

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

		if (!(obj instanceof TruckClp)) {
			return false;
		}

		TruckClp truck = (TruckClp)obj;

		long primaryKey = truck.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{truckId=");
		sb.append(getTruckId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", truckName=");
		sb.append(getTruckName());
		sb.append(", truckModel=");
		sb.append(getTruckModel());
		sb.append(", truckModelYear=");
		sb.append(getTruckModelYear());
		sb.append(", truckColor=");
		sb.append(getTruckColor());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.ys.cert.model.Truck");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>truckId</column-name><column-value><![CDATA[");
		sb.append(getTruckId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>truckName</column-name><column-value><![CDATA[");
		sb.append(getTruckName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>truckModel</column-name><column-value><![CDATA[");
		sb.append(getTruckModel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>truckModelYear</column-name><column-value><![CDATA[");
		sb.append(getTruckModelYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>truckColor</column-name><column-value><![CDATA[");
		sb.append(getTruckColor());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _truckId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _truckName;
	private String _truckModel;
	private int _truckModelYear;
	private String _truckColor;
	private BaseModel<?> _truckRemoteModel;
}