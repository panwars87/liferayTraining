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
 * This class is used by SOAP remote services.
 *
 * @author    AC70602
 * @generated
 */
public class TruckSoap implements Serializable {
	public static TruckSoap toSoapModel(Truck model) {
		TruckSoap soapModel = new TruckSoap();

		soapModel.setTruckId(model.getTruckId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTruckName(model.getTruckName());
		soapModel.setTruckModel(model.getTruckModel());
		soapModel.setTruckModelYear(model.getTruckModelYear());
		soapModel.setTruckColor(model.getTruckColor());

		return soapModel;
	}

	public static TruckSoap[] toSoapModels(Truck[] models) {
		TruckSoap[] soapModels = new TruckSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TruckSoap[][] toSoapModels(Truck[][] models) {
		TruckSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TruckSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TruckSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TruckSoap[] toSoapModels(List<Truck> models) {
		List<TruckSoap> soapModels = new ArrayList<TruckSoap>(models.size());

		for (Truck model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TruckSoap[soapModels.size()]);
	}

	public TruckSoap() {
	}

	public long getPrimaryKey() {
		return _truckId;
	}

	public void setPrimaryKey(long pk) {
		setTruckId(pk);
	}

	public long getTruckId() {
		return _truckId;
	}

	public void setTruckId(long truckId) {
		_truckId = truckId;
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

	public String getTruckName() {
		return _truckName;
	}

	public void setTruckName(String truckName) {
		_truckName = truckName;
	}

	public String getTruckModel() {
		return _truckModel;
	}

	public void setTruckModel(String truckModel) {
		_truckModel = truckModel;
	}

	public int getTruckModelYear() {
		return _truckModelYear;
	}

	public void setTruckModelYear(int truckModelYear) {
		_truckModelYear = truckModelYear;
	}

	public String getTruckColor() {
		return _truckColor;
	}

	public void setTruckColor(String truckColor) {
		_truckColor = truckColor;
	}

	private long _truckId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _truckName;
	private String _truckModel;
	private int _truckModelYear;
	private String _truckColor;
}