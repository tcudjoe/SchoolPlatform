package org.tcudjoe.eduplatformbackend.domain.shared;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;


import java.util.Set;

@Getter
public enum RoleEnum implements GrantedAuthority {
	STUDENT(Set.of(
			Permission.STUDENT_READ,
			Permission.STUDENT_WRITE,
			Permission.STUDENT_UPDATE,
			Permission.STUDENT_DELETE)
	),
	TEACHER(Set.of(
			Permission.STUDENT_READ,
			Permission.STUDENT_WRITE,
			Permission.STUDENT_UPDATE,
			Permission.STUDENT_DELETE,
			Permission.TEACHER_READ,
			Permission.TEACHER_WRITE,
			Permission.TEACHER_UPDATE,
			Permission.TEACHER_DELETE)
	),
	PARENT(Set.of(
			Permission.STUDENT_READ,
			Permission.STUDENT_WRITE,
			Permission.STUDENT_UPDATE,
			Permission.STUDENT_DELETE,
			Permission.PARENT_READ,
			Permission.PARENT_WRITE,
			Permission.PARENT_UPDATE,
			Permission.PARENT_DELETE)
	),
	ADMIN(Set.of(
			Permission.STUDENT_READ,
			Permission.STUDENT_WRITE,
			Permission.STUDENT_UPDATE,
			Permission.STUDENT_DELETE,
			Permission.TEACHER_READ,
			Permission.TEACHER_WRITE,
			Permission.TEACHER_UPDATE,
			Permission.TEACHER_DELETE,
			Permission.PARENT_READ,
			Permission.PARENT_WRITE,
			Permission.PARENT_UPDATE,
			Permission.PARENT_DELETE,
			Permission.ADMIN_READ,
			Permission.ADMIN_WRITE,
			Permission.ADMIN_UPDATE,
			Permission.ADMIN_DELETE)
	);

	private final Set<Permission> permissions;

	RoleEnum(Set<Permission> permissions){
		this.permissions = permissions;
	}

	@Override
	public String getAuthority(){
		return "ROLE_" + this.name();
	}
}
