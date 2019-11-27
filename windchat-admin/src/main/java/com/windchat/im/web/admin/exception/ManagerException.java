package com.windchat.im.web.admin.exception;

import com.windchat.common.utils.StringHelper;

public class ManagerException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5303021403604515796L;

	public ManagerException(String message) {
		super(message);
	}

	public ManagerException(String messageParttern, Object... obs) {
		this(StringHelper.format(messageParttern, obs));
	}
}
