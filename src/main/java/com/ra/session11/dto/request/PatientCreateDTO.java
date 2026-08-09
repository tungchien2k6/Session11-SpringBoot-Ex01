package com.ra.session11.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientCreateDTO {
    @NotBlank(message = "Tên bệnh nhân không được để trống")
    private String fullName;

    @NotNull(message = "Tuổi không được để trống")
    private Integer age;
}