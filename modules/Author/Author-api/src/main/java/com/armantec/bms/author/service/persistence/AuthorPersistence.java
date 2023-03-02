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

package com.armantec.bms.author.service.persistence;

import com.armantec.bms.author.exception.NoSuchAuthorException;
import com.armantec.bms.author.model.Author;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the author service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuthorUtil
 * @generated
 */
@ProviderType
public interface AuthorPersistence extends BasePersistence<Author> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AuthorUtil} to access the author persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the authors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching authors
	 */
	public java.util.List<Author> findByUuid(String uuid);

	/**
	 * Returns a range of all the authors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @return the range of matching authors
	 */
	public java.util.List<Author> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the authors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching authors
	 */
	public java.util.List<Author> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns an ordered range of all the authors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching authors
	 */
	public java.util.List<Author> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first author in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching author
	 * @throws NoSuchAuthorException if a matching author could not be found
	 */
	public Author findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Returns the first author in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns the last author in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching author
	 * @throws NoSuchAuthorException if a matching author could not be found
	 */
	public Author findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Returns the last author in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns the authors before and after the current author in the ordered set where uuid = &#63;.
	 *
	 * @param authorId the primary key of the current author
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next author
	 * @throws NoSuchAuthorException if a author with the primary key could not be found
	 */
	public Author[] findByUuid_PrevAndNext(
			long authorId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Removes all the authors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of authors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching authors
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the author where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAuthorException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching author
	 * @throws NoSuchAuthorException if a matching author could not be found
	 */
	public Author findByUUID_G(String uuid, long groupId)
		throws NoSuchAuthorException;

	/**
	 * Returns the author where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the author where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the author where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the author that was removed
	 */
	public Author removeByUUID_G(String uuid, long groupId)
		throws NoSuchAuthorException;

	/**
	 * Returns the number of authors where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching authors
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the authors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching authors
	 */
	public java.util.List<Author> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the authors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @return the range of matching authors
	 */
	public java.util.List<Author> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the authors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching authors
	 */
	public java.util.List<Author> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns an ordered range of all the authors where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching authors
	 */
	public java.util.List<Author> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first author in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching author
	 * @throws NoSuchAuthorException if a matching author could not be found
	 */
	public Author findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Returns the first author in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns the last author in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching author
	 * @throws NoSuchAuthorException if a matching author could not be found
	 */
	public Author findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Returns the last author in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns the authors before and after the current author in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param authorId the primary key of the current author
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next author
	 * @throws NoSuchAuthorException if a author with the primary key could not be found
	 */
	public Author[] findByUuid_C_PrevAndNext(
			long authorId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Removes all the authors where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of authors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching authors
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the authors where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching authors
	 */
	public java.util.List<Author> findByName(String name);

	/**
	 * Returns a range of all the authors where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @return the range of matching authors
	 */
	public java.util.List<Author> findByName(String name, int start, int end);

	/**
	 * Returns an ordered range of all the authors where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching authors
	 */
	public java.util.List<Author> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns an ordered range of all the authors where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching authors
	 */
	public java.util.List<Author> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first author in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching author
	 * @throws NoSuchAuthorException if a matching author could not be found
	 */
	public Author findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Returns the first author in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns the last author in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching author
	 * @throws NoSuchAuthorException if a matching author could not be found
	 */
	public Author findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Returns the last author in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching author, or <code>null</code> if a matching author could not be found
	 */
	public Author fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns the authors before and after the current author in the ordered set where name = &#63;.
	 *
	 * @param authorId the primary key of the current author
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next author
	 * @throws NoSuchAuthorException if a author with the primary key could not be found
	 */
	public Author[] findByName_PrevAndNext(
			long authorId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<Author>
				orderByComparator)
		throws NoSuchAuthorException;

	/**
	 * Removes all the authors where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of authors where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching authors
	 */
	public int countByName(String name);

	/**
	 * Caches the author in the entity cache if it is enabled.
	 *
	 * @param author the author
	 */
	public void cacheResult(Author author);

	/**
	 * Caches the authors in the entity cache if it is enabled.
	 *
	 * @param authors the authors
	 */
	public void cacheResult(java.util.List<Author> authors);

	/**
	 * Creates a new author with the primary key. Does not add the author to the database.
	 *
	 * @param authorId the primary key for the new author
	 * @return the new author
	 */
	public Author create(long authorId);

	/**
	 * Removes the author with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param authorId the primary key of the author
	 * @return the author that was removed
	 * @throws NoSuchAuthorException if a author with the primary key could not be found
	 */
	public Author remove(long authorId) throws NoSuchAuthorException;

	public Author updateImpl(Author author);

	/**
	 * Returns the author with the primary key or throws a <code>NoSuchAuthorException</code> if it could not be found.
	 *
	 * @param authorId the primary key of the author
	 * @return the author
	 * @throws NoSuchAuthorException if a author with the primary key could not be found
	 */
	public Author findByPrimaryKey(long authorId) throws NoSuchAuthorException;

	/**
	 * Returns the author with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param authorId the primary key of the author
	 * @return the author, or <code>null</code> if a author with the primary key could not be found
	 */
	public Author fetchByPrimaryKey(long authorId);

	/**
	 * Returns all the authors.
	 *
	 * @return the authors
	 */
	public java.util.List<Author> findAll();

	/**
	 * Returns a range of all the authors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @return the range of authors
	 */
	public java.util.List<Author> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the authors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of authors
	 */
	public java.util.List<Author> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator);

	/**
	 * Returns an ordered range of all the authors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AuthorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of authors
	 */
	public java.util.List<Author> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Author>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the authors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of authors.
	 *
	 * @return the number of authors
	 */
	public int countAll();

}