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
 * FOR A CarsICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ys.cert.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.ys.cert.model.Cars;
import com.ys.cert.service.base.CarsLocalServiceBaseImpl;

/**
 * The implementation of the cars local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ys.cert.service.CarsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author AC70602
 * @see com.ys.cert.service.base.CarsLocalServiceBaseImpl
 * @see com.ys.cert.service.CarsLocalServiceUtil
 */
public class CarsLocalServiceImpl extends CarsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ys.cert.service.CarsLocalServiceUtil} to access the cars local service.
	 */
	
		/**
	 * Adds the Cars to the database incrementing the primary key
	 *
	 */
	public Cars addCars(Cars cars) throws SystemException {
		long carId = counterLocalService.increment(Cars.class.getName());

		cars.setCarId(carId);

		return super.addCars(cars);
	}

	public List<Cars> getCarsByCarModel(String carModel) throws SystemException {
		return carsPersistence.findByCarModel(carModel);
	}

	public List<Cars> getCarsByCarModelYear(int carModelYear) throws SystemException {
		return carsPersistence.findByCarModelYear(carModelYear);
	}

}