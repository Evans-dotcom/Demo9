package com.Kit.Demo9.repo;

import com.Kit.Demo9.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails,Long> {
}
