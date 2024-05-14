package br.com.alura.screenmatch.modelo;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int chapterSeason;
    private int chapterMinutes;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getChapterSeason() {
        return chapterSeason;
    }

    public void setChapterSeason(int chapters) {
        this.chapterSeason = chapters;
    }

    public int getChapterMinutes() {
        return chapterMinutes;
    }

    public void setChapterMinutes(int chapterMinutes) {
        this.chapterMinutes = chapterMinutes;
    }


    @Override
    public int getDuration() {
        System.out.println("Número de temporadas: " + seasons);
        System.out.println("Quantidade de episódios por temporada: " + chapterSeason);
        System.out.println("Duração do episódio em minutos: " + chapterMinutes);
        return seasons * chapterSeason * chapterMinutes;
    }


}
