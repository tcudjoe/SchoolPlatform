package org.tcudjoe.eduplatformbackend.domain.admin;

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
@DiscriminatorValue("Admin")
public class Admin extends BaseEmployee {
}
