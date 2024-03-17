package com.example.mgt.serviceimpl;

import com.example.mgt.domain.Clinic;
import com.example.mgt.repository.ClinicRepository;
import com.example.mgt.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    ClinicRepository clinicRepository;

    public Clinic addClinic(Clinic clinic){
        return clinicRepository.save(clinic);
    }

    public List<Clinic> getAllClinic(){
        return clinicRepository.findAll();
    }

    public Optional<Clinic> getClinicById(int id){
        return clinicRepository.findById(id);
    }

    public Clinic updateClinicById(Clinic clinic,int id){
         Optional<Clinic> clinicDetails = clinicRepository.findById(id);
        // if(clinicDetails.isPresent()){
             Clinic existingClinic = clinicDetails.get();
             existingClinic.setClinic_address(clinic.getClinic_address());
             existingClinic.setClinic_name(clinic.getClinic_name());
             existingClinic.setClinic_doctor_name(clinic.getClinic_doctor_name());
             return clinicRepository.save(existingClinic);
        /* }else{
            return clinic;
         }*/


    }

    public void deleteClinicById(int id){
        clinicRepository.deleteById(id);
    }

}
