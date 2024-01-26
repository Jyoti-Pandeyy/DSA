public class Oops{
    public static class Person {
        int age;
        String name;

        public void saysHi(){
            System.out.println(name + " [" + age + "] says hi!");
        }

        public static void Swap1(Person p1, Person p2){
            Person temp = p1;
            p1 = p2;
            p2 = temp;
        }

        public static void Swap2(Person p1, Person p2){
            int age = p1.age;
            p1.age = p2.age;
            p2.age = age;

            String name = p1.name;
            p1.name = p2.name;
            p2.name = name;
        }

        public static void Swap3(Person p1, Person p2){
            p1 = new Person();
            int age = p1.age;
            p1.age = p2.age;
            p2.age = age;

            p2 = new Person();
            String name = p1.name;
            p1.name = p2.name;
            p2.name = name;
        }
    }

}
