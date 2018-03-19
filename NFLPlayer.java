import java.time.Year;

/**
 * Program: Final
 * File: NFLPlayer.java
 * Summary: Defines the Player class
 * Author: Chase Hausman
 * Date: March 17, 2018
 */

public class NFLPlayer {
    private String name;
    private int height;
    private int weight;
    private String position;
    private int firstYear;
    private int touchdowns;
    private int interceptions;
    private int yards;
    private double rating;
    private String college;

    public NFLPlayer() {
        this.name = "New Player";
        this.height = 60;
        this.weight = 200;
        this.position = "Quarterback";
        this.firstYear = 2017;
        this.touchdowns = 0;
        this.interceptions = 0;
        this.yards = 0;
        this.rating = 0.0;
        this.college = "Homeschooled";
    }

    public NFLPlayer(String name, int height, int weight, String position, int firstYear, int touchdowns,
                     int interceptions, int yards, double rating, String college) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.firstYear = firstYear;
        this.touchdowns = touchdowns;
        this.interceptions = interceptions;
        this.yards = yards;
        this.rating = rating;
        this.college = college;
    }

    public String toString() {
        return this.getName();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Returns height formatted as feet' inches"
    public String getFormattedHeight() {
        int feet = Math.floorDiv(this.height, 12);
        int inches = this.height % 12;
        return feet+"\' "+inches+"\"";
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getFirstYear() {
        return this.firstYear;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    public int getYearsOfExperience() {
        return Year.now().getValue() - this.firstYear;
    }

    public int getTouchdowns() {
        return this.touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public void increaseTouchdowns(int additional) {
        this.touchdowns = this.touchdowns + additional;
    }

    public int getInterceptions() {
        return this.interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public void increaseInterceptions(int additional) {
        this.interceptions = this.interceptions + additional;
    }

    public int getYards() {
        return this.yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public void increaseYards(int additional) {
        this.yards = this.yards + additional;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
