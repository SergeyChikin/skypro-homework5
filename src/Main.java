public class Main {
     public static void main(String[] args) {
         task1 ();
         task2 ();
         task3 ();
         task4 ();
         task5 ();
         task6 ();
         task7 ();

     }
     public static void task1 () {
         System.out.println("Задача 1");


         int age = 19;

         if ( age >= 18 ) {
             System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний.");
         } else {
             System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать.");
         }
     }

     public static void task2 (){
         System.out.println("Задача 2");
         float airTemperature = 12f;

         if ( airTemperature < 5 ) {
             System.out.println("На улице " + airTemperature + " градусов, нужно одеть шапку.");
         } else {
             System.out.println( "На улице " + airTemperature + " градусов, можно идти без шапки.");
         }
     }
     public static void task3 (){
         System.out.println("Задача 3");
         int speed = 85;

         if ( speed > 60) {
             System.out.println( "Если скорость " + speed + ", то придётся заплатить штраф.");
         } else {
             System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
         }
     }
     public static void task4 () {
         System.out.println("Задача 4");
         int ageOfThePerson = 40;
         if ( ageOfThePerson >=2 && ageOfThePerson <= 6 ){
             System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходить в детский сад. ");
         } else if ( ageOfThePerson >= 7 && ageOfThePerson <= 18 ) {
             System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходить в школу");
         } else if ( ageOfThePerson > 18 && ageOfThePerson < 24 ) {
             System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходить в университет");
             
         } else if ( ageOfThePerson >= 24 && ageOfThePerson <= 65 ) {
             System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходить на работу.");

         } else {
             System.out.println("Какой замечательный возраст!");
         }
     }
     public static void task5 (){
         System.out.println("Задача 5");
         int ageKid = 13;
         if ( ageKid < 5 ) {
             System.out.println("Если возраст ребёнка равен " + ageKid + ", то ему нельзя кататься на аттракционе.");
         } else if (ageKid >= 5 && ageKid <= 14) {
             System.out.println("Если возраст ребёнка равен " + ageKid + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
         } else {
             System.out.println("Если возраст ребёнка равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
         }
     }
     public static void task6 () {
         System.out.println("Задача 6");
         int passengerNumber = 61;
         if ( passengerNumber >= 1 && passengerNumber <= 60 ) {
             System.out.println("В вагоне есть сидячие места.");
         } else if ( passengerNumber > 60 && passengerNumber <= 120 ) {
             System.out.println("В вагоне остались стоячие места.");
         }else {
             System.out.println("В вагоне мест нет.");
         }
     }
     public static void task7 () {
         System.out.println("Задача 7");
         int one;
         int two;
         int three;
         one = 75;
         two = 34;
         three = -2;
         if ( one > two && one > three ) {
             System.out.println( one );
         } else if ( two > one && two > three ) {
             System.out.println( two );
         } else {
             System.out.println( three );
         }
     }

}