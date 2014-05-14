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

package com.ys.cert.cars.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the cars local service. This utility wraps {@link com.ys.cert.cars.service.impl.CarsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author AC70602
 * @see CarsLocalService
 * @see com.ys.cert.cars.service.base.CarsLocalServiceBaseImpl
 * @see com.ys.cert.cars.service.impl.CarsLocalServiceImpl
 * @generated
 */
public class CarsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ys.cert.cars.service.impl.CarsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the cars to the database. Also notifies the appropriate model listeners.
	*
	* @param cars the cars
	* @return the cars that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.cars.model.Cars addCars(
		com.ys.cert.cars.model.Cars cars)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCars(cars);
	}

	/**
	* Creates a new cars with the primary key. Does not add the cars to the database.
	*
	* @param carId the primary key for the new cars
	* @return the new cars
	*/
	public static com.ys.cert.cars.model.Cars createCars(long carId) {
		return getService().createCars(carId);
	}

	/**
	* Deletes the cars with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param carId the primary key of the cars
	* @return the cars that was removed
	* @throws PortalException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.cars.model.Cars deleteCars(long carId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCars(carId);
	}

	/**
	* Deletes the cars from the database. Also notifies the appropriate model listeners.
	*
	* @param cars the cars
	* @return the cars that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.cars.model.Cars deleteCars(
		com.ys.cert.cars.model.Cars cars)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCars(cars);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.ys.cert.cars.model.Cars fetchCars(long carId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCars(carId);
	}

	/**
	* Returns the cars with the primary key.
	*
	* @param carId the primary key of the cars
	* @return the cars
	* @throws PortalException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.cars.model.Cars getCars(long carId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCars(carId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the carses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @return the range of carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.cars.model.Cars> getCarses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCarses(start, end);
	}

	/**
	* Returns the number of carses.
	*
	* @return the number of carses
	* @throws SystemException if a system exception occurred
	*/
	public static int getCarsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCarsesCount();
	}

	/**
	* Updates the cars in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cars the cars
	* @return the cars that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.cars.model.Cars updateCars(
		com.ys.cert.cars.model.Cars cars)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCars(cars);
	}

	/**
	* Updates the cars in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cars the cars
	* @param merge whether to merge the cars with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the cars that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.cars.model.Cars updateCars(
		com.ys.cert.cars.model.Cars cars, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCars(cars, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static CarsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CarsLocalService.class.getName());

			if (invokableLocalService instanceof CarsLocalService) {
				_service = (CarsLocalService)invokableLocalService;
			}
			else {
				_service = new CarsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CarsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(CarsLocalService service) {
	}

	private static CarsLocalService _service;
}