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

package com.ys.cert.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.ys.cert.model.Cars;

import java.util.List;

/**
 * The persistence utility for the cars service. This utility wraps {@link CarsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AC70602
 * @see CarsPersistence
 * @see CarsPersistenceImpl
 * @generated
 */
public class CarsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Cars cars) {
		getPersistence().clearCache(cars);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Cars> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Cars> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Cars> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Cars update(Cars cars, boolean merge)
		throws SystemException {
		return getPersistence().update(cars, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Cars update(Cars cars, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(cars, merge, serviceContext);
	}

	/**
	* Caches the cars in the entity cache if it is enabled.
	*
	* @param cars the cars
	*/
	public static void cacheResult(com.ys.cert.model.Cars cars) {
		getPersistence().cacheResult(cars);
	}

	/**
	* Caches the carses in the entity cache if it is enabled.
	*
	* @param carses the carses
	*/
	public static void cacheResult(
		java.util.List<com.ys.cert.model.Cars> carses) {
		getPersistence().cacheResult(carses);
	}

	/**
	* Creates a new cars with the primary key. Does not add the cars to the database.
	*
	* @param carId the primary key for the new cars
	* @return the new cars
	*/
	public static com.ys.cert.model.Cars create(long carId) {
		return getPersistence().create(carId);
	}

	/**
	* Removes the cars with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param carId the primary key of the cars
	* @return the cars that was removed
	* @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars remove(long carId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence().remove(carId);
	}

	public static com.ys.cert.model.Cars updateImpl(
		com.ys.cert.model.Cars cars, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cars, merge);
	}

	/**
	* Returns the cars with the primary key or throws a {@link com.ys.cert.NoSuchCarsException} if it could not be found.
	*
	* @param carId the primary key of the cars
	* @return the cars
	* @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars findByPrimaryKey(long carId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence().findByPrimaryKey(carId);
	}

	/**
	* Returns the cars with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param carId the primary key of the cars
	* @return the cars, or <code>null</code> if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars fetchByPrimaryKey(long carId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(carId);
	}

	/**
	* Returns all the carses where carModel = &#63;.
	*
	* @param carModel the car model
	* @return the matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarModel(
		java.lang.String carModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCarModel(carModel);
	}

	/**
	* Returns a range of all the carses where carModel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param carModel the car model
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @return the range of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarModel(
		java.lang.String carModel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCarModel(carModel, start, end);
	}

	/**
	* Returns an ordered range of all the carses where carModel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param carModel the car model
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarModel(
		java.lang.String carModel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCarModel(carModel, start, end, orderByComparator);
	}

	/**
	* Returns the first cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars findByCarModel_First(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence().findByCarModel_First(carModel, orderByComparator);
	}

	/**
	* Returns the first cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars fetchByCarModel_First(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCarModel_First(carModel, orderByComparator);
	}

	/**
	* Returns the last cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars findByCarModel_Last(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence().findByCarModel_Last(carModel, orderByComparator);
	}

	/**
	* Returns the last cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars fetchByCarModel_Last(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCarModel_Last(carModel, orderByComparator);
	}

	/**
	* Returns the carses before and after the current cars in the ordered set where carModel = &#63;.
	*
	* @param carId the primary key of the current cars
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cars
	* @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars[] findByCarModel_PrevAndNext(
		long carId, java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence()
				   .findByCarModel_PrevAndNext(carId, carModel,
			orderByComparator);
	}

	/**
	* Returns all the carses where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @return the matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarModelYear(
		int carModelYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCarModelYear(carModelYear);
	}

	/**
	* Returns a range of all the carses where carModelYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param carModelYear the car model year
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @return the range of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarModelYear(
		int carModelYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCarModelYear(carModelYear, start, end);
	}

	/**
	* Returns an ordered range of all the carses where carModelYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param carModelYear the car model year
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarModelYear(
		int carModelYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCarModelYear(carModelYear, start, end,
			orderByComparator);
	}

	/**
	* Returns the first cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars findByCarModelYear_First(
		int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence()
				   .findByCarModelYear_First(carModelYear, orderByComparator);
	}

	/**
	* Returns the first cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars fetchByCarModelYear_First(
		int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCarModelYear_First(carModelYear, orderByComparator);
	}

	/**
	* Returns the last cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars findByCarModelYear_Last(
		int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence()
				   .findByCarModelYear_Last(carModelYear, orderByComparator);
	}

	/**
	* Returns the last cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars fetchByCarModelYear_Last(
		int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCarModelYear_Last(carModelYear, orderByComparator);
	}

	/**
	* Returns the carses before and after the current cars in the ordered set where carModelYear = &#63;.
	*
	* @param carId the primary key of the current cars
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cars
	* @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars[] findByCarModelYear_PrevAndNext(
		long carId, int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence()
				   .findByCarModelYear_PrevAndNext(carId, carModelYear,
			orderByComparator);
	}

	/**
	* Returns all the carses where carName = &#63;.
	*
	* @param carName the car name
	* @return the matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarName(
		java.lang.String carName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCarName(carName);
	}

	/**
	* Returns a range of all the carses where carName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param carName the car name
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @return the range of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarName(
		java.lang.String carName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCarName(carName, start, end);
	}

	/**
	* Returns an ordered range of all the carses where carName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param carName the car name
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findByCarName(
		java.lang.String carName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCarName(carName, start, end, orderByComparator);
	}

	/**
	* Returns the first cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars findByCarName_First(
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence().findByCarName_First(carName, orderByComparator);
	}

	/**
	* Returns the first cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars fetchByCarName_First(
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCarName_First(carName, orderByComparator);
	}

	/**
	* Returns the last cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars findByCarName_Last(
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence().findByCarName_Last(carName, orderByComparator);
	}

	/**
	* Returns the last cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars fetchByCarName_Last(
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCarName_Last(carName, orderByComparator);
	}

	/**
	* Returns the carses before and after the current cars in the ordered set where carName = &#63;.
	*
	* @param carId the primary key of the current cars
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cars
	* @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Cars[] findByCarName_PrevAndNext(
		long carId, java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException {
		return getPersistence()
				   .findByCarName_PrevAndNext(carId, carName, orderByComparator);
	}

	/**
	* Returns all the carses.
	*
	* @return the carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.ys.cert.model.Cars> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the carses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of carses
	* @param end the upper bound of the range of carses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of carses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Cars> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the carses where carModel = &#63; from the database.
	*
	* @param carModel the car model
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCarModel(java.lang.String carModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCarModel(carModel);
	}

	/**
	* Removes all the carses where carModelYear = &#63; from the database.
	*
	* @param carModelYear the car model year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCarModelYear(int carModelYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCarModelYear(carModelYear);
	}

	/**
	* Removes all the carses where carName = &#63; from the database.
	*
	* @param carName the car name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCarName(java.lang.String carName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCarName(carName);
	}

	/**
	* Removes all the carses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of carses where carModel = &#63;.
	*
	* @param carModel the car model
	* @return the number of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCarModel(java.lang.String carModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCarModel(carModel);
	}

	/**
	* Returns the number of carses where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @return the number of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCarModelYear(int carModelYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCarModelYear(carModelYear);
	}

	/**
	* Returns the number of carses where carName = &#63;.
	*
	* @param carName the car name
	* @return the number of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCarName(java.lang.String carName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCarName(carName);
	}

	/**
	* Returns the number of carses.
	*
	* @return the number of carses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CarsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CarsPersistence)PortletBeanLocatorUtil.locate(com.ys.cert.service.ClpSerializer.getServletContextName(),
					CarsPersistence.class.getName());

			ReferenceRegistry.registerReference(CarsUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(CarsPersistence persistence) {
	}

	private static CarsPersistence _persistence;
}