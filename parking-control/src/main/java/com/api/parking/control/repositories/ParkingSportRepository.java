package com.api.parking.control.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.parking.control.models.ParkingSpotModel;
import java.util.UUID;

public interface ParkingSportRepository extends JpaRepository<ParkingSpotModel, UUID>{
	
	boolean existsByLicensePlateCar(String licensePlateCar);
	boolean existsByParkingSpotNumber(String parkingSpotNumber);
	boolean existsByApartmentAndBlock(String apartment, String block);
	
}
