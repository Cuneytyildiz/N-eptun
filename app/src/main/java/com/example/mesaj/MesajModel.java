package com.example.mesaj;

public class MesajModel {
    private String from,text;
    public MesajModel(){

    }

    public MesajModel(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MesajModel{" +
                "from='" + from + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
