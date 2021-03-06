package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

public class LogPlayerKill extends TelemetryEvent {

    @SerializedName(value = "attackId", alternate = "AttackId")
    private Integer attackId;

    @SerializedName(value = "killer", alternate = "Killer")
    private Character killer;

    @SerializedName(value = "victim", alternate = "Victim")
    private Character victim;

    @SerializedName(value = "damageTypeCategory", alternate = "DamageTypeCategory")
    private String damageTypeCategory;

    @SerializedName(value = "damageCauserName", alternate = "DamageCauserName")
    private String damageCauserName;

    @SerializedName(value = "distance", alternate = "Distance")
    private Float distance;

    public LogPlayerKill() {
        super();
    }

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Character getKiller() {
        return killer;
    }

    public void setKiller(Character killer) {
        this.killer = killer;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public void setDamageTypeCategory(String damageTypeCategory) {
        this.damageTypeCategory = damageTypeCategory;
    }

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
