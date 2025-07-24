package org.tcudjoe.eduplatformbackend.domain.shared.enums;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

import java.util.HashSet;
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
	SCHEDULE_MAKER(Set.of(
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
			Permission.SCHEDULE_MAKER_READ,
			Permission.SCHEDULE_MAKER_WRITE,
			Permission.SCHEDULE_MAKER_UPDATE,
			Permission.SCHEDULE_MAKER_DELETE,
			Permission.SCHOOL_ADMIN_READ,
			Permission.SCHOOL_ADMIN_WRITE,
			Permission.SCHOOL_ADMIN_UPDATE,
			Permission.SCHOOL_ADMIN_DELETE)
	),
	SCHOOL_ADMIN(Set.of(
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
			Permission.SCHOOL_ADMIN_READ,
			Permission.SCHOOL_ADMIN_WRITE,
			Permission.SCHOOL_ADMIN_UPDATE,
			Permission.SCHOOL_ADMIN_DELETE)
	),
	SUPER_ADMIN(Set.of(
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
			Permission.SCHEDULE_MAKER_READ,
			Permission.SCHEDULE_MAKER_WRITE,
			Permission.SCHEDULE_MAKER_UPDATE,
			Permission.SCHEDULE_MAKER_DELETE,
			Permission.SCHOOL_ADMIN_READ,
			Permission.SCHOOL_ADMIN_WRITE,
			Permission.SCHOOL_ADMIN_UPDATE,
			Permission.SCHOOL_ADMIN_DELETE,
			Permission.SUPER_ADMIN_READ,
			Permission.SUPER_ADMIN_WRITE,
			Permission.SUPER_ADMIN_UPDATE,
			Permission.SUPER_ADMIN_DELETE
	));


	private final Set<Permission> permissions;

	RoleEnum(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public Set<GrantedAuthority> getGrantedAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<>();
		authorities.add(this); // Add role as authority (ROLE_XYZ)
		permissions.forEach(permission -> authorities.add(() -> permission.getPermission()));
		return authorities;
	}

	@Override
	public String getAuthority() {
		return "ROLE_" + this.name();
	}

	@Override
	public String toString() {
		return "RoleEnum{" + name() + ", permissions=" + permissions + "}";
	}
}
