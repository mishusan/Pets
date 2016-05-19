package io.zipcoder.pets;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by manjushadas on 5/4/16.
 */
public class User {
    int noOfPets;
    Pets pets;
    Scanner scanner=new Scanner(System.in);
    ArrayList<Pets> allMyPets=new ArrayList<>();
    public void askHowManyPets(){
        System.out.println("How many pets do you have?: ");
    }
    public void askTypeOfPet(){
        System.out.println("What type of pet do you have?: ");
    }
    public void askNameOfPet(){
        System.out.println("What is the name of your Pet?");
    }
    public void getNoOfPets(){
        noOfPets=scanner.nextInt();
    }
    public void storeUserInput(){
        askHowManyPets();
        getNoOfPets();
        for(int i=0; i<noOfPets; i++){
            askTypeOfPet();
            String typeOfPet = scanner.next();
            askNameOfPet();
            String nameOfPet=scanner.next();
            switch (typeOfPet.toUpperCase()){
                case "DOG":
                    allMyPets.add(new Dog(nameOfPet));
                    break;
                case  "CAT":
                    allMyPets.add(new Cat(nameOfPet));
                    break;
                case "LLAMA":
                    allMyPets.add(new Llama(nameOfPet));
                    break;
                    default:
                        System.out.println("sorry, we only know about cats, dogs and Llamas");
            }
        }

    }

    public void printPetAndWhatTheySay(){
        for (int i=0;i<allMyPets.size();i++ ){
            System.out.println("User has a "+allMyPets.get(i).getClass().getName().replace("io.zipcoder.pets.",
                    "")+ " named "+allMyPets.get(i).getPetName()+ " and it says " +
                    allMyPets.get(i).speak());
        }
    }
    public void run(){
        storeUserInput();
        printPetAndWhatTheySay();

    }
}
