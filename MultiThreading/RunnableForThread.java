package MultiThreading;

//class threadGenerating implements Runnable{
//    @Override
//    public void run() {
//        for(int i = 1 ; i <11 ; i++) {
//            System.out.println("Thread  0 ");
//            try{
//                Thread.sleep(10);
//            }catch (InterruptedException e ){
//                System.out.println("Exception occur :"+e.getMessage());
//            }
//        }
//    }
//}
//class threadGenerating1 implements Runnable{
//
//    @Override
//    public void run() {
//        for(int i =1 ; i<11; i++) {
//            System.out.println("Thread 1 ");
//            try{
//                Thread.sleep(19);
//            }catch(InterruptedException e ){
//                System.out.println("Exception occur : "+e.getMessage());
//            }
//        }
//
//    }
//}


public class RunnableForThread {
    public static void main(String []a){

//        threadGenerating obj = new threadGenerating();
//        threadGenerating1 obj1 = new threadGenerating1();

        Runnable obj = () ->
        {
                    for(int i = 1 ; i <11 ; i++) {
                        System.out.println("Thread  0 ");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            System.out.println("Exception occur :" + e.getMessage());
                        }
                    }
        };
        Runnable obj1 = () ->
        {
            for(int i = 1 ; i <11 ; i++) {
                System.out.println("Thread  1 ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Exception occur :" + e.getMessage());
                }
            }
        };

        Thread thread= new Thread(obj);
        Thread thread1 = new Thread(obj1);

        thread.start();
        thread1.start();
    }
}
