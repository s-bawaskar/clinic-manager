package com.cm.api.patient.services;

import com.cm.api.patient.entities.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatients();
}
