package com.x.organization.assemble.authentication.jaxrs.authentication;

import com.x.base.core.project.exception.PromptException;

class ExceptionDisableCollect extends PromptException {

	private static final long serialVersionUID = 6351023802034208595L;

	ExceptionDisableCollect() {
		super("系统没有启用节点连接.");
	}
}
