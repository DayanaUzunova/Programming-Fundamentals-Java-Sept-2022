public class Main {
        public static void main(String[] args) {
            Person p1 = new Person("Dayana", "Uzunova", 18);
            Person p2 = new Person("Dayana", "Uzunova", 18);
            System.out.println("The s1 hashcode is: " + p1.hashCode());
            System.out.println("The s2 hashcode is: " + p2.hashCode());
        }
    }

