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

import com.ys.cert.model.Truck;

import java.util.List;

/**
 * The persistence utility for the truck service. This utility wraps {@link TruckPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AC70602
 * @see TruckPersistence
 * @see TruckPersistenceImpl
 * @generated
 */
public class TruckUtil {
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
	public static void clearCache(Truck truck) {
		getPersistence().clearCache(truck);
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
	public static List<Truck> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Truck> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Truck> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Truck update(Truck truck, boolean merge)
		throws SystemException {
		return getPersistence().update(truck, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Truck update(Truck truck, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(truck, merge, serviceContext);
	}

	/**
	* Caches the truck in the entity cache if it is enabled.
	*
	* @param truck the truck
	*/
	public static void cacheResult(com.ys.cert.model.Truck truck) {
		getPersistence().cacheResult(truck);
	}

	/**
	* Caches the trucks in the entity cache if it is enabled.
	*
	* @param trucks the trucks
	*/
	public static void cacheResult(
		java.util.List<com.ys.cert.model.Truck> trucks) {
		getPersistence().cacheResult(trucks);
	}

	/**
	* Creates a new truck with the primary key. Does not add the truck to the database.
	*
	* @param truckId the primary key for the new truck
	* @return the new truck
	*/
	public static com.ys.cert.model.Truck create(long truckId) {
		return getPersistence().create(truckId);
	}

	/**
	* Removes the truck with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param truckId the primary key of the truck
	* @return the truck that was removed
	* @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Truck remove(long truckId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException {
		return getPersistence().remove(truckId);
	}

	public static com.ys.cert.model.Truck updateImpl(
		com.ys.cert.model.Truck truck, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(truck, merge);
	}

	/**
	* Returns the truck with the primary key or throws a {@link com.ys.cert.NoSuchTruckException} if it could not be found.
	*
	* @param truckId the primary key of the truck
	* @return the truck
	* @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Truck findByPrimaryKey(long truckId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException {
		return getPersistence().findByPrimaryKey(truckId);
	}

	/**
	* Returns the truck with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param truckId the primary key of the truck
	* @return the truck, or <code>null</code> if a truck with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Truck fetchByPrimaryKey(long truckId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(truckId);
	}

	/**
	* Returns all the trucks where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @return the matching trucks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Truck> findByTruckModel(
		java.lang.String truckModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTruckModel(truckModel);
	}

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
	public static java.util.List<com.ys.cert.model.Truck> findByTruckModel(
		java.lang.String truckModel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTruckModel(truckModel, start, end);
	}

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
	public static java.util.List<com.ys.cert.model.Truck> findByTruckModel(
		java.lang.String truckModel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTruckModel(truckModel, start, end, orderByComparator);
	}

	/**
	* Returns the first truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching truck
	* @throws com.ys.cert.NoSuchTruckException if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Truck findByTruckModel_First(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException {
		return getPersistence()
				   .findByTruckModel_First(truckModel, orderByComparator);
	}

	/**
	* Returns the first truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching truck, or <code>null</code> if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Truck fetchByTruckModel_First(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTruckModel_First(truckModel, orderByComparator);
	}

	/**
	* Returns the last truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching truck
	* @throws com.ys.cert.NoSuchTruckException if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Truck findByTruckModel_Last(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException {
		return getPersistence()
				   .findByTruckModel_Last(truckModel, orderByComparator);
	}

	/**
	* Returns the last truck in the ordered set where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching truck, or <code>null</code> if a matching truck could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ys.cert.model.Truck fetchByTruckModel_Last(
		java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTruckModel_Last(truckModel, orderByComparator);
	}

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
	public static com.ys.cert.model.Truck[] findByTruckModel_PrevAndNext(
		long truckId, java.lang.String truckModel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.cert.NoSuchTruckException {
		return getPersistence()
				   .findByTruckModel_PrevAndNext(truckId, truckModel,
			orderByComparator);
	}

	/**
	* Returns all the trucks.
	*
	* @return the trucks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ys.cert.model.Truck> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.ys.cert.model.Truck> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ys.cert.model.Truck> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the trucks where truckModel = &#63; from the database.
	*
	* @param truckModel the truck model
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTruckModel(java.lang.String truckModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTruckModel(truckModel);
	}

	/**
	* Removes all the trucks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of trucks where truckModel = &#63;.
	*
	* @param truckModel the truck model
	* @return the number of matching trucks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTruckModel(java.lang.String truckModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTruckModel(truckModel);
	}

	/**
	* Returns the number of trucks.
	*
	* @return the number of trucks
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TruckPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TruckPersistence)PortletBeanLocatorUtil.locate(com.ys.cert.service.ClpSerializer.getServletContextName(),
					TruckPersistence.class.getName());

			ReferenceRegistry.registerReference(TruckUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(TruckPersistence persistence) {
	}

	private static TruckPersistence _persistence;
}