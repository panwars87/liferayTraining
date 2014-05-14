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

import com.ys.cert.NoSuchCarsException;
import com.ys.cert.model.Cars;
import com.ys.cert.model.impl.CarsImpl;
import com.ys.cert.model.impl.CarsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cars service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AC70602
 * @see CarsPersistence
 * @see CarsUtil
 * @generated
 */
public class CarsPersistenceImpl extends BasePersistenceImpl<Cars>
	implements CarsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CarsUtil} to access the cars persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CarsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CARMODEL = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCarModel",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODEL =
		new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCarModel",
			new String[] { String.class.getName() },
			CarsModelImpl.CARMODEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CARMODEL = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCarModel",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CARMODELYEAR =
		new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCarModelYear",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODELYEAR =
		new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCarModelYear",
			new String[] { Integer.class.getName() },
			CarsModelImpl.CARMODELYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CARMODELYEAR = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCarModelYear",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CARNAME = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCarName",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARNAME =
		new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCarName",
			new String[] { String.class.getName() },
			CarsModelImpl.CARNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CARNAME = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCarName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, CarsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the cars in the entity cache if it is enabled.
	 *
	 * @param cars the cars
	 */
	public void cacheResult(Cars cars) {
		EntityCacheUtil.putResult(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsImpl.class, cars.getPrimaryKey(), cars);

		cars.resetOriginalValues();
	}

	/**
	 * Caches the carses in the entity cache if it is enabled.
	 *
	 * @param carses the carses
	 */
	public void cacheResult(List<Cars> carses) {
		for (Cars cars : carses) {
			if (EntityCacheUtil.getResult(CarsModelImpl.ENTITY_CACHE_ENABLED,
						CarsImpl.class, cars.getPrimaryKey()) == null) {
				cacheResult(cars);
			}
			else {
				cars.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all carses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CarsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CarsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cars.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Cars cars) {
		EntityCacheUtil.removeResult(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsImpl.class, cars.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Cars> carses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Cars cars : carses) {
			EntityCacheUtil.removeResult(CarsModelImpl.ENTITY_CACHE_ENABLED,
				CarsImpl.class, cars.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cars with the primary key. Does not add the cars to the database.
	 *
	 * @param carId the primary key for the new cars
	 * @return the new cars
	 */
	public Cars create(long carId) {
		Cars cars = new CarsImpl();

		cars.setNew(true);
		cars.setPrimaryKey(carId);

		return cars;
	}

	/**
	 * Removes the cars with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carId the primary key of the cars
	 * @return the cars that was removed
	 * @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars remove(long carId) throws NoSuchCarsException, SystemException {
		return remove(Long.valueOf(carId));
	}

	/**
	 * Removes the cars with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cars
	 * @return the cars that was removed
	 * @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cars remove(Serializable primaryKey)
		throws NoSuchCarsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Cars cars = (Cars)session.get(CarsImpl.class, primaryKey);

			if (cars == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCarsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cars);
		}
		catch (NoSuchCarsException nsee) {
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
	protected Cars removeImpl(Cars cars) throws SystemException {
		cars = toUnwrappedModel(cars);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, cars);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(cars);

		return cars;
	}

	@Override
	public Cars updateImpl(com.ys.cert.model.Cars cars, boolean merge)
		throws SystemException {
		cars = toUnwrappedModel(cars);

		boolean isNew = cars.isNew();

		CarsModelImpl carsModelImpl = (CarsModelImpl)cars;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, cars, merge);

			cars.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CarsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((carsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { carsModelImpl.getOriginalCarModel() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARMODEL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODEL,
					args);

				args = new Object[] { carsModelImpl.getCarModel() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARMODEL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODEL,
					args);
			}

			if ((carsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODELYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(carsModelImpl.getOriginalCarModelYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARMODELYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODELYEAR,
					args);

				args = new Object[] {
						Integer.valueOf(carsModelImpl.getCarModelYear())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARMODELYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODELYEAR,
					args);
			}

			if ((carsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { carsModelImpl.getOriginalCarName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARNAME,
					args);

				args = new Object[] { carsModelImpl.getCarName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(CarsModelImpl.ENTITY_CACHE_ENABLED,
			CarsImpl.class, cars.getPrimaryKey(), cars);

		return cars;
	}

	protected Cars toUnwrappedModel(Cars cars) {
		if (cars instanceof CarsImpl) {
			return cars;
		}

		CarsImpl carsImpl = new CarsImpl();

		carsImpl.setNew(cars.isNew());
		carsImpl.setPrimaryKey(cars.getPrimaryKey());

		carsImpl.setCarId(cars.getCarId());
		carsImpl.setGroupId(cars.getGroupId());
		carsImpl.setCompanyId(cars.getCompanyId());
		carsImpl.setUserId(cars.getUserId());
		carsImpl.setUserName(cars.getUserName());
		carsImpl.setCreateDate(cars.getCreateDate());
		carsImpl.setModifiedDate(cars.getModifiedDate());
		carsImpl.setCarName(cars.getCarName());
		carsImpl.setCarModel(cars.getCarModel());
		carsImpl.setCarModelYear(cars.getCarModelYear());
		carsImpl.setCarColor(cars.getCarColor());

		return carsImpl;
	}

	/**
	 * Returns the cars with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cars
	 * @return the cars
	 * @throws com.liferay.portal.NoSuchModelException if a cars with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cars findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the cars with the primary key or throws a {@link com.ys.cert.NoSuchCarsException} if it could not be found.
	 *
	 * @param carId the primary key of the cars
	 * @return the cars
	 * @throws com.ys.cert.NoSuchCarsException if a cars with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars findByPrimaryKey(long carId)
		throws NoSuchCarsException, SystemException {
		Cars cars = fetchByPrimaryKey(carId);

		if (cars == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + carId);
			}

			throw new NoSuchCarsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				carId);
		}

		return cars;
	}

	/**
	 * Returns the cars with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cars
	 * @return the cars, or <code>null</code> if a cars with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cars fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the cars with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param carId the primary key of the cars
	 * @return the cars, or <code>null</code> if a cars with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars fetchByPrimaryKey(long carId) throws SystemException {
		Cars cars = (Cars)EntityCacheUtil.getResult(CarsModelImpl.ENTITY_CACHE_ENABLED,
				CarsImpl.class, carId);

		if (cars == _nullCars) {
			return null;
		}

		if (cars == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				cars = (Cars)session.get(CarsImpl.class, Long.valueOf(carId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (cars != null) {
					cacheResult(cars);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(CarsModelImpl.ENTITY_CACHE_ENABLED,
						CarsImpl.class, carId, _nullCars);
				}

				closeSession(session);
			}
		}

		return cars;
	}

	/**
	 * Returns all the carses where carModel = &#63;.
	 *
	 * @param carModel the car model
	 * @return the matching carses
	 * @throws SystemException if a system exception occurred
	 */
	public List<Cars> findByCarModel(String carModel) throws SystemException {
		return findByCarModel(carModel, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	public List<Cars> findByCarModel(String carModel, int start, int end)
		throws SystemException {
		return findByCarModel(carModel, start, end, null);
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
	public List<Cars> findByCarModel(String carModel, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODEL;
			finderArgs = new Object[] { carModel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CARMODEL;
			finderArgs = new Object[] { carModel, start, end, orderByComparator };
		}

		List<Cars> list = (List<Cars>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Cars cars : list) {
				if (!Validator.equals(carModel, cars.getCarModel())) {
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

			query.append(_SQL_SELECT_CARS_WHERE);

			if (carModel == null) {
				query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_1);
			}
			else {
				if (carModel.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_3);
				}
				else {
					query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(CarsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (carModel != null) {
					qPos.add(carModel);
				}

				list = (List<Cars>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first cars in the ordered set where carModel = &#63;.
	 *
	 * @param carModel the car model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cars
	 * @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars findByCarModel_First(String carModel,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = fetchByCarModel_First(carModel, orderByComparator);

		if (cars != null) {
			return cars;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("carModel=");
		msg.append(carModel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarsException(msg.toString());
	}

	/**
	 * Returns the first cars in the ordered set where carModel = &#63;.
	 *
	 * @param carModel the car model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cars, or <code>null</code> if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars fetchByCarModel_First(String carModel,
		OrderByComparator orderByComparator) throws SystemException {
		List<Cars> list = findByCarModel(carModel, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Cars findByCarModel_Last(String carModel,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = fetchByCarModel_Last(carModel, orderByComparator);

		if (cars != null) {
			return cars;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("carModel=");
		msg.append(carModel);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarsException(msg.toString());
	}

	/**
	 * Returns the last cars in the ordered set where carModel = &#63;.
	 *
	 * @param carModel the car model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cars, or <code>null</code> if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars fetchByCarModel_Last(String carModel,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCarModel(carModel);

		List<Cars> list = findByCarModel(carModel, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Cars[] findByCarModel_PrevAndNext(long carId, String carModel,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = findByPrimaryKey(carId);

		Session session = null;

		try {
			session = openSession();

			Cars[] array = new CarsImpl[3];

			array[0] = getByCarModel_PrevAndNext(session, cars, carModel,
					orderByComparator, true);

			array[1] = cars;

			array[2] = getByCarModel_PrevAndNext(session, cars, carModel,
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

	protected Cars getByCarModel_PrevAndNext(Session session, Cars cars,
		String carModel, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CARS_WHERE);

		if (carModel == null) {
			query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_1);
		}
		else {
			if (carModel.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_3);
			}
			else {
				query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_2);
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
			query.append(CarsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (carModel != null) {
			qPos.add(carModel);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cars);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Cars> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the carses where carModelYear = &#63;.
	 *
	 * @param carModelYear the car model year
	 * @return the matching carses
	 * @throws SystemException if a system exception occurred
	 */
	public List<Cars> findByCarModelYear(int carModelYear)
		throws SystemException {
		return findByCarModelYear(carModelYear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<Cars> findByCarModelYear(int carModelYear, int start, int end)
		throws SystemException {
		return findByCarModelYear(carModelYear, start, end, null);
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
	public List<Cars> findByCarModelYear(int carModelYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARMODELYEAR;
			finderArgs = new Object[] { carModelYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CARMODELYEAR;
			finderArgs = new Object[] {
					carModelYear,
					
					start, end, orderByComparator
				};
		}

		List<Cars> list = (List<Cars>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Cars cars : list) {
				if ((carModelYear != cars.getCarModelYear())) {
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

			query.append(_SQL_SELECT_CARS_WHERE);

			query.append(_FINDER_COLUMN_CARMODELYEAR_CARMODELYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(CarsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(carModelYear);

				list = (List<Cars>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first cars in the ordered set where carModelYear = &#63;.
	 *
	 * @param carModelYear the car model year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cars
	 * @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars findByCarModelYear_First(int carModelYear,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = fetchByCarModelYear_First(carModelYear, orderByComparator);

		if (cars != null) {
			return cars;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("carModelYear=");
		msg.append(carModelYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarsException(msg.toString());
	}

	/**
	 * Returns the first cars in the ordered set where carModelYear = &#63;.
	 *
	 * @param carModelYear the car model year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cars, or <code>null</code> if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars fetchByCarModelYear_First(int carModelYear,
		OrderByComparator orderByComparator) throws SystemException {
		List<Cars> list = findByCarModelYear(carModelYear, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Cars findByCarModelYear_Last(int carModelYear,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = fetchByCarModelYear_Last(carModelYear, orderByComparator);

		if (cars != null) {
			return cars;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("carModelYear=");
		msg.append(carModelYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarsException(msg.toString());
	}

	/**
	 * Returns the last cars in the ordered set where carModelYear = &#63;.
	 *
	 * @param carModelYear the car model year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cars, or <code>null</code> if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars fetchByCarModelYear_Last(int carModelYear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCarModelYear(carModelYear);

		List<Cars> list = findByCarModelYear(carModelYear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Cars[] findByCarModelYear_PrevAndNext(long carId, int carModelYear,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = findByPrimaryKey(carId);

		Session session = null;

		try {
			session = openSession();

			Cars[] array = new CarsImpl[3];

			array[0] = getByCarModelYear_PrevAndNext(session, cars,
					carModelYear, orderByComparator, true);

			array[1] = cars;

			array[2] = getByCarModelYear_PrevAndNext(session, cars,
					carModelYear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Cars getByCarModelYear_PrevAndNext(Session session, Cars cars,
		int carModelYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CARS_WHERE);

		query.append(_FINDER_COLUMN_CARMODELYEAR_CARMODELYEAR_2);

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
			query.append(CarsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(carModelYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cars);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Cars> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the carses where carName = &#63;.
	 *
	 * @param carName the car name
	 * @return the matching carses
	 * @throws SystemException if a system exception occurred
	 */
	public List<Cars> findByCarName(String carName) throws SystemException {
		return findByCarName(carName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Cars> findByCarName(String carName, int start, int end)
		throws SystemException {
		return findByCarName(carName, start, end, null);
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
	public List<Cars> findByCarName(String carName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARNAME;
			finderArgs = new Object[] { carName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CARNAME;
			finderArgs = new Object[] { carName, start, end, orderByComparator };
		}

		List<Cars> list = (List<Cars>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Cars cars : list) {
				if (!Validator.equals(carName, cars.getCarName())) {
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

			query.append(_SQL_SELECT_CARS_WHERE);

			if (carName == null) {
				query.append(_FINDER_COLUMN_CARNAME_CARNAME_1);
			}
			else {
				if (carName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CARNAME_CARNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CARNAME_CARNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(CarsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (carName != null) {
					qPos.add(carName);
				}

				list = (List<Cars>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first cars in the ordered set where carName = &#63;.
	 *
	 * @param carName the car name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cars
	 * @throws com.ys.cert.NoSuchCarsException if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars findByCarName_First(String carName,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = fetchByCarName_First(carName, orderByComparator);

		if (cars != null) {
			return cars;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("carName=");
		msg.append(carName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarsException(msg.toString());
	}

	/**
	 * Returns the first cars in the ordered set where carName = &#63;.
	 *
	 * @param carName the car name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cars, or <code>null</code> if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars fetchByCarName_First(String carName,
		OrderByComparator orderByComparator) throws SystemException {
		List<Cars> list = findByCarName(carName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Cars findByCarName_Last(String carName,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = fetchByCarName_Last(carName, orderByComparator);

		if (cars != null) {
			return cars;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("carName=");
		msg.append(carName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCarsException(msg.toString());
	}

	/**
	 * Returns the last cars in the ordered set where carName = &#63;.
	 *
	 * @param carName the car name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cars, or <code>null</code> if a matching cars could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Cars fetchByCarName_Last(String carName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCarName(carName);

		List<Cars> list = findByCarName(carName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public Cars[] findByCarName_PrevAndNext(long carId, String carName,
		OrderByComparator orderByComparator)
		throws NoSuchCarsException, SystemException {
		Cars cars = findByPrimaryKey(carId);

		Session session = null;

		try {
			session = openSession();

			Cars[] array = new CarsImpl[3];

			array[0] = getByCarName_PrevAndNext(session, cars, carName,
					orderByComparator, true);

			array[1] = cars;

			array[2] = getByCarName_PrevAndNext(session, cars, carName,
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

	protected Cars getByCarName_PrevAndNext(Session session, Cars cars,
		String carName, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CARS_WHERE);

		if (carName == null) {
			query.append(_FINDER_COLUMN_CARNAME_CARNAME_1);
		}
		else {
			if (carName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CARNAME_CARNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_CARNAME_CARNAME_2);
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
			query.append(CarsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (carName != null) {
			qPos.add(carName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cars);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Cars> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the carses.
	 *
	 * @return the carses
	 * @throws SystemException if a system exception occurred
	 */
	public List<Cars> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Cars> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Cars> findAll(int start, int end,
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

		List<Cars> list = (List<Cars>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CARS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CARS.concat(CarsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Cars>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Cars>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the carses where carModel = &#63; from the database.
	 *
	 * @param carModel the car model
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCarModel(String carModel) throws SystemException {
		for (Cars cars : findByCarModel(carModel)) {
			remove(cars);
		}
	}

	/**
	 * Removes all the carses where carModelYear = &#63; from the database.
	 *
	 * @param carModelYear the car model year
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCarModelYear(int carModelYear)
		throws SystemException {
		for (Cars cars : findByCarModelYear(carModelYear)) {
			remove(cars);
		}
	}

	/**
	 * Removes all the carses where carName = &#63; from the database.
	 *
	 * @param carName the car name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCarName(String carName) throws SystemException {
		for (Cars cars : findByCarName(carName)) {
			remove(cars);
		}
	}

	/**
	 * Removes all the carses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Cars cars : findAll()) {
			remove(cars);
		}
	}

	/**
	 * Returns the number of carses where carModel = &#63;.
	 *
	 * @param carModel the car model
	 * @return the number of matching carses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCarModel(String carModel) throws SystemException {
		Object[] finderArgs = new Object[] { carModel };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CARMODEL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CARS_WHERE);

			if (carModel == null) {
				query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_1);
			}
			else {
				if (carModel.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_3);
				}
				else {
					query.append(_FINDER_COLUMN_CARMODEL_CARMODEL_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (carModel != null) {
					qPos.add(carModel);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CARMODEL,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of carses where carModelYear = &#63;.
	 *
	 * @param carModelYear the car model year
	 * @return the number of matching carses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCarModelYear(int carModelYear) throws SystemException {
		Object[] finderArgs = new Object[] { carModelYear };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CARMODELYEAR,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CARS_WHERE);

			query.append(_FINDER_COLUMN_CARMODELYEAR_CARMODELYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(carModelYear);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CARMODELYEAR,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of carses where carName = &#63;.
	 *
	 * @param carName the car name
	 * @return the number of matching carses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCarName(String carName) throws SystemException {
		Object[] finderArgs = new Object[] { carName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CARNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CARS_WHERE);

			if (carName == null) {
				query.append(_FINDER_COLUMN_CARNAME_CARNAME_1);
			}
			else {
				if (carName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CARNAME_CARNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CARNAME_CARNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (carName != null) {
					qPos.add(carName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CARNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of carses.
	 *
	 * @return the number of carses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CARS);

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
	 * Initializes the cars persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ys.cert.model.Cars")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Cars>> listenersList = new ArrayList<ModelListener<Cars>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<Cars>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CarsImpl.class.getName());
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
	private static final String _SQL_SELECT_CARS = "SELECT cars FROM Cars cars";
	private static final String _SQL_SELECT_CARS_WHERE = "SELECT cars FROM Cars cars WHERE ";
	private static final String _SQL_COUNT_CARS = "SELECT COUNT(cars) FROM Cars cars";
	private static final String _SQL_COUNT_CARS_WHERE = "SELECT COUNT(cars) FROM Cars cars WHERE ";
	private static final String _FINDER_COLUMN_CARMODEL_CARMODEL_1 = "cars.carModel IS NULL";
	private static final String _FINDER_COLUMN_CARMODEL_CARMODEL_2 = "cars.carModel = ?";
	private static final String _FINDER_COLUMN_CARMODEL_CARMODEL_3 = "(cars.carModel IS NULL OR cars.carModel = ?)";
	private static final String _FINDER_COLUMN_CARMODELYEAR_CARMODELYEAR_2 = "cars.carModelYear = ?";
	private static final String _FINDER_COLUMN_CARNAME_CARNAME_1 = "cars.carName IS NULL";
	private static final String _FINDER_COLUMN_CARNAME_CARNAME_2 = "cars.carName = ?";
	private static final String _FINDER_COLUMN_CARNAME_CARNAME_3 = "(cars.carName IS NULL OR cars.carName = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cars.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Cars exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Cars exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CarsPersistenceImpl.class);
	private static Cars _nullCars = new CarsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Cars> toCacheModel() {
				return _nullCarsCacheModel;
			}
		};

	private static CacheModel<Cars> _nullCarsCacheModel = new CacheModel<Cars>() {
			public Cars toEntityModel() {
				return _nullCars;
			}
		};
}