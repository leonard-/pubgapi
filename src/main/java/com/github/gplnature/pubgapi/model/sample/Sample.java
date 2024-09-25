package com.github.gplnature.pubgapi.model.sample;

import com.github.gplnature.pubgapi.model.generic.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sample extends Entity {

    @JsonProperty("attributes")
    private SampleAttributes sampleAttributes;

    @JsonProperty("relationships")
    private SampleRelationships sampleRelationships;

    public Sample() {
    }

    public SampleAttributes getSampleAttributes() {
        return sampleAttributes;
    }

    public void setSampleAttributes(SampleAttributes sampleAttributes) {
        this.sampleAttributes = sampleAttributes;
    }

    public SampleRelationships getSampleRelationships() {
        return sampleRelationships;
    }

    public void setSampleRelationships(SampleRelationships sampleRelationships) {
        this.sampleRelationships = sampleRelationships;
    }
}
