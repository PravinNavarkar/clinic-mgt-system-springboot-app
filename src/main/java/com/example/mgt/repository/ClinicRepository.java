package com.example.mgt.repository;

import com.example.mgt.domain.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public interface ClinicRepository extends JpaRepository<Clinic,Integer> {
}
