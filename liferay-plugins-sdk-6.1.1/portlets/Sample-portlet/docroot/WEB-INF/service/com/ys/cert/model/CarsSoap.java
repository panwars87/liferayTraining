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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ys.cert.service.http.CarsServiceSoap}.
 *
 * @author    AC70602
 * @see       com.ys.cert.service.http.CarsServiceSoap
 * @generated
 */
public class CarsSoap implements Serializable {
	public static CarsSoap toSoapModel(Cars model) {
		CarsSoap soapModel = new CarsSoap();

		soapModel.setCarId(model.getCarId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCarName(model.getCarName());
		soapModel.setCarModel(model.getCarModel());
		soapModel.setCarModelYear(model.getCarModelYear());
		soapModel.setCarColor(model.getCarColor());

		return soapModel;
	}

	public static CarsSoap[] toSoapModels(Cars[] models) {
		CarsSoap[] soapModels = new CarsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CarsSoap[][] toSoapModels(Cars[][] models) {
		CarsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CarsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CarsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CarsSoap[] toSoapModels(List<Cars> models) {
		List<CarsSoap> soapModels = new ArrayList<CarsSoap>(models.size());

		for (Cars model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CarsSoap[soapModels.size()]);
	}

	public CarsSoap() {
	}

	public long getPrimaryKey() {
		return _carId;
	}

	public void setPrimaryKey(long pk) {
		setCarId(pk);
	}

	public long getCarId() {
		return _carId;
	}

	public void setCarId(long carId) {
		_carId = carId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getCarName() {
		return _carName;
	}

	public void setCarName(String carName) {
		_carName = carName;
	}

	public String getCarModel() {
		return _carModel;
	}

	public void setCarModel(String carModel) {
		_carModel = carModel;
	}

	public int getCarModelYear() {
		return _carModelYear;
	}

	public void setCarModelYear(int carModelYear) {
		_carModelYear = carModelYear;
	}

	public String getCarColor() {
		return _carColor;
	}

	public void setCarColor(String carColor) {
		_carColor = carColor;
	}

	private long _carId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _carName;
	private String _carModel;
	private int _carModelYear;
	private String _carColor;
}