package org.tcudjoe.eduplatformbackend.domain.shared.enums;

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
	SCHEDULE_MAKER_READ("schedule_maker:read"),
	SCHEDULE_MAKER_WRITE("schedule_maker:write"),
	SCHEDULE_MAKER_UPDATE("schedule_maker:update"),
	SCHEDULE_MAKER_DELETE("schedule_maker:delete"),
	SCHOOL_ADMIN_READ("school_admin:read"),
	SCHOOL_ADMIN_WRITE("school_admin:write"),
	SCHOOL_ADMIN_UPDATE("school_admin:update"),
	SCHOOL_ADMIN_DELETE("school_admin:delete"),
	SUPER_ADMIN_READ("super_admin:read"),
	SUPER_ADMIN_WRITE("super_admin:write"),
	SUPER_ADMIN_UPDATE("super_admin:update"),
	SUPER_ADMIN_DELETE("super_admin:delete");

	private final String permission;

	Permission(String permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return permission;
	}

}
