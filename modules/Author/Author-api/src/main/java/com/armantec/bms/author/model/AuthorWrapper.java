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

package com.armantec.bms.author.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Author}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Author
 * @generated
 */
public class AuthorWrapper
	extends BaseModelWrapper<Author> implements Author, ModelWrapper<Author> {

	public AuthorWrapper(Author author) {
		super(author);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("authorId", getAuthorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("authorBook", getAuthorBook());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String authorBook = (String)attributes.get("authorBook");

		if (authorBook != null) {
			setAuthorBook(authorBook);
		}
	}

	@Override
	public Author cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the author book of this author.
	 *
	 * @return the author book of this author
	 */
	@Override
	public String getAuthorBook() {
		return model.getAuthorBook();
	}

	/**
	 * Returns the author ID of this author.
	 *
	 * @return the author ID of this author
	 */
	@Override
	public long getAuthorId() {
		return model.getAuthorId();
	}

	/**
	 * Returns the company ID of this author.
	 *
	 * @return the company ID of this author
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this author.
	 *
	 * @return the create date of this author
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this author.
	 *
	 * @return the group ID of this author
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this author.
	 *
	 * @return the ID of this author
	 */
	@Override
	public String getId() {
		return model.getId();
	}

	/**
	 * Returns the modified date of this author.
	 *
	 * @return the modified date of this author
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this author.
	 *
	 * @return the name of this author
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this author.
	 *
	 * @return the primary key of this author
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this author.
	 *
	 * @return the user ID of this author
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this author.
	 *
	 * @return the user name of this author
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this author.
	 *
	 * @return the user uuid of this author
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this author.
	 *
	 * @return the uuid of this author
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the author book of this author.
	 *
	 * @param authorBook the author book of this author
	 */
	@Override
	public void setAuthorBook(String authorBook) {
		model.setAuthorBook(authorBook);
	}

	/**
	 * Sets the author ID of this author.
	 *
	 * @param authorId the author ID of this author
	 */
	@Override
	public void setAuthorId(long authorId) {
		model.setAuthorId(authorId);
	}

	/**
	 * Sets the company ID of this author.
	 *
	 * @param companyId the company ID of this author
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this author.
	 *
	 * @param createDate the create date of this author
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this author.
	 *
	 * @param groupId the group ID of this author
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this author.
	 *
	 * @param id the ID of this author
	 */
	@Override
	public void setId(String id) {
		model.setId(id);
	}

	/**
	 * Sets the modified date of this author.
	 *
	 * @param modifiedDate the modified date of this author
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this author.
	 *
	 * @param name the name of this author
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this author.
	 *
	 * @param primaryKey the primary key of this author
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this author.
	 *
	 * @param userId the user ID of this author
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this author.
	 *
	 * @param userName the user name of this author
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this author.
	 *
	 * @param userUuid the user uuid of this author
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this author.
	 *
	 * @param uuid the uuid of this author
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AuthorWrapper wrap(Author author) {
		return new AuthorWrapper(author);
	}

}