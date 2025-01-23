package com.AdabNY.fragrance.fragrance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FragranceRepository extends JpaRepository<Fragrance, String> {
    void deleteByName(String name);
}
