package com.ohgiraffers.section03.liskovsustitution.problem;

public class BadSquare extends BadRectangle {
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);     // LSP 위반
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);     // LSP 위반
    }
}
