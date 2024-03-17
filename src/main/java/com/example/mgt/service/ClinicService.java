package com.example.mgt.service;

import com.example.mgt.domain.Clinic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ClinicService {

    Clinic addClinic(Clinic clinic);
    List<Clinic> getAllClinic();
    Optional<Clinic> getClinicById(int id);
    Clinic updateClinicById(Clinic clinic,int id);
    void deleteClinicById(int id);
}
