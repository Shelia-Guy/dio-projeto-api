package me.gft_api_rest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.gft_api_rest.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

        boolean exexistsByAccountNumber(String accountNumber);
}
