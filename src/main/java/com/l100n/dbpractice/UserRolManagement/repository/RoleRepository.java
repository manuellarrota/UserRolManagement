package com.l100n.dbpractice.UserRolManagement.repository;

import com.l100n.dbpractice.UserRolManagement.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
