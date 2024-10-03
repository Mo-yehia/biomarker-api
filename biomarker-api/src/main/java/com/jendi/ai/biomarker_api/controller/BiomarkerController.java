package com.jendi.ai.biomarker_api.controller;

import com.jendi.ai.biomarker_api.model.Biomarker;
import com.jendi.ai.biomarker_api.service.BiomarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/biomarkers")
public class BiomarkerController {

    private final BiomarkerService biomarkerService;

    @Autowired
    public BiomarkerController(BiomarkerService biomarkerService) {
        this.biomarkerService = biomarkerService;
    }

    @GetMapping
    public List<Biomarker> getBiomarkers() {
        return biomarkerService.getAllBiomarkers();
    }
}
