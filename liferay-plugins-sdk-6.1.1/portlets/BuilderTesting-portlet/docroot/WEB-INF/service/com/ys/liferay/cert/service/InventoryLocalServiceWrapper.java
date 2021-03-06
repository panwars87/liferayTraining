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

package com.ys.liferay.cert.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link InventoryLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       InventoryLocalService
 * @generated
 */
public class InventoryLocalServiceWrapper implements InventoryLocalService,
	ServiceWrapper<InventoryLocalService> {
	public InventoryLocalServiceWrapper(
		InventoryLocalService inventoryLocalService) {
		_inventoryLocalService = inventoryLocalService;
	}

	/**
	* Adds the inventory to the database. Also notifies the appropriate model listeners.
	*
	* @param inventory the inventory
	* @return the inventory that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory addInventory(
		com.ys.liferay.cert.model.Inventory inventory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.addInventory(inventory);
	}

	/**
	* Creates a new inventory with the primary key. Does not add the inventory to the database.
	*
	* @param inventoryPK the primary key for the new inventory
	* @return the new inventory
	*/
	public com.ys.liferay.cert.model.Inventory createInventory(
		com.ys.liferay.cert.service.persistence.InventoryPK inventoryPK) {
		return _inventoryLocalService.createInventory(inventoryPK);
	}

	/**
	* Deletes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param inventoryPK the primary key of the inventory
	* @return the inventory that was removed
	* @throws PortalException if a inventory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory deleteInventory(
		com.ys.liferay.cert.service.persistence.InventoryPK inventoryPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.deleteInventory(inventoryPK);
	}

	/**
	* Deletes the inventory from the database. Also notifies the appropriate model listeners.
	*
	* @param inventory the inventory
	* @return the inventory that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory deleteInventory(
		com.ys.liferay.cert.model.Inventory inventory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.deleteInventory(inventory);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _inventoryLocalService.dynamicQuery();
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
		return _inventoryLocalService.dynamicQuery(dynamicQuery);
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
		return _inventoryLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _inventoryLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _inventoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ys.liferay.cert.model.Inventory fetchInventory(
		com.ys.liferay.cert.service.persistence.InventoryPK inventoryPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.fetchInventory(inventoryPK);
	}

	/**
	* Returns the inventory with the primary key.
	*
	* @param inventoryPK the primary key of the inventory
	* @return the inventory
	* @throws PortalException if a inventory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory getInventory(
		com.ys.liferay.cert.service.persistence.InventoryPK inventoryPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.getInventory(inventoryPK);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<com.ys.liferay.cert.model.Inventory> getInventories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.getInventories(start, end);
	}

	/**
	* Returns the number of inventories.
	*
	* @return the number of inventories
	* @throws SystemException if a system exception occurred
	*/
	public int getInventoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.getInventoriesCount();
	}

	/**
	* Updates the inventory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param inventory the inventory
	* @return the inventory that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory updateInventory(
		com.ys.liferay.cert.model.Inventory inventory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.updateInventory(inventory);
	}

	/**
	* Updates the inventory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param inventory the inventory
	* @param merge whether to merge the inventory with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the inventory that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ys.liferay.cert.model.Inventory updateInventory(
		com.ys.liferay.cert.model.Inventory inventory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inventoryLocalService.updateInventory(inventory, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _inventoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_inventoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _inventoryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public InventoryLocalService getWrappedInventoryLocalService() {
		return _inventoryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedInventoryLocalService(
		InventoryLocalService inventoryLocalService) {
		_inventoryLocalService = inventoryLocalService;
	}

	public InventoryLocalService getWrappedService() {
		return _inventoryLocalService;
	}

	public void setWrappedService(InventoryLocalService inventoryLocalService) {
		_inventoryLocalService = inventoryLocalService;
	}

	private InventoryLocalService _inventoryLocalService;
}