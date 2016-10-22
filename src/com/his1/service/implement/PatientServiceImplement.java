package com.his1.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.his1.mapper.PatientMapper;
import com.his1.pojo.Patient;
import com.his1.service.PatientService;
/**
 * 
 * @Title:PatientServiceImplement
 * @author hxiaope
 * @date 2016年10月18日下午7:13:00
 * @version 1.0
 */
public class PatientServiceImplement implements PatientService {

	@Autowired
	private PatientMapper patientMapper;
	
	@Override
	public void InsertPatient(Patient patient) throws Exception {
		patientMapper.insert(patient);
		
	}

	@Override
	public void deletePatient(Integer id) throws Exception {
		patientMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Patient> findPatientList(Patient patient) throws Exception {
		return patientMapper.findPatientList(patient);
	}

	@Override
	public void updatePatient(Patient patient) throws Exception {
		patientMapper.updateByPrimaryKeyWithBLOBs(patient);
	}

	@Override
	public Patient findPatientById(Integer id) throws Exception {
		return patientMapper.selectByPrimaryKey(id);
	}

}
