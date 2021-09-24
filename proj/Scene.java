package proj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {
    public static void main(String[] args) throws IOException {

        Formation line = new Line(8);
        MonsterFactory thefactory = new MonsterFactory();
        thefactory.initFactory(64);
        for(int i=0;i<thefactory.getLength();i++) {
            line.put(thefactory.product(), i);
        }


        Snake theSnake = Snake.getTheSnake();
        Sorter sorter = new QuickSorter();
        theSnake.setSorter(sorter);


        String log = theSnake.lineUp(line);


        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }
}
