public class Main {
    public static void main(String[] args){

        //AQUI COMIENZA EL CODIGO DEL RETO 1

        if(args.length==0)
        System.out.println("Captura Operacion");
        //System.out.println(args.length);

        if(args.length==1)
            System.out.println("Operando 1: ");

        if(args.length==2){
            System.out.println("Operando 2: ");
        }
        for(int i = 0; i < args.length; i++){
            if (args.length==3){
                switch (args[0]) {
                    case "SUMA" ->
                            System.out.println(args[1] + "+" + args[2] + "=" + (Integer.parseInt(args[0 + 1]) + Integer.parseInt(args[0 + 2])));
                    case "MULTIPLICACION" ->
                            System.out.println(args[1] + "*" + args[2] + "=" + (Integer.parseInt(args[0 + 1]) * Integer.parseInt(args[0 + 2])));
                    case "DIVISION" ->
                            System.out.println(args[1] + "/" + args[2] + "=" + (Integer.parseInt(args[0 + 1]) / Integer.parseInt(args[0 + 2])));
                    case "RESTA" ->
                            System.out.println(args[1] + "-" + args[2] + "=" + (Integer.parseInt(args[0 + 1]) - Integer.parseInt(args[0 + 2])));
                    default -> System.out.println("Operacion no soportada");
                }

            }

        }

//AQUI COMIENZA EL CODIGO DE LA TAREA 3

        /*

        int operationIndex = 0;
        do {
            String operation = args[operationIndex];
            int parameter1 = Integer.parseInt(args[operationIndex + 1]);
            int parameter2 = Integer.parseInt(args[operationIndex + 2]);

            switch (operation) {
                case "SUMA" -> System.out.println(parameter1 + "+" + parameter2 + "=" + (parameter1 + parameter2));
                case "MULTIPLICACION" ->
                        System.out.println(parameter1 + "*" + parameter2 + "=" + (parameter1 * parameter2));
                case "DIVISION" -> System.out.println(parameter1 + "/" + parameter2 + "=" + (parameter1 / parameter2));
                case "RESTA" -> System.out.println(parameter1 + "-" + parameter2 + "=" + (parameter1 - parameter2));
            }
            operationIndex += 3;
        }while(operationIndex < args.length);

        */

    }

}