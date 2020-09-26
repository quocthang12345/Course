package com.SpringMVC.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.majorConvert;
import com.SpringMVC.model.dto.MajorDTO;
import com.SpringMVC.model.entity.MajorEntity;
import com.SpringMVC.repository.MajorRepository;
import com.SpringMVC.service.IMajorService;

@Service
public class MajorService implements IMajorService {

	@Autowired
	private MajorRepository majorRepo;
	@Autowired
	private majorConvert majorConverter;
	
	@Override
	public Map<String,String> findAll() {
		Map<String,String> result = new HashMap<String, String>();
		for(MajorEntity major : majorRepo.findAll()) {
			result.put(major.getMajorCode(), major.getMajorName());
		}
		return result;
	}

	@Override
	public MajorEntity findByCode(String code) {
		return majorRepo.findByMajorCode(code);
	}

	@Override
	public List<MajorDTO> findList() {
		List<MajorDTO> result = new ArrayList<MajorDTO>();
		for(MajorEntity major : majorRepo.findAll()) {
			result.add(majorConverter.toDTO(major));
		}
		return result;
	}

	@Override
	public List<MajorDTO> search(String keyword) {
		List<MajorDTO> result = new ArrayList<MajorDTO>();
		for(MajorEntity major : majorRepo.search(keyword)) {
			result.add(majorConverter.toDTO(major));
		}
		return result;
	}

}
