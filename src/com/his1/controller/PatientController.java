package com.his1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.his1.pojo.Patient;
import com.his1.service.PatientService;

/**
 * 
 * @Title:PatientController
 * @author hxiaope
 * @date 2016年10月21日上午11:01:23
 * @version 1.0
 */
@Controller
@RequestMapping(method={RequestMethod.POST,RequestMethod.GET})
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	//query
	@RequestMapping("/queryPatient")
	public ModelAndView queryPatient(Patient patient) throws Exception{
		List<Patient> patientList=patientService.findPatientList(patient);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("patientList", patientList);

		modelAndView.setViewName("patientList");

		return modelAndView;
	}
	
	//del
	@RequestMapping("/deletePatient")
	public String  deletePatient(Integer id) throws Exception{
		patientService.deletePatient(id);
		
		return "redirect:queryPatient.action";
	}
	
	@RequestMapping("/delPatient")
	public String delPatient(Integer[] patientId) throws Exception{
		
		for (Integer integer : patientId) {
			patientService.deletePatient(integer);
		}
		return "redirect:queryPatient.action";
	}
	
	//insert
	@RequestMapping("/insetPatient")
	public String  insetPatient() throws Exception{
		
		return "insertPatient";
	}
	
	@RequestMapping("/insertPatientSubmit")
	public String insertPatientSubmit(Patient patient) throws Exception{
		
		patientService.InsertPatient(patient);
		
		return "redirect:queryPatient.action";
	}
	
	//edit
	@RequestMapping("editPatient")
	public String editPatient(Integer id,Model model) throws Exception{
		
		Patient patient=patientService.findPatientById(id);
		
		model.addAttribute("patient", patient);
		
		return "editPatient";
	}
	
	@RequestMapping("/editPatientSubmit")
	public String editPatientSubmit(Patient patient) throws Exception{
		
		patientService.updatePatient(patient);
		
		return "redirect:queryPatient.action"; 
	}
}
