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

package com.ys.liferay.cert.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.ys.liferay.cert.model.Inventory;

/**
 * The persistence interface for the inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InventoryPersistenceImpl
 * @see InventoryUtil
 * @generated
 */
public interface InventoryPersistence extends BasePersistence<Inventory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InventoryUtil} to access the inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the inventory in the entity cache if it is enabled.
	*
	* @param inventory the inventory
	*/
	public void cacheResult(com.ys.liferay.cert.model.Inventory inventory);

	/**
	* Caches the inventories in the entity cache if it is enabled.
	*
	* @param inventories the inventories
	*/
	public void cacheResult(
		java.util.List<com.ys.liferay.cert.model.Inventory> inventories);

	/**
	* Creates a new inventory with the primary key. Does not add the inventory to the database.
	*
	* @param inventoryPK the primary key for the new inventory
	* @return the new inventory
	*/
	public com.ys.liferay.cert.model.Inventory create(InventoryPK inventoryPK);

	/**
	* Removes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param inventoryPK the primary key of the inventory
	* @return the inventory that was removed
	* @throws com.ys.liferay.cert.NoSuchInventoryException if a inventory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory remove(InventoryPK inventoryPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.liferay.cert.NoSuchInventoryException;

	public com.ys.liferay.cert.model.Inventory updateImpl(
		com.ys.liferay.cert.model.Inventory inventory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the inventory with the primary key or throws a {@link com.ys.liferay.cert.NoSuchInventoryException} if it could not be found.
	*
	* @param inventoryPK the primary key of the inventory
	* @return the inventory
	* @throws com.ys.liferay.cert.NoSuchInventoryException if a inventory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory findByPrimaryKey(
		InventoryPK inventoryPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.liferay.cert.NoSuchInventoryException;

	/**
	* Returns the inventory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param inventoryPK the primary key of the inventory
	* @return the inventory, or <code>null</code> if a inventory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory fetchByPrimaryKey(
		InventoryPK inventoryPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the inventories.
	*
	* @return the inventories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.liferay.cert.model.Inventory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of inventories
	* @param end the upper bound of the range of inventories (not inclusive)
	* @return the range of inventories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.liferay.cert.model.Inventory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of inventories
	* @param end the upper bound of the range of inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of inventories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ys.liferay.cert.model.Inventory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the inventories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of inventories.
	*
	* @return the number of inventories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}