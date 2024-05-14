package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Movie;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void include(Movie f) {
//        this.totalTime += f.getDuration();
//    }
//
//    public void include(Serie s) {
//        this.totalTime += s.getDuration();
//    }
    public void include(Title title){
        this.totalTime += title.getDuration();
    }


}