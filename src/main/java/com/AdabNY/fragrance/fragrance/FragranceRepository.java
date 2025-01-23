package com.AdabNY.fragrance.fragrance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FragranceRepository extends JpaRepository<Fragrance, String> {
    void deleteByName(String name);
    Optional<Fragrance> findByName(String name);
}
