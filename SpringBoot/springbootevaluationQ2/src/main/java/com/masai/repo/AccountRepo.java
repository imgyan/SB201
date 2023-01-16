package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Account;
@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{

}
