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

package com.ys.cert.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.ys.cert.model.Truck;
import com.ys.cert.service.base.TruckLocalServiceBaseImpl;
import com.ys.cert.service.persistence.TruckPersistence;

/**
 * The implementation of the truck local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ys.cert.service.TruckLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author AC70602
 * @see com.ys.cert.service.base.TruckLocalServiceBaseImpl
 * @see com.ys.cert.service.TruckLocalServiceUtil
 */
public class TruckLocalServiceImpl extends TruckLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ys.cert.service.TruckLocalServiceUtil} to access the truck local service.
	 */
	
	/**
	 * Adds the Truck to the database incrementing the primary key
	 *
	 */
	public Truck addTruck(Truck truck) throws SystemException {
		long truckId = counterLocalService.increment(Truck.class.getName());

		truck.setTruckId(truckId);

		return super.addTruck(truck);
	}

	
	public List<Truck> getTruckByTruckModel(String truckModel) throws SystemException {
		
		return truckPersistence.findByTruckModel(truckModel);
	}
}