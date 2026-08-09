package com.ra.session11.controller;

import com.ra.session11.dto.request.PatientCreateDTO;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @PostMapping
    public ResponseEntity<String> addPatient(@Valid @RequestBody PatientCreateDTO dto) {
        // Ghi log INFO khi có bệnh nhân mới được gửi lên
        log.info("Đã nhận yêu cầu thêm bệnh nhân mới: {}", dto.getFullName());

        // Ghi log WARN nếu tuổi bất thường
        if (dto.getAge() > 120) {
            log.warn("Tuổi bệnh nhân bất thường: {} - fullName: {}", dto.getAge(), dto.getFullName());
        }

        return new ResponseEntity<>("Patient added successfully", HttpStatus.CREATED);
    }
}