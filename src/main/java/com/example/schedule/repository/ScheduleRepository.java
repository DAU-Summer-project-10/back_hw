// com.example.schedule.repository.ScheduleRepository.java

package com.example.schedule.repository;

import com.example.schedule.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {}