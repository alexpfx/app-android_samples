package com.github.alexpfx;

/**
 * Created by alexandre on 17/05/2017.
 */

public class Tournment {
    private String type;
    private String title;
    private int size;
    private int format;
    private int groups;
    private int win_points;
    private int draw_points;
    private int loss_points;

    public Tournment(String type, String title, int size, int format, int groups, int win_points,
            int draw_points, int loss_points) {
        this.type = type;
        this.title = title;
        this.size = size;
        this.format = format;
        this.groups = groups;
        this.win_points = win_points;
        this.draw_points = draw_points;
        this.loss_points = loss_points;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getGroups() {
        return groups;
    }

    public void setGroups(int groups) {
        this.groups = groups;
    }

    public int getWin_points() {
        return win_points;
    }

    public void setWin_points(int win_points) {
        this.win_points = win_points;
    }

    public int getDraw_points() {
        return draw_points;
    }

    public void setDraw_points(int draw_points) {
        this.draw_points = draw_points;
    }

    public int getLoss_points() {
        return loss_points;
    }

    public void setLoss_points(int loss_points) {
        this.loss_points = loss_points;
    }

    @Override
    public String toString() {
        return "Tournment{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size +
                ", format='" + format + '\'' +
                ", groups=" + groups +
                ", win_points=" + win_points +
                ", draw_points=" + draw_points +
                ", loss_points=" + loss_points +
                '}';
    }
}
