// class Animal{
//     void makeSound(){
//         System.out.println("Animal Makes A Sound : ");
//     }
// }
// class dog extends Animal{
//     void makeSound(){
//         System.out.println("Dog :- Woof! Woof!");
//     }
// }
// class cat extends Animal{
//     void makeSound(){
//         System.out.println("Cat :- Meow! Meow!");
//     }
// }

// public class binding {
//     public static void main(String[] args) {
//         Animal dog = new dog();
//         Animal cat = new cat();
//         playSound(dog);
//         playSound(cat);
//     }
//      void playSound(Animal a) {
//         a.makeSound();
//     }
// }


class Animal {
    void makeSound() {
        System.out.println("Animal Makes A Sound : ");
    }
}

class dog extends Animal {
    void makeSound() {
        System.out.println("Dog :- Woof! Woof!");
    }
}

class cat extends Animal {
    void makeSound() {
        System.out.println("Cat :- Meow! Meow!");
    }
}

public class binding {
    public static void main(String[] args) {
        Animal dog = new dog();
        Animal cat = new cat();
        playSound(dog);
        playSound(cat);
    }

    static void playSound(Animal a) {
        a.makeSound();
    }
}
