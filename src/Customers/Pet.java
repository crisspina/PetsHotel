
package Customers;

import Activities.Activities;
import java.util.Objects;
import java.util.Scanner;

public class Pet {
    private String name;
    private String age;
    private PetType type;

    public Pet(){
    
}
    public Pet(String name, String age,PetType type) {
        this.name = name;
        this.age = age;
        this.type=type;
 
    }
    
    public void petScan(){
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter pet name: ");
        name = sn.nextLine();
        
        System.out.print("Enter pet age: ");
        age = sn.nextLine();
        
        int choice;
            System.out.println("Pet type: ");
            System.out.println("\t 1. DOG ");
            System.out.println("\t 2. CAT ");
            System.out.println("\t 3. RABBIT");
            System.out.println("\t 4. RACOON ");
            System.out.print("Enter your number pet type: ");            
            choice = sn.nextInt();
            switch (choice) {
                case 1:
                    type = type.DOG;
                    break;
                case 2:
                    type = type.CAT;
                    break;
                case 3:
                    type = type.RABBIT;
                    break;
                case 4:
                    type = type.RACOON;
                    break;
            }
        
        System.out.println("-------------------------------");
        System.out.println("Pet name: " + name);
        System.out.println("Pet age: " + age);
        System.out.println("Pet type: " + type);
        System.out.println("Add pet: " + addMai());
    }
    public boolean addMai() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Do you want to add another pet: \n"
                + "\t  1 : Yes \n"
                + "\t  2 : No \n"
                + "Answers number: ");
        int choose = sn.nextInt();
        if (choose == 1) {
            return true;
        }
        return false;
    }

    public void addPet() {
        int count = 0;
        do {
            petScan();
        } while (addMai());

        count = count++;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public PetType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pet other = (Pet) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", age=" + age + ", type=" + type + '}';
    }

 

    
}

