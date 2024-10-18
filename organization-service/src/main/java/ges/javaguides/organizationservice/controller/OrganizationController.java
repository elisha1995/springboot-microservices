package ges.javaguides.organizationservice.controller;

import ges.javaguides.organizationservice.dto.OrganizationDto;
import ges.javaguides.organizationservice.service.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Organization Service - OrganizationController",
        description = "Organization Controller Exposes REST APIs for Organization-Service"
)
@RestController
@RequestMapping("api/organizations")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;

    @Operation(
            summary = "Save Organization REST API",
            description = "Save Organization REST API is used to create and save organization object in the database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Successfully created new organization"
    )
    // Build Save Organization REST API
    @PostMapping("/create")
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
    }


    @Operation(
            summary = "Get Organization REST API",
            description = "Get Organization REST API is used to get organization object from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Successfully get organization"
    )
    // Build Get Organization by Code REST API
    @GetMapping("/code/{code}")
    public ResponseEntity<OrganizationDto> getOrganization(@PathVariable("code") String organizationCode){
        OrganizationDto organizationDto = organizationService.getOrganizationByCode(organizationCode);
        return ResponseEntity.ok(organizationDto);
    }

}
