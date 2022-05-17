package com.ninos.controller;

import com.ninos.model.Property;
import com.ninos.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/property")
public class PropertyController {


    private PropertyService propertyService;


    @GetMapping("/all")
    public ResponseEntity<List<Property>> getAllProperties(){
        List<Property> properties = propertyService.findAllProperties();
        return new ResponseEntity(properties, HttpStatus.OK);
    }



}
