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

package com.ys.cert.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TruckLocalService}.
 * </p>
 *
 * @author    AC70602
 * @see       TruckLocalService
 * @generated
 */
public class TruckLocalServiceWrapper implements TruckLocalService,
	ServiceWrapper<TruckLocalService> {
	public TruckLocalServiceWrapper(TruckLocalService truckLocalService) {
		_truckLocalService = truckLocalService;
	}

	/**
	* Adds the truck to the database. Also notifies the appropriate model listeners.
	*
	* @param truck the truck
	* @return the truck that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck addTruck(com.ys.cert.model.Truck truck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.addTruck(truck);
	}

	/**
	* Creates a new truck with the primary key. Does not add the truck to the database.
	*
	* @param truckId the primary key for the new truck
	* @return the new truck
	*/
	public com.ys.cert.model.Truck createTruck(long truckId) {
		return _truckLocalService.createTruck(truckId);
	}

	/**
	* Deletes the truck with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param truckId the primary key of the truck
	* @return the truck that was removed
	* @throws PortalException if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck deleteTruck(long truckId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.deleteTruck(truckId);
	}

	/**
	* Deletes the truck from the database. Also notifies the appropriate model listeners.
	*
	* @param truck the truck
	* @return the truck that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck deleteTruck(com.ys.cert.model.Truck truck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.deleteTruck(truck);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _truckLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ys.cert.model.Truck fetchTruck(long truckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.fetchTruck(truckId);
	}

	/**
	* Returns the truck with the primary key.
	*
	* @param truckId the primary key of the truck
	* @return the truck
	* @throws PortalException if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck getTruck(long truckId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.getTruck(truckId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the trucks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of trucks
	* @param end the upper bound of the range of trucks (not inclusive)
	* @return the range of trucks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Truck> getTrucks(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.getTrucks(start, end);
	}

	/**
	* Returns the number of trucks.
	*
	* @return the number of trucks
	* @throws SystemException if a system exception occurred
	*/
	public int getTrucksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.getTrucksCount();
	}

	/**
	* Updates the truck in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param truck the truck
	* @return the truck that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck updateTruck(com.ys.cert.model.Truck truck)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.updateTruck(truck);
	}

	/**
	* Updates the truck in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param truck the truck
	* @param merge whether to merge the truck with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the truck that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck updateTruck(com.ys.cert.model.Truck truck,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.updateTruck(truck, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _truckLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_truckLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _truckLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<com.ys.cert.model.Truck> getTruckByTruckModel(
		java.lang.String truckModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _truckLocalService.getTruckByTruckModel(truckModel);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TruckLocalService getWrappedTruckLocalService() {
		return _truckLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTruckLocalService(TruckLocalService truckLocalService) {
		_truckLocalService = truckLocalService;
	}

	public TruckLocalService getWrappedService() {
		return _truckLocalService;
	}

	public void setWrappedService(TruckLocalService truckLocalService) {
		_truckLocalService = truckLocalService;
	}

	private TruckLocalService _truckLocalService;
}