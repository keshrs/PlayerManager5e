package com.rikeshsubedi.npcgenerator;

/**
 * @author Rikesh Subedi
 * @version 0.1
 * Created by keshr on 10/24/2017.
 */

public class GameCharacter extends GameEntity {
    private boolean isAlive;
    private int experience;
    private int level;
    private int proficiencyModifier;
    // inventory
    // class
    // race
    // abilities

/* CONSTRUCTORS */
    /**
     * No args constructor for a game character.
     */
    public GameCharacter() {
        super();
        this.isAlive = true;
        this.experience = 0;
        levelUp();      // levelUp function updates level and proficiency modifier.
        // TODO: create and instantiate inventory, class, race, ability list.
    }

    public GameCharacter(String name, int maxHP, CharacterStats stats, int experience) {
        super(name, maxHP, stats);
        this.isAlive = true;
        this.experience = experience;
        levelUp();      // levelUp function updates level and proficiency modifier.
        // TODO: create and instantiate inventory, class, race, ability list.
    }


/* PUBLIC METHODS */
    /**
     * Simple function to handle experience gain.
     * @param expAmount amount of XP to gain
     */
    public void gainExperience(int expAmount) {
        if (expAmount < 0) {
            throw new IllegalArgumentException("Cannot lose experience.");
        }

        experience += expAmount;
        if (level < calculateLevel()) {
            levelUp();
        }
    }

    @Override
    public void updateHealth(int healthAmount) {
        currHP += healthAmount;
        if (currHP <= 0) {
            conscious = false;  // For subclasses, implement alive factors
        }
        if (currHP < (proficiencyModifier * 5)) {
            isAlive = false;
        }
    }


/* PRIVATE METHODS */
    /**
     * Helper method which calculates the character's level based on experience points.
     * @return the current level of the character.
     */
    private int calculateLevel() {
        if (experience < 300) {
            return 1;
        } else if (experience < 900) {
            return 2;
        } else if (experience < 2700) {
            return 3;
        } else if (experience < 6500) {
            return 4;
        } else if (experience < 14000) {
            return 5;
        } else if (experience < 23000) {
            return 6;
        } else if (experience < 34000) {
            return 7;
        } else if (experience < 48000) {
            return 8;
        } else if (experience < 64000) {
            return 9;
        } else if (experience < 85000) {
            return 10;
        } else if (experience < 100000) {
            return 11;
        } else if (experience < 120000) {
            return 12;
        } else if (experience < 140000) {
            return 13;
        } else if (experience < 165000) {
            return 14;
        } else if (experience < 195000) {
            return 15;
        } else if (experience < 225000) {
            return 16;
        } else if (experience < 265000) {
            return 17;
        } else if (experience < 305000) {
            return 18;
        } else if (experience < 355000){
            return 19;
        } else {
            return 20;
        }
    }

    /**
     * Helper function that performs all actions needed upon a level-up.
     */
    private void levelUp() {
        level = calculateLevel();

        if (level < 5) {
            proficiencyModifier = 2;
        } else if (level < 9) {
            proficiencyModifier = 3;
        } else if (level < 13) {
            proficiencyModifier = 4;
        } else if (level < 17) {
            proficiencyModifier = 5;
        } else {
            proficiencyModifier = 6;
        }

        // TODO: update abilities and stats and max HP
    }
}
