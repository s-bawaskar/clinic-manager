package com.cm.api.controller;

import com.cm.api.patient.entities.Patient;
import com.cm.api.patient.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientsController {
    @Autowired
    PatientService patientService;

    @GetMapping(path = "patients")
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }
}
