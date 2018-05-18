package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.TruckDriverDetails;

@Repository
public interface TruckDriverRepository extends JpaRepository<TruckDriverDetails, Integer> {

	TruckDriverDetails findByTruckDriverId(Integer driverId);

	TruckDriverDetails findByTruckDriverContact(String truckDriverContact);

	TruckDriverDetails findByTruckDriverIdAndTruckDriverStatus(Integer driverId, boolean b);

}
