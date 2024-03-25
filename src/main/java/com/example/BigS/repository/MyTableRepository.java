package com.example.BigS.repository;

import com.example.BigS.entity.MyTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyTableRepository extends JpaRepository<MyTable, Integer> {
}
