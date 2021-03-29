package somemethod;


class SomeMethods {

    public static void addNumber() {
        double number3;
        double number4;
        double totalAll;
        number3 = 12;
        number4 = 16;
        totalAll = number3 + number4;
        System.out.println("Print total using method w/o parameter = " + totalAll + "");
    }

    private static void addNumberParams (double number5, double number6) {

        double totalParams;

        totalParams = number5 + number6;
        System.out.println("Print totalParams using Parameters = " + totalParams + " ");
    }

    private static double totalReturn (double number7, double number8){
        double myReturn;
        myReturn = number7 + number8;
        return myReturn;
    }

        public static void main (String[] args) { //this is where Program Starts
        // Without method (raw)

            double number1;
            double number2;
            double total;

            number1 = 4;
            number2 = 10;
            total = number1 + number2;

            System.out.println("Total w/o funcion / method = " +total+ "");


            SomeMethods.addNumber();
            SomeMethods.addNumberParams(14,15);
            double printTotalRetun;
            printTotalRetun = SomeMethods.totalReturn(18,18);
            System.out.println("Print printTotalReturn using RETURN from method = " + printTotalRetun + "");
        }

    }
