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

import com.liferay.portal.service.persistence.BasePersistence;

import com.ys.cert.model.Cars;

/**
 * The persistence interface for the cars service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AC70602
 * @see CarsPersistenceImpl
 * @see CarsUtil
 * @generated
 */
public interface CarsPersistence extends BasePersistence<Cars> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CarsUtil} to access the cars persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cars in the entity cache if it is enabled.
	*
	* @param cars the cars
	*/
	public void cacheResult(com.ys.cert.model.Cars cars);

	/**
	* Caches the carses in the entity cache if it is enabled.
	*
	* @param carses the carses
	*/
	public void cacheResult(java.util.List<com.ys.cert.model.Cars> carses);

	/**
	* Creates a new cars with the primary key. Does not add the cars to the database.
	*
	* @param carId the primary key for the new cars
	* @return the new cars
	*/
	public com.ys.cert.model.Cars create(long carId);

	/**
	* Removes the cars with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param carId the primary key of the cars
	* @return the cars that was removed
	* @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars remove(long carId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	public com.ys.cert.model.Cars updateImpl(com.ys.cert.model.Cars cars,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cars with the primary key or throws a {@link com.ys.cert.NoSuchCarsException} if it could not be found.
	*
	* @param carId the primary key of the cars
	* @return the cars
	* @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars findByPrimaryKey(long carId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns the cars with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param carId the primary key of the cars
	* @return the cars, or <code>null</code> if a cars with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars fetchByPrimaryKey(long carId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the carses where carModel = &#63;.
	*
	* @param carModel the car model
	* @return the matching carses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Cars> findByCarModel(
		java.lang.String carModel)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findByCarModel(
		java.lang.String carModel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findByCarModel(
		java.lang.String carModel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars findByCarModel_First(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns the first cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars fetchByCarModel_First(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars findByCarModel_Last(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns the last cars in the ordered set where carModel = &#63;.
	*
	* @param carModel the car model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars fetchByCarModel_Last(
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ys.cert.model.Cars[] findByCarModel_PrevAndNext(long carId,
		java.lang.String carModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns all the carses where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @return the matching carses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Cars> findByCarModelYear(
		int carModelYear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findByCarModelYear(
		int carModelYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findByCarModelYear(
		int carModelYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars findByCarModelYear_First(int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns the first cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars fetchByCarModelYear_First(int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars findByCarModelYear_Last(int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns the last cars in the ordered set where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars fetchByCarModelYear_Last(int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ys.cert.model.Cars[] findByCarModelYear_PrevAndNext(long carId,
		int carModelYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns all the carses where carName = &#63;.
	*
	* @param carName the car name
	* @return the matching carses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Cars> findByCarName(
		java.lang.String carName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findByCarName(
		java.lang.String carName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findByCarName(
		java.lang.String carName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars findByCarName_First(
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns the first cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars fetchByCarName_First(
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars
	* @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars findByCarName_Last(java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns the last cars in the ordered set where carName = &#63;.
	*
	* @param carName the car name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cars, or <code>null</code> if a matching cars could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Cars fetchByCarName_Last(
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ys.cert.model.Cars[] findByCarName_PrevAndNext(long carId,
		java.lang.String carName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchCarsException;

	/**
	* Returns all the carses.
	*
	* @return the carses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Cars> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Cars> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the carses where carModel = &#63; from the database.
	*
	* @param carModel the car model
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCarModel(java.lang.String carModel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the carses where carModelYear = &#63; from the database.
	*
	* @param carModelYear the car model year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCarModelYear(int carModelYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the carses where carName = &#63; from the database.
	*
	* @param carName the car name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCarName(java.lang.String carName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the carses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of carses where carModel = &#63;.
	*
	* @param carModel the car model
	* @return the number of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCarModel(java.lang.String carModel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of carses where carModelYear = &#63;.
	*
	* @param carModelYear the car model year
	* @return the number of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCarModelYear(int carModelYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of carses where carName = &#63;.
	*
	* @param carName the car name
	* @return the number of matching carses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCarName(java.lang.String carName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of carses.
	*
	* @return the number of carses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}