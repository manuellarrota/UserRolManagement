package com.l100n.dbpractice.UserRolManagement.repository;

import com.l100n.dbpractice.UserRolManagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
