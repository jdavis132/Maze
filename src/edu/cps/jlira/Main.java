package edu.cps.jlira;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        if (args.length == 2){
            Random random = new Random();
            int xSize = Integer.parseInt(args[0]);
            int ySize = Integer.parseInt(args[1]);
            Square startingSquare = new Square(0,0);
            MazePrintStream stream = new MazePrintStream(xSize, ySize, System.out, ' ', 'M');
            Maze maze = new Maze(xSize, ySize, startingSquare, stream);
            boolean keepGenerating = true;
            while (keepGenerating){
                keepGenerating = maze.createRandomPath(random);
            }
            maze.display();
        } else {
            System.out.println("Supply two integers for maze dimensions.");
        }
    }
}
