
package Customers;

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

