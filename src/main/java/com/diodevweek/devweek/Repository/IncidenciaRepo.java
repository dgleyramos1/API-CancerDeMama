package com.diodevweek.devweek.Repository;

import com.diodevweek.devweek.Entity.IncidenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepo extends JpaRepository<IncidenciaExame, Long> {
}
