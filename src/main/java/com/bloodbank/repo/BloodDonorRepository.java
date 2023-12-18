package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.entity.BloodDonor;

@Repository
public interface BloodDonorRepository extends JpaRepository<BloodDonor, Long> {
	// write your logic here
}
