package com.cm.api.patient.services;

import com.cm.api.patient.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Override
    public List<Patient> getPatients() {
        return Collections.singletonList(new Patient("1", "A"));
    }
}
