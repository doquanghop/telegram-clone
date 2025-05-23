package com.github.doquanghop.chat_app.domain.account.data.repository;

import com.github.doquanghop.chat_app.domain.account.data.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account> findByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByUserName(String userName);
}
