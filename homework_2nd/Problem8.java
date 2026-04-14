package homework_2nd;
class Counter{
    public static int count = 0;
    public int id = 0;

    public Counter(){
        count++;
        id = count;
    }

    public void display(){
        System.out.println(id + "," + count);
    }
}
public class Problem8 {

    public static void main(String[] args){
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        counter1.display();
        counter2.display();

    }
}


