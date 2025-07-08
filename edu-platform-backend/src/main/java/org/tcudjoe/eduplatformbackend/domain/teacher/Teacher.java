package org.tcudjoe.eduplatformbackend.domain.teacher;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tcudjoe.eduplatformbackend.domain.shared.BaseEmployee;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Teacher")
public class Teacher extends BaseEmployee {

}
