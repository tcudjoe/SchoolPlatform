package org.tcudjoe.eduplatformbackend.domain.schedulemaker;

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
@DiscriminatorValue("ScheduleMaker")
public class ScheduleMaker extends BaseEmployee {
}
