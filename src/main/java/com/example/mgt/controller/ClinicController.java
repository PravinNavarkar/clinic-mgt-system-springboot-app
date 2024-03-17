package com.example.mgt.controller;

import com.example.mgt.domain.Clinic;
import com.example.mgt.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinics")
public class ClinicController {

    @Autowired
    ClinicService clinicService;

    @PostMapping("/clinic")
    public ResponseEntity<?> addClinic(@RequestBody Clinic clinic){
        return new ResponseEntity<>(clinicService.addClinic(clinic),HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Clinic>> getAllClinic(){
        return new ResponseEntity<>(clinicService.getAllClinic(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClinicById(@PathVariable("id") int id){
        return new ResponseEntity<>(clinicService.getClinicById(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateClininById(Clinic clinic,@PathVariable("id") int id){
        Clinic updatedClinic = clinicService.updateClinicById(clinic,id);
        return new ResponseEntity<>(updatedClinic,HttpStatus.OK);
    }

    @DeleteMapping("/deleteClinic/{id}")
    public ResponseEntity<?> deleteClinicById(@PathVariable("id") int id){
        clinicService.deleteClinicById(id);
        return new ResponseEntity<String>("Clinic with id"+id+"deleted successfully", HttpStatus.OK);
    }
}
