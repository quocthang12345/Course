package com.SpringMVC.model.convert;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMVC.model.dto.MajorDTO;
import com.SpringMVC.model.entity.MajorEntity;
import com.SpringMVC.service.IMajorService;

@Component
public class majorConvert {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private IMajorService majorService;
	
	public MajorDTO toDTO(MajorEntity majorEntity) {
		MajorDTO major = modelMapper.map(majorEntity,MajorDTO.class);
		return major;
	}
	
	public MajorEntity toEntity(MajorDTO majorDto) {
		MajorEntity major = modelMapper.map(majorDto, MajorEntity.class);
	    if (majorDto.getId() != null) {
	    	MajorEntity newMajor = majorService.findByCode(major.getMajorCode());
	    	newMajor.setMajorCode(majorDto.getMajorCode());
	    	newMajor.setMajorName(majorDto.getMajorName());
	    }
	    return major;
	}
}
