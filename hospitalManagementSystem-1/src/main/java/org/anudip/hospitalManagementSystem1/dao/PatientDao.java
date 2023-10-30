package org.anudip.hospitalManagementSystem1.dao;
import java.util.List;

import org.anudip.hospitalManagementSystem1.bean.Patient;



public interface PatientDao {
	public void savePatient(Patient patient); // store new patient

	public List<Patient> displayAllPatients();

	public Patient findPatientById(Integer patientId);

	public int generateNewPatientId();

	public List<Integer> getAllPatientIds();
}

