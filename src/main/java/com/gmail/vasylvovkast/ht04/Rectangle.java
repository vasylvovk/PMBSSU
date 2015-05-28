package com.gmail.vasylvovkast.ht04;

/**
 * Created by vasyl on 5/28/15.
 */
public class Rectangle {
    private double a;
    private double b;
    private double s;

    Rectangle() {
        this.a = -1;
        this.b = -1;
        this.s = this.calcSquare(this.a, this.b);
    }

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.s = this.calcSquare(this.a, this.b);
    }


    private double calcSquare(double x, double y) {
        double sq = -1;
        if ((this.a >= 0) && (this.b >= 0))
            sq = a * b;
        return sq;
    }

    public void setASide(double x) {
        this.a = x;
        this.s = this.calcSquare(this.a, this.b);
    }

    public double getASide(double x) {
        return this.a;
    }

    public void setBSide(double y) {
        this.b = y;
        this.s = this.calcSquare(this.a, this.b);
    }

    public double getBSide(double x) {
        return this.b;
    }

    public double getSquare() {
        return this.s;
    }

    public boolean compareSquares(Rectangle Rec) {
        boolean res = false;

        if ((this.getSquare() >= 0) &&
                (Rec.getSquare() >= 0) &&
                (Rec.getSquare() == this.getSquare()))
            res = true;
            return res;
    }

}
