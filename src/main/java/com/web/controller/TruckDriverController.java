package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.dto.DriverDetailsDto;
import com.web.model.TruckDriverDetails;
import com.web.response.Response;
import com.web.service.TruckDriverService;

@RestController
public class TruckDriverController {
	
	@Autowired
	private TruckDriverService truckDriverService;
	
	@GetMapping("/")
	public String test() {
		return "Rest Controler working";
	}
	
	@GetMapping("/truck/{driverId}")
	public Response<TruckDriverDetails> getDriverDetails(@PathVariable("driverId") Integer driverId){
		return truckDriverService.getDriverDetails(driverId);
	}
	@PostMapping("/registration")
	public Response<Integer> driverRegistration(@RequestBody DriverDetailsDto driverDetail){
		return truckDriverService.driverRegistration(driverDetail);
		
	}
	@PutMapping("/edit")
	public Response<Integer> driverDetailsEdit(@RequestBody DriverDetailsDto driverDetail){
		return truckDriverService.driverDetailsEdit(driverDetail);
	}
	@DeleteMapping("/clear")
	public Response<Integer> driverRemove(@RequestParam Integer driverId){
		return truckDriverService.driverRemove(driverId);
	}

}
