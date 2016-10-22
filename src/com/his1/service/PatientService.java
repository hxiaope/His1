package com.his1.service;

import java.util.List;

import com.his1.pojo.Patient;

/**
 * 
 * @Title:PatientService
 * @author hxiaope
 * @date 2016年10月18日下午7:12:22
 * @version 1.0
 */
public interface PatientService {
	
	public void InsertPatient(Patient patient) throws Exception;
	
	public void deletePatient(Integer id) throws Exception;
	
	public List<Patient> findPatientList(Patient patient) throws Exception;
	
	public void updatePatient(Patient patient) throws Exception;
	
	public Patient findPatientById(Integer id) throws Exception;
}
