package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Address;
import com.example.ashionbackend.repositories.AddressRepository;
import com.example.ashionbackend.services.AddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
	private final AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public Address save(Address entity) {
		return addressRepository.save(entity);
	}

	@Override
	public Address findById(int id) {
		return addressRepository.findById(id);
	}

	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

	@Override
	public Page<Address> findAll(Pageable pageable) {
		return addressRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return addressRepository.updateByIdAndStatus(id, status);
	}
}
