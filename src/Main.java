//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task 1

        int age = 20;

        if (age >= 18) {

            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");


        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

// task 2

        int temperature = 11;
        if (temperature < 5) {

            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {


            System.out.println("Сегодня тепло, можно идти без шапки.");
        }

        // task 3

        int speed = 79;
        if (speed > 60) {

            System.out.println("Если скорость " + speed + " то придётся заплатить штраф.");
        } else {


            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        }

        //task 4

        int age2 = 4;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в сад.");

        }
        age2 = 16;
        if (age2 >= 7 && age2 <= 17) {

            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу. ");
        }

        age2 = 21;
        if (age2 >= 18 && age2 <= 24) {

            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет.");
        }

        age2 = 25;
        if (age2 > 24) {

            System.out.println("Если возраст человека больше  " + age2 + " то ему нужно ходить на работу.");
        }


        //   task 5
        int kid = 3;
        if (kid <=5) {

            System.out.println("Если возраст ребёнка равен " + kid + " то ему нельзя кататься на аттракционе.");

            kid = 8;
            if (kid >= 5 && kid <= 14) {

                System.out.println("Если возраст ребёнка равен " + kid + " то ему можно кататься на аттракционе в сопровождении взрослых.");

                kid = 15;

                if (kid > 14) {
                    System.out.println("Если ребёнок старше " + kid +  ", то он может кататься на аттракционе без сопровождения.");
                }

                // task 6

                String ticket744 = "sedentary ticket №744";  // как мне его использовать в коде? наставник, подскажи
                int wagon = 102;
                int sedentaryBusy = 60;
                int standingBusy = 72;
                if (sedentaryBusy < 60) {
                    System.out.println("В вагоне ещё остались сидячие места.");
                } else {

                    System.out.println("Все сидячие места заняты.");
                }
                if (standingBusy >=60 && standingBusy <102) {

                    System.out.println("В вагоне ещё остались стоячие места.");


                } else {
                    System.out.println("Вагон полный.");


                }


                //task 7

                int one = 744;
                int two = 624;
                int three = 63;
                if (one < two){
                    System.out.println(" Переменная two большая.");
                }else if (two < three) {
                    System.out.println(" Переменная three большая.");
                }else{

                    System.out.println(" Переменная one большая.");
                }
                // если не верно, наставник, помогай, я не справляюсь...


            }


        }


    }


}





