package com.hsrOptimiser.domain.hsrScanner;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScannedData implements Serializable {
    String source;
    int version;
    ArrayList<LightCone> lightCones;
    ArrayList<Relic> relics;
    ArrayList<Character> characters;
}