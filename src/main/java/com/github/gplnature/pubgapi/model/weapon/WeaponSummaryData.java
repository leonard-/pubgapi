package com.github.gplnature.pubgapi.model.weapon;

import java.util.List;

public class WeaponSummaryData {
    private int xpTotal;
    private int levelCurrent;
    private int tierCurrent;
    private WeaponStats statsTotal;
    private List<WeaponMedal> medals;

    public WeaponStats getStatsTotal() {
        return statsTotal;
    }

    public List<WeaponMedal> getMedals() {
        return medals;
    }

    public int getXpTotal() {
        return xpTotal;
    }

    public int getLevelCurrent() {
        return levelCurrent;
    }

    public int getTierCurrent() {
        return tierCurrent;
    }
}
