package com.github.gplnature.pubgapi.model.ranked;

import com.github.gplnature.pubgapi.model.generic.Entity;

public class RankedData extends Entity {
    private RankedAttribute attributes;
    private RankedRelationships relationships;

    public RankedAttribute getAttributes() {
        return attributes;
    }

    public RankedRelationships getRelationships() {
        return relationships;
    }
}
