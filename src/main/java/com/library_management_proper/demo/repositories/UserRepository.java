package com.library_management_proper.demo.repositories;

import com.library_management_proper.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
