package com.ninos.service.impl;

import com.ninos.model.Property;
import com.ninos.repository.PropertyRepository;
import com.ninos.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PropertyServiceImpl implements PropertyService {

    private PropertyRepository propertyRepository;

    @Override
    public List<Property> findAllProperties() {
        return propertyRepository.findAll();
    }
}
