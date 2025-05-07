package Java8_Streams;

import java.util.*;
import java.util.stream.Collectors;

class Person{
    private String name ;
    private String city;
    private int age;

    public Person(String name , String city , int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return name;
    }

}

public class TaskWithHelpOfCollectors {
    public static void main(String[] args) {
        /*
        Simple task with concept of stream , Collectors
         */
        List<Person> person = Arrays.asList(
                new Person("Ram","Bharatpur",20),
                new Person("Shyam","Devchuli",19),
                new Person("Hari","Gaindakot",45),
                new Person("Kishan","taadi",21),
                new Person("Krishna","Bharatpur",20),
                new Person("Balram","Bharatpur",40),
                new Person("Radha","Devchuli",18),
                new Person("Laxmi","Kathmandu",12),
                new Person("Shiva","Kathmandu",10)
        );

        //count people by city
        System.out.println("No. of people By City :");
        Map<String, Long> countPeopleByCity = person.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
        System.out.println(countPeopleByCity);

        //Calculating Average Age of City
        System.out.println("Average Age of Each City : ");
        Map<String, Double> averageAgeOfCity = person.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.averagingInt(Person::getAge)));
        System.out.println(averageAgeOfCity);

        //Grouping People By city
        System.out.println("Grouping people by City");
        Map<String, List<Person>> peopleByCity = person.stream().collect(Collectors.groupingBy(Person::getCity));
        System.out.println(peopleByCity);

        //Partitions minors and Adults
        System.out.println("Partition by Age true=[minor] and false=[adults] :");
        Map<Boolean, List<Person>> partitionByAge = person.stream().collect(Collectors.partitioningBy(x -> x.getAge() < 18));
        //it will show minors in true box and adults in false box
        System.out.println(partitionByAge);

        // Get full statistics on age
        System.out.println("Some Statistics of Age of All Data :");
        IntSummaryStatistics stats = person.stream().collect(Collectors.summarizingInt(Person::getAge));

        person.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(p-> System.out.println("Oldest person : "+p.getName()+" age: "+p.getAge()));
        person.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .ifPresent(p-> System.out.println("Youngest person : "+p.getName()+" age: "+p.getAge()));
        System.out.println("Average Age : "+stats.getAverage());

    }
}
