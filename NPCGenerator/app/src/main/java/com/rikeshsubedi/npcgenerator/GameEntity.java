package com.rikeshsubedi.npcgenerator;

import java.util.LinkedList;

/**
 * @author Rikesh Subedi
 * @version 0.1
 * Created by keshrs on 10/24/2017.
 */

public abstract class GameEntity {
    String entityName;
    CharacterStats stats;
    int maxHP;
    int currHP;
    boolean conscious;
    LinkedList<String> statusAffects;


/* CONSTRUCTORS */
    /**
     * Constructor for GameEntity's. Should not instantiate.
     */
    public GameEntity() {
        this.entityName = "A Mysterious Figure";
        this.maxHP = 30;
        this.currHP = 30;
        this.conscious = true;
        this.stats = new CharacterStats();
        this.statusAffects = new LinkedList<>();
    }

    /**
     * Constructor given standard details: name, maxHP, stats.
     * @param entityName name of the entity
     * @param maxHP maximum HP in the entity's pool
     * @param stats stat values for this entity
     */
    public GameEntity(String entityName, int maxHP, CharacterStats stats) {
        this.entityName = entityName;
        this.maxHP = maxHP;
        this.currHP = maxHP;
        this.conscious = true;
        this.stats = stats;
        this.statusAffects = new LinkedList<>();
    }

/* PUBLIC METHODS */
    /**
     * Method to update this entity's current health.
     * @param healthAmount positive or negative amount to modify current health.
     */
    public void updateHealth(int healthAmount) {
        currHP += healthAmount;
        if (currHP <= 0) {
            conscious = false;  // For subclasses, implement alive factors
        }
    }
}
