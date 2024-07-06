package com.workout_tracker.dao;

import com.workout_tracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
