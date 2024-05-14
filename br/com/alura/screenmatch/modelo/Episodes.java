package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Episodes implements Classifiable {
private int number;
private String name;
private Serie serie;
private int totalViews;

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getClassification() {
        if(totalViews>100){
            return 4;
        }else{
            return 2;
        }
    }

    public void setTotalViews(int totalViews) {
    }
}
