package br.com.alura.screenmatch.modelo;

public class Title {
    private String name;
    private int yearRelease;
    private boolean includePlan;
    private double sumOfRating;
    private int totalRating;
    private int duration;

    public int getTotalRating() {
        return totalRating;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public boolean isIncludePlan() {
        return includePlan;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludePlan(boolean includePlan) {
        this.includePlan = includePlan;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showMovieFile() {
        System.out.println("Nome do título: " + name);
        System.out.println("Ano de lançamento: " + yearRelease);
    }

    public void rating(double grade) {
        sumOfRating += grade;
        totalRating++;
    }

    public double getAverage() {
        return sumOfRating / totalRating;
    }
}
