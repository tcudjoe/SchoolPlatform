package org.tcudjoe.eduplatformbackend.domain.student;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseUser;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Student")
public class Student extends BaseUser {
	
}
