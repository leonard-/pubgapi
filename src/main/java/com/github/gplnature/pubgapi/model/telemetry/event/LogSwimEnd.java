package com.github.gplnature.pubgapi.model.telemetry.event;

public class LogSwimEnd extends TelemetryEventCharacter {

    private Float swimDistance;

    public LogSwimEnd() {
        super();
    }

    public Float getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(Float swimDistance) {
        this.swimDistance = swimDistance;
    }
}
