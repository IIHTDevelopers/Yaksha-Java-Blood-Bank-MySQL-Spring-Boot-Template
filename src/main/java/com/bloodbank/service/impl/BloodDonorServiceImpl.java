package com.bloodbank.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bloodbank.dto.BloodDonorDTO;
import com.bloodbank.service.BloodDonorService;

@Service
public class BloodDonorServiceImpl implements BloodDonorService {

	@Override
	public BloodDonorDTO getBloodDonorById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public List<BloodDonorDTO> getAllBloodDonors() {
		// write your logic here
		return null;
	}

	@Override
	public BloodDonorDTO addBloodDonor(BloodDonorDTO bloodDonorDTO) {
		// write your logic here
		return null;
	}

	@Override
	public BloodDonorDTO updateBloodDonor(Long id, BloodDonorDTO bloodDonorDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteBloodDonor(Long id) {
		// write your logic here
		return false;
	}

	@Override
	public List<BloodDonorDTO> findBloodDonorsByBloodGroup(String bloodGroup) {
		// write your logic here
		return null;
	}

	@Override
	public BloodDonorDTO findBloodDonorByPhoneNumber(String phoneNumber) {
		// write your logic here
		return null;
	}
}
