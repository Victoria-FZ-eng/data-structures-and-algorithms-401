package cc;

import java.util.ArrayList;

public class AnimalShelter<Animal> {

    Node<Animal> front;
    Node<Animal> rear;
    Node<Animal> frontd;
    Node<Animal> reard;
    ArrayList<Animal> cats = new ArrayList<Animal>();
    ArrayList<Animal> dogs = new ArrayList<Animal>();


    public String enqueue(Animal a){
        if (a.toString()=="cat"){

           if (front == null){
              front = new Node<Animal>( a);
              rear = front;
               cats.add(front.data);
           }else{
              Node<Animal> neww = new Node(a);
              rear.next = neww;
              rear = neww;
               cats.add( rear.data);
           }
        } else  if (a.toString()=="dog"){

            if (frontd == null){
                frontd = new Node<Animal>( a);
                reard = frontd;
                dogs.add(frontd.data);
            }
        }
        else {
            System.out.println("This shelter is only for cats and dogs");
        }
        return "Animals: "+cats + dogs;
    }

    public Animal  dequeue(Animal pref) throws Exception{
        Animal a = null;
        if(pref.toString()=="cat"){
            if (front == null){
                System.out.println("SORRY! no more cats in the shelter");
                throw new Exception();
            }else{
                a = (Animal) front.data;
                front = front.next;
                cats.remove(0);
            }
        }else if(pref.toString()=="dog"){
            if (frontd == null){
                System.out.println("SORRY! no more dogs in the shelter");
                throw new Exception();
            }else{
                a = (Animal) frontd.data;
                frontd = frontd.next;
                dogs.remove(0);
            }
        }else{
            a = null;
        }


        return a;
    }

}
