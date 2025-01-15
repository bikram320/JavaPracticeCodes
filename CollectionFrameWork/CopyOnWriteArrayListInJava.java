package CollectionFrameWork;

import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListInJava extends Thread {
    static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
    @Override
    public void run(){
        list.add(12);
    }
    public static void main(String[]args){

        list.add(9);
        list.add(10);
        list.add(11);

        CopyOnWriteArrayListInJava t1 = new CopyOnWriteArrayListInJava();
        t1.start();

        //This will display the list before adding 12
        for(int elements : list){
            System.out.println(elements);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //this will display the value on list while thread is on sleep condition
        // display the new list with newly added value
        System.out.println("Updated list : "+list);

        CopyOnWriteArrayListInJava obj = new CopyOnWriteArrayListInJava();
        obj.ItemAdder();


    }

    //Another Example

    /* This Function  , ItemAdder Adds the new value while reading
        it adds the new value on a copy arraylist and after the completion of currently running reading operation
        it modifies the main arraylist from reference of copy arraylist
     */
        public  void ItemAdder(){

        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
            list1.add("Leo");
            list1.add("Joe");
            list1.add("john");
            list1.add("Lord");

            for (String Items : list1) {
                System.out.println(Items);
                // if items equals to john then it will add andrew on list ,  but it will not add it on Main arraylist
                // it remains on copyArray list after the completion of reading operation it modifies the Main ArrayList
                if(Items.equals("john")){
                    list1.add("Andrew");
                    System.out.println("Added Andrew While Reading the list");
                }
            }
            System.out.println(list1);
    }
}

