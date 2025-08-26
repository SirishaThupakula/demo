package com.coss.demo.repository;

import com.coss.demo.model.CossStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<CossStudent,Long> {
}
