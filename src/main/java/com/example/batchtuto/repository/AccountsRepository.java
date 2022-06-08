package com.example.batchtuto.repository;

import com.example.batchtuto.domain.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts,Integer> {
}
