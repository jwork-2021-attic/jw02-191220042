package proj;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MonsterFactory {
    static int number=0;
    ArrayList<Integer> no=new ArrayList<>();
    static ArrayList<Monster> army=new ArrayList<>();

    public int getLength() {
        return length;
    }

    private int length;

    public void initFactory(int length)
    {
        this.length=length;
        for(int i=0;i<length;i++){
            no.add(i+1);
        }
        Collections.shuffle(no);
    }

    public Linable product() throws IOException {
        if(number<length) {
            int []theRGB=TestImage.returnRGB(number);
            Monster themo=new Monster();
            themo.setRGB(theRGB[0],theRGB[1],theRGB[2], no.get(number));
            army.add(themo);
            number++;
            return themo;
        }
       else {
            System.out.println("...");
            return null;
        }
    }

    public static Monster getByrank(int k)
    {
        for(int i=0;i<army.size();i++)
        {
            if(k==army.get(i).rank())
                return army.get(i);
        }
        return null;
    }

}
