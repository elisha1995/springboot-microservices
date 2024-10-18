package ges.javaguides.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "APIResponse DTO Model Information"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {

    @Schema(description = "Employee Object")
    private EmployeeDto employee;

    @Schema(description = "Department Object")
    private DepartmentDto department;

    @Schema(description = "Organization Object")
    private OrganizationDto organization;
}
