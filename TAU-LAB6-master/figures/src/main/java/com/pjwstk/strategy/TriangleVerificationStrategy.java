package com.pjwstk.strategy;

import com.pjwstk.figure.Figure;
import com.pjwstk.figure.Rectangle;
import com.pjwstk.figure.Trapeze;
import com.pjwstk.figure.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleVerificationStrategy implements FigureVerificationStrategy {
    private List<Figure> triangles = new ArrayList<>();

    public TriangleVerificationStrategy() {
        triangles.add(new Triangle());
    }

    @Override
    public boolean checkIfFigureCanBeBuilt(int... sides) {
        for (Figure figure : triangles) {
            if (figure.isBuildingFigurePossible(sides)) {
                System.out.println("Figure is " + figure.getClass().getSimpleName());
                return true;
            }
        }
        return false;
    }

}
