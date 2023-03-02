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

package com.armantec.bms.book.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link bookLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see bookLocalService
 * @generated
 */
public class bookLocalServiceWrapper
	implements bookLocalService, ServiceWrapper<bookLocalService> {

	public bookLocalServiceWrapper() {
		this(null);
	}

	public bookLocalServiceWrapper(bookLocalService bookLocalService) {
		_bookLocalService = bookLocalService;
	}

	/**
	 * Adds the book to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param book the book
	 * @return the book that was added
	 */
	@Override
	public com.armantec.bms.book.model.book addbook(
		com.armantec.bms.book.model.book book) {

		return _bookLocalService.addbook(book);
	}

	/**
	 * Creates a new book with the primary key. Does not add the book to the database.
	 *
	 * @param bookId the primary key for the new book
	 * @return the new book
	 */
	@Override
	public com.armantec.bms.book.model.book createbook(long bookId) {
		return _bookLocalService.createbook(bookId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the book from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param book the book
	 * @return the book that was removed
	 */
	@Override
	public com.armantec.bms.book.model.book deletebook(
		com.armantec.bms.book.model.book book) {

		return _bookLocalService.deletebook(book);
	}

	/**
	 * Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookId the primary key of the book
	 * @return the book that was removed
	 * @throws PortalException if a book with the primary key could not be found
	 */
	@Override
	public com.armantec.bms.book.model.book deletebook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookLocalService.deletebook(bookId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bookLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bookLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.armantec.bms.book.model.impl.bookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _bookLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.armantec.bms.book.model.impl.bookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _bookLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _bookLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.armantec.bms.book.model.book fetchbook(long bookId) {
		return _bookLocalService.fetchbook(bookId);
	}

	/**
	 * Returns the book matching the UUID and group.
	 *
	 * @param uuid the book's UUID
	 * @param groupId the primary key of the group
	 * @return the matching book, or <code>null</code> if a matching book could not be found
	 */
	@Override
	public com.armantec.bms.book.model.book fetchbookByUuidAndGroupId(
		String uuid, long groupId) {

		return _bookLocalService.fetchbookByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bookLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the book with the primary key.
	 *
	 * @param bookId the primary key of the book
	 * @return the book
	 * @throws PortalException if a book with the primary key could not be found
	 */
	@Override
	public com.armantec.bms.book.model.book getbook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookLocalService.getbook(bookId);
	}

	/**
	 * Returns the book matching the UUID and group.
	 *
	 * @param uuid the book's UUID
	 * @param groupId the primary key of the group
	 * @return the matching book
	 * @throws PortalException if a matching book could not be found
	 */
	@Override
	public com.armantec.bms.book.model.book getbookByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookLocalService.getbookByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.armantec.bms.book.model.impl.bookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of books
	 * @param end the upper bound of the range of books (not inclusive)
	 * @return the range of books
	 */
	@Override
	public java.util.List<com.armantec.bms.book.model.book> getbooks(
		int start, int end) {

		return _bookLocalService.getbooks(start, end);
	}

	/**
	 * Returns all the books matching the UUID and company.
	 *
	 * @param uuid the UUID of the books
	 * @param companyId the primary key of the company
	 * @return the matching books, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.armantec.bms.book.model.book>
		getbooksByUuidAndCompanyId(String uuid, long companyId) {

		return _bookLocalService.getbooksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of books matching the UUID and company.
	 *
	 * @param uuid the UUID of the books
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of books
	 * @param end the upper bound of the range of books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching books, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.armantec.bms.book.model.book>
		getbooksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.armantec.bms.book.model.book> orderByComparator) {

		return _bookLocalService.getbooksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of books.
	 *
	 * @return the number of books
	 */
	@Override
	public int getbooksCount() {
		return _bookLocalService.getbooksCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _bookLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bookLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bookLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param book the book
	 * @return the book that was updated
	 */
	@Override
	public com.armantec.bms.book.model.book updatebook(
		com.armantec.bms.book.model.book book) {

		return _bookLocalService.updatebook(book);
	}

	@Override
	public bookLocalService getWrappedService() {
		return _bookLocalService;
	}

	@Override
	public void setWrappedService(bookLocalService bookLocalService) {
		_bookLocalService = bookLocalService;
	}

	private bookLocalService _bookLocalService;

}