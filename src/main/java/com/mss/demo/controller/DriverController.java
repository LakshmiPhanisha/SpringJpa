package com.mss.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.demo.entity.DriverModel;
import com.mss.demo.service.DriverService;

@Transactional
@RestController
@RequestMapping("/jpa")
public class DriverController {

	@Autowired
	DriverService driverService;

	@PostMapping("/insert")
	public String insert(@RequestBody DriverModel driverModel) {
		return driverService.insert(driverModel);
	}

	@GetMapping("/getall")
	public List<DriverModel> getAll() {
		return driverService.getAll();
	}

	@GetMapping("/getbyname/{name}")
	public Optional<DriverModel> getbyname(@PathVariable String name) {
		return driverService.getbyname(name);
	}

	@GetMapping("/getbygender/{gender}")
	public List<DriverModel> getbygender(@PathVariable String gender) {
		return driverService.getbygender(gender);
	}

	@PutMapping("/update")
	public String update(@RequestBody DriverModel driverModel) {
		return driverService.update(driverModel);
	}

	@DeleteMapping("/delete/{name}")
	public String deletebyname(@PathVariable String name) {
		return driverService.deletebyname(name);
	}
}


