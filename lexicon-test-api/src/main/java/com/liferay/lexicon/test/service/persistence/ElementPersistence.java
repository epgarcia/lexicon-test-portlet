/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.lexicon.test.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.lexicon.test.exception.NoSuchElementException;
import com.liferay.lexicon.test.model.Element;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the element service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.lexicon.test.service.persistence.impl.ElementPersistenceImpl
 * @see ElementUtil
 * @generated
 */
@ProviderType
public interface ElementPersistence extends BasePersistence<Element> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ElementUtil} to access the element persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the elements where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching elements
	*/
	public java.util.List<Element> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the elements where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @return the range of matching elements
	*/
	public java.util.List<Element> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the elements where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching elements
	*/
	public java.util.List<Element> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns an ordered range of all the elements where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching elements
	*/
	public java.util.List<Element> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first element in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching element
	* @throws NoSuchElementException if a matching element could not be found
	*/
	public Element findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Returns the first element in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns the last element in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching element
	* @throws NoSuchElementException if a matching element could not be found
	*/
	public Element findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Returns the last element in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns the elements before and after the current element in the ordered set where uuid = &#63;.
	*
	* @param elementId the primary key of the current element
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next element
	* @throws NoSuchElementException if a element with the primary key could not be found
	*/
	public Element[] findByUuid_PrevAndNext(long elementId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Removes all the elements where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of elements where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching elements
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the element where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchElementException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching element
	* @throws NoSuchElementException if a matching element could not be found
	*/
	public Element findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchElementException;

	/**
	* Returns the element where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the element where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the element where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the element that was removed
	*/
	public Element removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchElementException;

	/**
	* Returns the number of elements where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching elements
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the elements where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching elements
	*/
	public java.util.List<Element> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the elements where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @return the range of matching elements
	*/
	public java.util.List<Element> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the elements where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching elements
	*/
	public java.util.List<Element> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns an ordered range of all the elements where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching elements
	*/
	public java.util.List<Element> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first element in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching element
	* @throws NoSuchElementException if a matching element could not be found
	*/
	public Element findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Returns the first element in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns the last element in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching element
	* @throws NoSuchElementException if a matching element could not be found
	*/
	public Element findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Returns the last element in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns the elements before and after the current element in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param elementId the primary key of the current element
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next element
	* @throws NoSuchElementException if a element with the primary key could not be found
	*/
	public Element[] findByUuid_C_PrevAndNext(long elementId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Removes all the elements where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of elements where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching elements
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the elements where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching elements
	*/
	public java.util.List<Element> findByGroupId(long groupId);

	/**
	* Returns a range of all the elements where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @return the range of matching elements
	*/
	public java.util.List<Element> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the elements where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching elements
	*/
	public java.util.List<Element> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns an ordered range of all the elements where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching elements
	*/
	public java.util.List<Element> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first element in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching element
	* @throws NoSuchElementException if a matching element could not be found
	*/
	public Element findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Returns the first element in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns the last element in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching element
	* @throws NoSuchElementException if a matching element could not be found
	*/
	public Element findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Returns the last element in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching element, or <code>null</code> if a matching element could not be found
	*/
	public Element fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns the elements before and after the current element in the ordered set where groupId = &#63;.
	*
	* @param elementId the primary key of the current element
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next element
	* @throws NoSuchElementException if a element with the primary key could not be found
	*/
	public Element[] findByGroupId_PrevAndNext(long elementId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator)
		throws NoSuchElementException;

	/**
	* Removes all the elements where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of elements where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching elements
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the element in the entity cache if it is enabled.
	*
	* @param element the element
	*/
	public void cacheResult(Element element);

	/**
	* Caches the elements in the entity cache if it is enabled.
	*
	* @param elements the elements
	*/
	public void cacheResult(java.util.List<Element> elements);

	/**
	* Creates a new element with the primary key. Does not add the element to the database.
	*
	* @param elementId the primary key for the new element
	* @return the new element
	*/
	public Element create(long elementId);

	/**
	* Removes the element with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param elementId the primary key of the element
	* @return the element that was removed
	* @throws NoSuchElementException if a element with the primary key could not be found
	*/
	public Element remove(long elementId) throws NoSuchElementException;

	public Element updateImpl(Element element);

	/**
	* Returns the element with the primary key or throws a {@link NoSuchElementException} if it could not be found.
	*
	* @param elementId the primary key of the element
	* @return the element
	* @throws NoSuchElementException if a element with the primary key could not be found
	*/
	public Element findByPrimaryKey(long elementId)
		throws NoSuchElementException;

	/**
	* Returns the element with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param elementId the primary key of the element
	* @return the element, or <code>null</code> if a element with the primary key could not be found
	*/
	public Element fetchByPrimaryKey(long elementId);

	@Override
	public java.util.Map<java.io.Serializable, Element> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the elements.
	*
	* @return the elements
	*/
	public java.util.List<Element> findAll();

	/**
	* Returns a range of all the elements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @return the range of elements
	*/
	public java.util.List<Element> findAll(int start, int end);

	/**
	* Returns an ordered range of all the elements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of elements
	*/
	public java.util.List<Element> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator);

	/**
	* Returns an ordered range of all the elements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ElementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of elements
	* @param end the upper bound of the range of elements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of elements
	*/
	public java.util.List<Element> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Element> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the elements from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of elements.
	*
	* @return the number of elements
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}