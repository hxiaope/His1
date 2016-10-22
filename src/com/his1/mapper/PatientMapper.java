package com.his1.mapper;

import com.his1.pojo.Patient;
import com.his1.pojo.PatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper {
    int countByExample(PatientExample example);

    int deleteByExample(PatientExample example);

    int deleteByPrimaryKey(Integer patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExampleWithBLOBs(PatientExample example);

    List<Patient> selectByExample(PatientExample example);

    Patient selectByPrimaryKey(Integer patientId);

    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExampleWithBLOBs(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKeyWithBLOBs(Patient record);

    int updateByPrimaryKey(Patient record);
    
    List<Patient> findPatientList(Patient patient);
}