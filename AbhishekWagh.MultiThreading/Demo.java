public class Demo extends Thread {

    @Override
    public void run() {
        
        for(Integer i = 0; i<=1000;i++){

            System.out.println("I am Child Thread");

        }

    }
    public static void main(String[] args) {
        
        Demo d = new Demo();
        d.start();

        for(Integer i = 0; i <= 1000; i++){
            System.out.println("I am Main Thread");
        }


    }
}
