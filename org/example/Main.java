package org.example;

import br.com.alura.screenmatch.calculos.FilterOfRecommendation;
import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.alura.screenmatch.modelo.Episodes;
import br.com.alura.screenmatch.modelo.Movie;
import br.com.alura.screenmatch.modelo.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Hunger Games");
        myMovie.setDuration(200);
        myMovie.setYearRelease(2018);

        System.out.println("Duração do filme: " + myMovie.getDuration());

        myMovie.showMovieFile();

        myMovie.rating(5);
        myMovie.rating(9);
        myMovie.rating(10);

        System.out.println("Quantidade de avaliações " + myMovie.getTotalRating());
        System.out.println("Média de avaliações do filme: " + myMovie.getAverage());

        Serie serie = new Serie();
        serie.setName("The sinner");
        serie.setYearRelease(2000);
        serie.showMovieFile();
        serie.setSeasons(10);
        serie.setChapterMinutes(50);
        serie.setChapterSeason(10);


        System.out.println("Duração da série: " + serie.getDuration());

        Movie otherMovie = new Movie();
        otherMovie.setName("Matrix");
        otherMovie.setDuration(220);
        otherMovie.setYearRelease(2005);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(otherMovie);
        System.out.println(calculator.getTotalTime());

        FilterOfRecommendation filtro = new FilterOfRecommendation();
        filtro.filter(myMovie);

        Episodes episode = new Episodes();
        episode.setTotalViews(500);
        episode.setSerie(serie);
        episode.setNumber(1);
        filtro.filter(episode);

    }


}
