package com.example.backendpatient.repository;

import java.util.List;
import java.time.LocalDate;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import com.example.backendpatient.model.Address;
import com.example.backendpatient.model.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {
  List<Patient> findByName(String name);
  List<Patient> findByPhonenumber(String phonenumber);
  List<Patient> findByGender(String gender); 
  List<Patient> findByBirthdate(LocalDate birthdate);
  List<Patient> findByAddress(Address address);
}
