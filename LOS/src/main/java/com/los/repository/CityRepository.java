package com.los.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.los.model.CityMaster;

@Repository
public interface CityRepository extends JpaRepository<CityMaster, Long> {

}
