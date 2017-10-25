package com.rikeshsubedi.npcgenerator;

import java.util.HashMap;

/**
 * @author Rikesh Subedi
 * @version 0.1
 * Created by keshrs on 10/24/2017.
 */
public class CharacterStats {
    private int strength;
    private int constitution;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    // TODO: implement "base stats" system for stats without modification

    /* Setters and Getters */
    /**
     * Setter method for strength stat.
     * @param strength new strength of this character.
     */
    public void setStrength(int strength) {
        if (validateSetStat(strength)) {
            this.strength = strength;
        }
    }

    /**
     * Setter method for constitution stat.
     * @param constitution new constitution of this character.
     */
    public void setConstitution(int constitution) {
        if (validateSetStat(constitution)) {
            this.constitution = constitution;
        }
    }

    /**
     * Setter method for dexterity stat.
     * @param dexterity new dexterity of this character.
     */
    public void setDexterity(int dexterity) {
        if (validateSetStat(dexterity)) {
            this.dexterity = dexterity;
        }
    }

    /**
     * Setter method for intelligence stat.
     * @param intelligence new intelligence of this character.
     */
    public void setIntelligence(int intelligence) {
        if (validateSetStat(intelligence)) {
            this.intelligence = intelligence;
        }
    }

    /**
     * Setter method for wisdom stat.
     * @param wisdom new wisdom of this character.
     */
    public void setWisdom(int wisdom) {
        if (validateSetStat(wisdom)) {
            this.wisdom = wisdom;
        }
    }

    /**
     * Setter method for charisma stat.
     * @param charisma new charisma of this character.
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    // THIS SHOULD NOT BE HANDLED HERE BUT HAVE IT FOR NOW
    /**
     * Helper method to ensure the stat passed in a setter is within valid range.
     * @param stat to be validated
     * @return whether or not stat is in valid range.
     */
    private boolean validateSetStat(int stat) {
        return (stat >= 0 && stat <= 20);
    }

    /**
     * Getter method for the strength stat.
     * @return strength of this character.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Getter method for the constitution stat.
     * @return constitution of this character.
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * Getter method for the dexterity stat.
     * @return dexterity of this character.
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Getter method for the intelligence stat.
     * @return intelligence of this character.
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Getter method for the wisdom stat.
     * @return wisdom of this character.
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * Getter method for the charisma stat.
     * @return charisma of this character.
     */
    public int getCharisma() {
        return charisma;
    }



    /**
     * No-args constructor for CharacterStats.
     */
    public CharacterStats() {
        this.strength = 10;
        this.constitution = 10;
        this.dexterity = 10;
        this.intelligence = 10;
        this.wisdom = 10;
        this.charisma = 10;
    }

    /**
     * Constructor for CharacterStats
     * @param strength of this character
     * @param constitution of this character
     * @param dexterity of this character
     * @param intelligence of this character
     * @param wisdom of this character
     * @param charisma of this character
     */
    public CharacterStats(int strength, int constitution, int dexterity, int intelligence, int
            wisdom, int charisma) {
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    /**
     * Update the stats of this character.
     * @param strength of this character
     * @param constitution of this character
     * @param dexterity of this character
     * @param intelligence of this character
     * @param wisdom of this character
     * @param charisma of this character
     * @return success of changing at least one stat
     */
    public boolean updateAll(int strength, int constitution, int dexterity, int intelligence, int
            wisdom, int charisma) {
        int changed = 0;

        if (strength != 0) {
            this.strength = strength;
            changed++;
        }

        if (constitution != 0) {
            this.constitution = constitution;
            changed++;
        }

        if (dexterity != 0) {
            this.dexterity = dexterity;
            changed++;
        }

        if (intelligence != 0) {
            this.intelligence = intelligence;
            changed++;
        }

        if (wisdom != 0) {
            this.wisdom = wisdom;
            changed++;
        }

        if (charisma != 0) {
            this.charisma = charisma;
            changed++;
        }

        // If nothing was changed, return false.
        return (changed > 0);
    }

    /**
     * Getter function for all stats as array.
     * @return int array of all character stats.
     */
    public int[] getAll() {
        int[] allStats = {strength, constitution, dexterity, intelligence, wisdom, charisma};
        return allStats;
    }

}
