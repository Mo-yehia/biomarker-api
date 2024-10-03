package com.jendi.ai.biomarker_api.service;

import com.jendi.ai.biomarker_api.model.Biomarker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BiomarkerService {
    private final List<Biomarker> biomarkers = new ArrayList<>();

    public BiomarkerService() {
        // Sample data
        biomarkers.add(new Biomarker("Heart Rate", "bpm", 70));
        biomarkers.add(new Biomarker("Calories Burnt", "kcal", 350));
        biomarkers.add(new Biomarker("Sleep Quality", "score", 65));
    }

    public List<Biomarker> getAllBiomarkers() {
        return biomarkers;
    }
}
