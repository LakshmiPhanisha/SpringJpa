package com.mss.demo;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.mss.demo.entity.DriverModel;

@Repository
@EnableJpaRepositories
public interface DriverRepository extends JpaRepository<DriverModel, Integer> {

		List<DriverModel> findByGender(String gender);

		Optional<DriverModel> findByName(String name);

		void deleteByName(String name);

}
