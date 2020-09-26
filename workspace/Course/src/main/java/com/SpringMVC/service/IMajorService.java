package com.SpringMVC.service;

import java.util.List;
import java.util.Map;

import com.SpringMVC.model.dto.MajorDTO;
import com.SpringMVC.model.entity.MajorEntity;

public interface IMajorService {
	Map<String,String> findAll();
	MajorEntity findByCode(String code);
	List<MajorDTO> findList();
	List<MajorDTO> search(String keyword);
}
