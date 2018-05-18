package com.web.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dto.DriverDetailsDto;
import com.web.model.TruckDriverDetails;
import com.web.repository.TruckDriverRepository;
import com.web.response.Response;
import com.web.util.TruckConstraints;

@Service
public class TruckDriverService {
	
	@Autowired
	private TruckDriverRepository truckDriverRepository;

	public Response<TruckDriverDetails> getDriverDetails(Integer driverId) {
		Response<TruckDriverDetails> response=new Response<>();
		TruckDriverDetails details=truckDriverRepository.findByTruckDriverId(driverId);
		if (details!=null) {
			response.setData(details);
			response.setMessage(TruckConstraints.USER_RECORD);
			response.setStatus(HttpServletResponse.SC_OK);
		}else {
			response.setMessage(TruckConstraints.INVALID_DRIVER_ID);
			response.setStatus(HttpServletResponse.SC_NO_CONTENT);
		}
		
		return response;
	}

	public Response<Integer> driverRegistration(DriverDetailsDto driverDetail) {
		Response<Integer> response=new Response<>();
		TruckDriverDetails details=truckDriverRepository.findByTruckDriverContact(driverDetail.getTruckDriverContact());
		if (details==null) {
			TruckDriverDetails driver=new TruckDriverDetails();
			driver.setTruckDriverAddress(driverDetail.getTruckDriverAddress());
			driver.setTruckDriverContact(driverDetail.getTruckDriverContact());
			driver.setTruckDriverName(driverDetail.getTruckDriverName());
			driver.setTruckDriverStatus(true);
			truckDriverRepository.save(driver);
			response.setData(driver.getTruckDriverId());
			response.setMessage(TruckConstraints.USER_CREATED);
			response.setStatus(HttpServletResponse.SC_OK);
		}else {
			response.setMessage(TruckConstraints.USER_CONTACT);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		return response;
	}

	public Response<Integer> driverDetailsEdit(DriverDetailsDto driverDetail) {
		Response<Integer> response=new Response<>();
		TruckDriverDetails details=truckDriverRepository.findByTruckDriverId(driverDetail.getTruckDriverId());
		if (details!=null) {
			details.setTruckDriverAddress(driverDetail.getTruckDriverAddress());
			details.setTruckDriverContact(driverDetail.getTruckDriverContact());
			details.setTruckDriverName(driverDetail.getTruckDriverName());
			details.setTruckDriverStatus(true);
			truckDriverRepository.save(details);
			response.setData(details.getTruckDriverId());
			response.setMessage(TruckConstraints.USER_EDIT);
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			response.setMessage(TruckConstraints.USER_NOT_FOUND);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		return response;
	}

	public Response<Integer> driverRemove(Integer driverId) {
		Response<Integer> response=new Response<>();
		TruckDriverDetails details=truckDriverRepository.findByTruckDriverIdAndTruckDriverStatus(driverId,true);
		if (details!=null) {
			details.setTruckDriverStatus(false);
			truckDriverRepository.save(details);
			response.setData(details.getTruckDriverId());
			response.setMessage(TruckConstraints.USER_DELETED);
			response.setStatus(HttpServletResponse.SC_OK);
		}else {
			response.setMessage(TruckConstraints.USER_NOT_FOUND);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		return response;
	}

}
