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

import com.ys.cert.model.Truck;

/**
 * The persistence interface for the truck service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AC70602
 * @see TruckPersistenceImpl
 * @see TruckUtil
 * @generated
 */
public interface TruckPersistence extends BasePersistence<Truck> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TruckUtil} to access the truck persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the truck in the entity cache if it is enabled.
	*
	* @param truck the truck
	*/
	public void cacheResult(com.ys.cert.model.Truck truck);

	/**
	* Caches the trucks in the entity cache if it is enabled.
	*
	* @param trucks the trucks
	*/
	public void cacheResult(java.util.List<com.ys.cert.model.Truck> trucks);

	/**
	* Creates a new truck with the primary key. Does not add the truck to the database.
	*
	* @param truckId the primary key for the new truck
	* @return the new truck
	*/
	public com.ys.cert.model.Truck create(long truckId);

	/**
	* Removes the truck with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param truckId the primary key of the truck
	* @return the truck that was removed
	* @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck remove(long truckId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException;

	public com.ys.cert.model.Truck updateImpl(com.ys.cert.model.Truck truck,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the truck with the primary key or throws a {@link com.ys.cert.NoSuchTruckException} if it could not be found.
	*
	* @param truckId the primary key of the truck
	* @return the truck
	* @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck findByPrimaryKey(long truckId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException;

	/**
	* Returns the truck with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param truckId the primary key of the truck
	* @return the truck, or <code>null</code> if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck fetchByPrimaryKey(long truckId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the trucks where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @return the matching trucks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Truck> findByTruckModel(
		java.lang.String truckModel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the trucks where truckModel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param truckModel the truck model
	* @param start the lower bound of the range of trucks
	* @param end the upper bound of the range of trucks (not inclusive)
	* @return the range of matching trucks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Truck> findByTruckModel(
		java.lang.String truckModel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the trucks where truckModel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param truckModel the truck model
	* @param start the lower bound of the range of trucks
	* @param end the upper bound of the range of trucks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trucks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Truck> findByTruckModel(
		java.lang.String truckModel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching truck
	* @throws com.ys.cert.NoSuchTruckException if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck findByTruckModel_First(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException;

	/**
	* Returns the first truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching truck, or <code>null</code> if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck fetchByTruckModel_First(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching truck
	* @throws com.ys.cert.NoSuchTruckException if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck findByTruckModel_Last(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException;

	/**
	* Returns the last truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching truck, or <code>null</code> if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck fetchByTruckModel_Last(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the trucks before and after the current truck in the ordered set where truckModel = &#63;.
	*
	* @param truckId the primary key of the current truck
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next truck
	* @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.cert.model.Truck[] findByTruckModel_PrevAndNext(
		long truckId, java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException;

	/**
	* Returns all the trucks.
	*
	* @return the trucks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Truck> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ys.cert.model.Truck> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the trucks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of trucks
	* @param end the upper bound of the range of trucks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trucks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.cert.model.Truck> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the trucks where truckModel = &#63; from the database.
	*
	* @param truckModel the truck model
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTruckModel(java.lang.String truckModel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the trucks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of trucks where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @return the number of matching trucks
	* @throws SystemException if a system exception occurred
	*/
	public int countByTruckModel(java.lang.String truckModel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of trucks.
	*
	* @return the number of trucks
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}