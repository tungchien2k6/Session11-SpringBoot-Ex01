package com.ra.session11.service;

import com.ra.session11.model.entity.Patient;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import com.ra.session11.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient findById(Long id) {
        log.trace("Bắt đầu tìm kiếm bệnh nhân với id: {}", id);
        Patient patient = patientRepository.findById(id).orElse(null);
        log.trace("Kết quả tìm kiếm: {}", patient);
        return patient;
    }
}
