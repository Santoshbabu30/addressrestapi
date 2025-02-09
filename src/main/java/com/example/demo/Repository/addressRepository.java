package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.address;

import java.util.Optional;

public interface addressRepository extends JpaRepository<address, Long> {
    Optional<address> findByUserName(String userName);
}
