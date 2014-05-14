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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.ys.cert.NoSuchTruckException;
import com.ys.cert.model.Truck;
import com.ys.cert.model.impl.TruckImpl;
import com.ys.cert.model.impl.TruckModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the truck service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AC70602
 * @see TruckPersistence
 * @see TruckUtil
 * @generated
 */
public class TruckPersistenceImpl extends BasePersistenceImpl<Truck>
	implements TruckPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TruckUtil} to access the truck persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TruckImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRUCKMODEL =
		new FinderPath(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckModelImpl.FINDER_CACHE_ENABLED, TruckImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTruckModel",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRUCKMODEL =
		new FinderPath(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckModelImpl.FINDER_CACHE_ENABLED, TruckImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTruckModel",
			new String[] { String.class.getName() },
			TruckModelImpl.TRUCKMODEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRUCKMODEL = new FinderPath(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTruckModel",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckModelImpl.FINDER_CACHE_ENABLED, TruckImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckModelImpl.FINDER_CACHE_ENABLED, TruckImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the truck in the entity cache if it is enabled.
	 *
	 * @param truck the truck
	 */
	public void cacheResult(Truck truck) {
		EntityCacheUtil.putResult(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckImpl.class, truck.getPrimaryKey(), truck);

		truck.resetOriginalValues();
	}

	/**
	 * Caches the trucks in the entity cache if it is enabled.
	 *
	 * @param trucks the trucks
	 */
	public void cacheResult(List<Truck> trucks) {
		for (Truck truck : trucks) {
			if (EntityCacheUtil.getResult(TruckModelImpl.ENTITY_CACHE_ENABLED,
						TruckImpl.class, truck.getPrimaryKey()) == null) {
				cacheResult(truck);
			}
			else {
				truck.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all trucks.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TruckImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TruckImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the truck.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Truck truck) {
		EntityCacheUtil.removeResult(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckImpl.class, truck.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Truck> trucks) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Truck truck : trucks) {
			EntityCacheUtil.removeResult(TruckModelImpl.ENTITY_CACHE_ENABLED,
				TruckImpl.class, truck.getPrimaryKey());
		}
	}

	/**
	 * Creates a new truck with the primary key. Does not add the truck to the database.
	 *
	 * @param truckId the primary key for the new truck
	 * @return the new truck
	 */
	public Truck create(long truckId) {
		Truck truck = new TruckImpl();

		truck.setNew(true);
		truck.setPrimaryKey(truckId);

		return truck;
	}

	/**
	 * Removes the truck with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param truckId the primary key of the truck
	 * @return the truck that was removed
	 * @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Truck remove(long truckId)
		throws NoSuchTruckException, SystemException {
		return remove(Long.valueOf(truckId));
	}

	/**
	 * Removes the truck with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the truck
	 * @return the truck that was removed
	 * @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Truck remove(Serializable primaryKey)
		throws NoSuchTruckException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Truck truck = (Truck)session.get(TruckImpl.class, primaryKey);

			if (truck == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTruckException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(truck);
		}
		catch (NoSuchTruckException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Truck removeImpl(Truck truck) throws SystemException {
		truck = toUnwrappedModel(truck);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, truck);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(truck);

		return truck;
	}

	@Override
	public Truck updateImpl(com.ys.cert.model.Truck truck, boolean merge)
		throws SystemException {
		truck = toUnwrappedModel(truck);

		boolean isNew = truck.isNew();

		TruckModelImpl truckModelImpl = (TruckModelImpl)truck;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, truck, merge);

			truck.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TruckModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((truckModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRUCKMODEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						truckModelImpl.getOriginalTruckModel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRUCKMODEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRUCKMODEL,
					args);

				args = new Object[] { truckModelImpl.getTruckModel() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRUCKMODEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRUCKMODEL,
					args);
			}
		}

		EntityCacheUtil.putResult(TruckModelImpl.ENTITY_CACHE_ENABLED,
			TruckImpl.class, truck.getPrimaryKey(), truck);

		return truck;
	}

	protected Truck toUnwrappedModel(Truck truck) {
		if (truck instanceof TruckImpl) {
			return truck;
		}

		TruckImpl truckImpl = new TruckImpl();

		truckImpl.setNew(truck.isNew());
		truckImpl.setPrimaryKey(truck.getPrimaryKey());

		truckImpl.setTruckId(truck.getTruckId());
		truckImpl.setGroupId(truck.getGroupId());
		truckImpl.setCompanyId(truck.getCompanyId());
		truckImpl.setUserId(truck.getUserId());
		truckImpl.setUserName(truck.getUserName());
		truckImpl.setCreateDate(truck.getCreateDate());
		truckImpl.setModifiedDate(truck.getModifiedDate());
		truckImpl.setTruckName(truck.getTruckName());
		truckImpl.setTruckModel(truck.getTruckModel());
		truckImpl.setTruckModelYear(truck.getTruckModelYear());
		truckImpl.setTruckColor(truck.getTruckColor());

		return truckImpl;
	}

	/**
	 * Returns the truck with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the truck
	 * @return the truck
	 * @throws com.liferay.portal.NoSuchModelException if a truck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Truck findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the truck with the primary key or throws a {@link com.ys.cert.NoSuchTruckException} if it could not be found.
	 *
	 * @param truckId the primary key of the truck
	 * @return the truck
	 * @throws com.ys.cert.NoSuchTruckException if a truck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Truck findByPrimaryKey(long truckId)
		throws NoSuchTruckException, SystemException {
		Truck truck = fetchByPrimaryKey(truckId);

		if (truck == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + truckId);
			}

			throw new NoSuchTruckException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				truckId);
		}

		return truck;
	}

	/**
	 * Returns the truck with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the truck
	 * @return the truck, or <code>null</code> if a truck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Truck fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the truck with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param truckId the primary key of the truck
	 * @return the truck, or <code>null</code> if a truck with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Truck fetchByPrimaryKey(long truckId) throws SystemException {
		Truck truck = (Truck)EntityCacheUtil.getResult(TruckModelImpl.ENTITY_CACHE_ENABLED,
				TruckImpl.class, truckId);

		if (truck == _nullTruck) {
			return null;
		}

		if (truck == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				truck = (Truck)session.get(TruckImpl.class,
						Long.valueOf(truckId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (truck != null) {
					cacheResult(truck);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TruckModelImpl.ENTITY_CACHE_ENABLED,
						TruckImpl.class, truckId, _nullTruck);
				}

				closeSession(session);
			}
		}

		return truck;
	}

	/**
	 * Returns all the trucks where truckModel = &#63;.
	 *
	 * @param truckModel the truck model
	 * @return the matching trucks
	 * @throws SystemException if a system exception occurred
	 */
	public List<Truck> findByTruckModel(String truckModel)
		throws SystemException {
		return findByTruckModel(truckModel, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<Truck> findByTruckModel(String truckModel, int start, int end)
		throws SystemException {
		return findByTruckModel(truckModel, start, end, null);
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
	public List<Truck> findByTruckModel(String truckModel, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRUCKMODEL;
			finderArgs = new Object[] { truckModel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRUCKMODEL;
			finderArgs = new Object[] { truckModel, start, end, orderByComparator };
		}

		List<Truck> list = (List<Truck>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Truck truck : list) {
				if (!Validator.equals(truckModel, truck.getTruckModel())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TRUCK_WHERE);

			if (truckModel == null) {
				query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_1);
			}
			else {
				if (truckModel.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_3);
				}
				else {
					query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TruckModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (truckModel != null) {
					qPos.add(truckModel);
				}

				list = (List<Truck>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public Truck findByTruckModel_First(String truckModel,
		OrderByComparator orderByComparator)
		throws NoSuchTruckException, SystemException {
		Truck truck = fetchByTruckModel_First(truckModel, orderByComparator);

		if (truck != null) {
			return truck;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("truckModel=");
		msg.append(truckModel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTruckException(msg.toString());
	}

	/**
	 * Returns the first truck in the ordered set where truckModel = &#63;.
	 *
	 * @param truckModel the truck model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching truck, or <code>null</code> if a matching truck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Truck fetchByTruckModel_First(String truckModel,
		OrderByComparator orderByComparator) throws SystemException {
		List<Truck> list = findByTruckModel(truckModel, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Truck findByTruckModel_Last(String truckModel,
		OrderByComparator orderByComparator)
		throws NoSuchTruckException, SystemException {
		Truck truck = fetchByTruckModel_Last(truckModel, orderByComparator);

		if (truck != null) {
			return truck;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("truckModel=");
		msg.append(truckModel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTruckException(msg.toString());
	}

	/**
	 * Returns the last truck in the ordered set where truckModel = &#63;.
	 *
	 * @param truckModel the truck model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching truck, or <code>null</code> if a matching truck could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Truck fetchByTruckModel_Last(String truckModel,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTruckModel(truckModel);

		List<Truck> list = findByTruckModel(truckModel, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Truck[] findByTruckModel_PrevAndNext(long truckId,
		String truckModel, OrderByComparator orderByComparator)
		throws NoSuchTruckException, SystemException {
		Truck truck = findByPrimaryKey(truckId);

		Session session = null;

		try {
			session = openSession();

			Truck[] array = new TruckImpl[3];

			array[0] = getByTruckModel_PrevAndNext(session, truck, truckModel,
					orderByComparator, true);

			array[1] = truck;

			array[2] = getByTruckModel_PrevAndNext(session, truck, truckModel,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Truck getByTruckModel_PrevAndNext(Session session, Truck truck,
		String truckModel, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRUCK_WHERE);

		if (truckModel == null) {
			query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_1);
		}
		else {
			if (truckModel.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_3);
			}
			else {
				query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TruckModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (truckModel != null) {
			qPos.add(truckModel);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(truck);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Truck> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the trucks.
	 *
	 * @return the trucks
	 * @throws SystemException if a system exception occurred
	 */
	public List<Truck> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Truck> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Truck> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Truck> list = (List<Truck>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TRUCK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRUCK.concat(TruckModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Truck>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Truck>)QueryUtil.list(q, getDialect(), start,
							end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the trucks where truckModel = &#63; from the database.
	 *
	 * @param truckModel the truck model
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTruckModel(String truckModel) throws SystemException {
		for (Truck truck : findByTruckModel(truckModel)) {
			remove(truck);
		}
	}

	/**
	 * Removes all the trucks from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Truck truck : findAll()) {
			remove(truck);
		}
	}

	/**
	 * Returns the number of trucks where truckModel = &#63;.
	 *
	 * @param truckModel the truck model
	 * @return the number of matching trucks
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTruckModel(String truckModel) throws SystemException {
		Object[] finderArgs = new Object[] { truckModel };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TRUCKMODEL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRUCK_WHERE);

			if (truckModel == null) {
				query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_1);
			}
			else {
				if (truckModel.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_3);
				}
				else {
					query.append(_FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (truckModel != null) {
					qPos.add(truckModel);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TRUCKMODEL,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of trucks.
	 *
	 * @return the number of trucks
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRUCK);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the truck persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ys.cert.model.Truck")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Truck>> listenersList = new ArrayList<ModelListener<Truck>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<Truck>)InstanceFactory.newInstance(
							clazz.getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TruckImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CarsPersistence.class)
	protected CarsPersistence carsPersistence;
	@BeanReference(type = TruckPersistence.class)
	protected TruckPersistence truckPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TRUCK = "SELECT truck FROM Truck truck";
	private static final String _SQL_SELECT_TRUCK_WHERE = "SELECT truck FROM Truck truck WHERE ";
	private static final String _SQL_COUNT_TRUCK = "SELECT COUNT(truck) FROM Truck truck";
	private static final String _SQL_COUNT_TRUCK_WHERE = "SELECT COUNT(truck) FROM Truck truck WHERE ";
	private static final String _FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_1 = "truck.truckModel IS NULL";
	private static final String _FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_2 = "truck.truckModel = ?";
	private static final String _FINDER_COLUMN_TRUCKMODEL_TRUCKMODEL_3 = "(truck.truckModel IS NULL OR truck.truckModel = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "truck.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Truck exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Truck exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TruckPersistenceImpl.class);
	private static Truck _nullTruck = new TruckImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Truck> toCacheModel() {
				return _nullTruckCacheModel;
			}
		};

	private static CacheModel<Truck> _nullTruckCacheModel = new CacheModel<Truck>() {
			public Truck toEntityModel() {
				return _nullTruck;
			}
		};
}