package com.mss.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.demo.DriverRepository;
import com.mss.demo.entity.DriverModel;

@Service
public class DriverService {
	@Autowired
	DriverRepository driverRepository;

	public String insert(DriverModel driverModel) {
		driverRepository.save(driverModel);
		return "data inserted";
	}

	public List<DriverModel> getAll() {
		List<DriverModel> result = driverRepository.findAll();
		return result;
	}

	public Optional<DriverModel> getbyname(String name) {
		Optional<DriverModel> result = driverRepository.findByName(name);
		return result;
	}

	public List<DriverModel> getbygender(String gender) {
		List<DriverModel> result = driverRepository.findByGender(gender);
		return result;
	}

	public String update(DriverModel driverModel) {
		driverRepository.save(driverModel);
		return "data updated";
	}

	public String deletebyname(String name) {
		driverRepository.deleteByName(name);
		return "data deleted";
	}

}
