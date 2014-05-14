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

import com.ys.cert.service.CarsLocalServiceUtil;
import com.ys.cert.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AC70602
 */
public class CarsClp extends BaseModelImpl<Cars> implements Cars {
	public CarsClp() {
	}

	public Class<?> getModelClass() {
		return Cars.class;
	}

	public String getModelClassName() {
		return Cars.class.getName();
	}

	public long getPrimaryKey() {
		return _carId;
	}

	public void setPrimaryKey(long primaryKey) {
		setCarId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_carId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getCarId() {
		return _carId;
	}

	public void setCarId(long carId) {
		_carId = carId;

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setCarId", long.class);

				method.invoke(_carsRemoteModel, carId);
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

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_carsRemoteModel, groupId);
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

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_carsRemoteModel, companyId);
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

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_carsRemoteModel, userId);
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

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_carsRemoteModel, userName);
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

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_carsRemoteModel, createDate);
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

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_carsRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getCarName() {
		return _carName;
	}

	public void setCarName(String carName) {
		_carName = carName;

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setCarName", String.class);

				method.invoke(_carsRemoteModel, carName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getCarModel() {
		return _carModel;
	}

	public void setCarModel(String carModel) {
		_carModel = carModel;

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setCarModel", String.class);

				method.invoke(_carsRemoteModel, carModel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getCarModelYear() {
		return _carModelYear;
	}

	public void setCarModelYear(int carModelYear) {
		_carModelYear = carModelYear;

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setCarModelYear", int.class);

				method.invoke(_carsRemoteModel, carModelYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getCarColor() {
		return _carColor;
	}

	public void setCarColor(String carColor) {
		_carColor = carColor;

		if (_carsRemoteModel != null) {
			try {
				Class<?> clazz = _carsRemoteModel.getClass();

				Method method = clazz.getMethod("setCarColor", String.class);

				method.invoke(_carsRemoteModel, carColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCarsRemoteModel() {
		return _carsRemoteModel;
	}

	public void setCarsRemoteModel(BaseModel<?> carsRemoteModel) {
		_carsRemoteModel = carsRemoteModel;
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

		Class<?> remoteModelClass = _carsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_carsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			CarsLocalServiceUtil.addCars(this);
		}
		else {
			CarsLocalServiceUtil.updateCars(this);
		}
	}

	@Override
	public Cars toEscapedModel() {
		return (Cars)ProxyUtil.newProxyInstance(Cars.class.getClassLoader(),
			new Class[] { Cars.class }, new AutoEscapeBeanHandler(this));
	}

	public Cars toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		CarsClp clone = new CarsClp();

		clone.setCarId(getCarId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCarName(getCarName());
		clone.setCarModel(getCarModel());
		clone.setCarModelYear(getCarModelYear());
		clone.setCarColor(getCarColor());

		return clone;
	}

	public int compareTo(Cars cars) {
		int value = 0;

		value = getCarName().compareTo(cars.getCarName());

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

		if (!(obj instanceof CarsClp)) {
			return false;
		}

		CarsClp cars = (CarsClp)obj;

		long primaryKey = cars.getPrimaryKey();

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

		sb.append("{carId=");
		sb.append(getCarId());
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
		sb.append(", carName=");
		sb.append(getCarName());
		sb.append(", carModel=");
		sb.append(getCarModel());
		sb.append(", carModelYear=");
		sb.append(getCarModelYear());
		sb.append(", carColor=");
		sb.append(getCarColor());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.ys.cert.model.Cars");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>carId</column-name><column-value><![CDATA[");
		sb.append(getCarId());
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
			"<column><column-name>carName</column-name><column-value><![CDATA[");
		sb.append(getCarName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>carModel</column-name><column-value><![CDATA[");
		sb.append(getCarModel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>carModelYear</column-name><column-value><![CDATA[");
		sb.append(getCarModelYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>carColor</column-name><column-value><![CDATA[");
		sb.append(getCarColor());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _carId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _carName;
	private String _carModel;
	private int _carModelYear;
	private String _carColor;
	private BaseModel<?> _carsRemoteModel;
}