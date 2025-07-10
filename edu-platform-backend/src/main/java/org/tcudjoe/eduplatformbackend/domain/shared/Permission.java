package org.tcudjoe.eduplatformbackend.domain.shared;

import lombok.Getter;

@Getter
public enum Permission {
	STUDENT_READ("student:read"),
	STUDENT_WRITE("student:write"),
	STUDENT_UPDATE("student:update"),
	STUDENT_DELETE("student:delete"),
	TEACHER_READ("teacher:read"),
	TEACHER_WRITE("teacher:write"),
	TEACHER_UPDATE("teacher:update"),
	TEACHER_DELETE("teacher:delete"),
	PARENT_READ("parent:read"),
	PARENT_WRITE("parent:write"),
	PARENT_UPDATE("parent:update"),
	PARENT_DELETE("parent:delete"),
	ADMIN_READ("admin:read"),
	ADMIN_WRITE("admin:write"),
	ADMIN_UPDATE("admin:update"),
	ADMIN_DELETE("admin:delete");

	private final String permission;

	Permission(String permission){
		this.permission = permission;
	}


}
