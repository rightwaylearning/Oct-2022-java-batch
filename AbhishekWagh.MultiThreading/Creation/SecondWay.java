

public class SecondWay implements Runnable {
    
    @Override
    public void run() {
       
        for(Integer i = 0;i <= 500; i++){
            System.out.println("I am CHILD Thread Of First way");
        }

    }

    public static void main(String[] args) {

        // WayFirst way = new WayFirst();
        // Thread th = new Thread(way);
        Thread th = new Thread(new SecondWay());
        th.start();

        for(Integer i = 0;i <= 500; i++){
            System.out.println("I am MAIN Thread Of First way");
        }
        
    }
}
