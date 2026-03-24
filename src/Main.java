//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task 1

        int age = 18;

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

        int agee = 4;
        if (agee > 2 && agee < 6) {
            System.out.println("Если возраст человека равен " + agee + " то ему нужно ходить в сад.");

        }
        agee = 10;
        if (agee > 7 && agee < 17) {

            System.out.println("Если возраст человека равен " + agee + " то ему нужно ходить в школу. ");
        }

        agee = 21;
        if (agee > 18 && agee < 24) {

            System.out.println("Если возраст человека равен " + agee + " то ему нужно ходить в университет.");
        }

        agee = 25;
        if (agee > 25) {

            System.out.println("Если возраст человека больше  " + agee + " то ему нужно ходить на работу.");
        }


        //   task 5
        int kid = 3;
        if (kid < 5) {

            System.out.println("Если возраст ребёнка равен " + kid + " то ему нельзя кататься на аттракционе.");

            kid = 8;
            if (kid > 5 && kid <= 14) {

                System.out.println("Если возраст ребёнка равен " + kid + " то ему можно кататься на аттракционе в сопровождении взрослых.");

                kid = 15;

                if (kid > 14) {
                    System.out.println("Если ребёнок старше 14 лет, то он может кататься на аттракционе без сопровождения.");
                }

                // task 6


                int wagon = 102;
                int sedentaryBusy = 60;
                int standingBusy = 12;
                if (sedentaryBusy > 60) {
                    System.out.println("Все сидячие места заняты!");
                } else {

                    System.out.println("В вагоне ещё остались сидячие места.");
                }
                if (standingBusy > 42) {

                    System.out.println("Вагон полный!");


                } else {
                    System.out.println("В вагоне ещё остались стоячие места.");


                }


                //task 7

                int one = 1;
                int two = 2;
                int three = 3;
                if (one >= 3) {
                    System.out.println("Это большее число.");
                }
                if (two >= 3) {
                    System.out.println("Это большее число.");
                }
                if (three >= 3) {
                    System.out.println("Это большее число.");
                }

            }


        }


    }


}





