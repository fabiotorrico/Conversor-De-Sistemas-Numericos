package promocionTorricoSmigoski;
public class promocionTorricoSmigoski {
    public static void main(String[] args) {
        String numero, opcion, conversion;
        boolean verificacion;
        do{
            System.out.println("Ingrese un numero (ya sea binario, decimal o hexadecimal):");
            numero = TecladoIn.readLine();
    
            System.out.println("Elija la opcion que desea realizar:\n"
                    + "         1. Verificar si es un numero binario valido.\n"
                    + "         2. Verificar si es un numero hexadecimal valido.\n"
                    + "         3. Verificar si es un numero decimal valido.\n"
                    + "         4. Convertir binario a hexadecimal.\n"
                    + "         5. Convertir binario a decimal.\n"
                    + "         6. Convertir decimal a binario.\n"
                    + "         7. Convertir decimal a hexadecimal.\n"
                    + "         8. Convertir hexadecimal a binario.\n"
                    + "         9. Convertir hexadecimal a decimal.\n"
                    + "         10. Convertir binario a su complemento a uno.\n"
                    + "         11. Convertir binario a su complemento a dos.\n"
                    + "         12. Terminar.");
            opcion = TecladoIn.readLine();
        
            switch (opcion){
                case "1":
                    verificacion = verificarBinario(numero);
                    if (verificacion){
                        System.out.println("El numero ingresado es un numero binario valido.");
                    }else{
                        System.out.println("El numero ingresado es un numero binario no valido.");
                    }
                    break;
                case "2":
                    verificacion = verificarHexadecimal(numero);
                    if (verificacion){
                        System.out.println("El numero ingresado es un numero hexadecimal valido.");
                    }else{
                        System.out.println("El numero ingresado es un numero hexadecimal no valido.");
                    }
                    break;
                case "3":
                    verificacion = verificarDecimal(numero);
                    if (verificacion){
                        System.out.println("El numero ingresado es un numero decimal valido.");
                    }else{
                        System.out.println("El numero ingresado es un numero decimal no valido.");
                    }
                    break;
                case "4":
                    conversion = convertirBinarioHexadecimal(numero);
                    System.out.println("El numero binario expresado en hexadecimal es "+conversion);
                    break;
                case "5":
                    conversion = convertirBinarioDecimal(numero);
                    System.out.println("El numero binario expresado en decimal es "+conversion);
                    break;
                case "6":
                    conversion = convertirDecimalBinario(numero);
                    System.out.println("El numero decimal expresado en binario es "+conversion);
                    break;
                case "7":
                    conversion = convertirDecimalHexadecimal(numero);
                    if (conversion.equals("")){
                        System.out.println("El numero ingresado es un numero decimal no valido.");
                    }else{
                        System.out.println("El numero decimal expresado en hexadecimal es "+conversion);
                    }    
                    break;
                case "8":
                    conversion = convertirHexadecimalBinario(numero);
                    if (conversion.equals("")){
                        System.out.println("El numero ingresado es un numero hexadecimal no valido");
                    }else{
                        System.out.println("El numero hexadecimal expresado en binario es "+conversion);
                    }
                    break;
                case "9":
                    conversion = convertirHexadecimalDecimal(numero);
                    if (conversion.equals("")){
                        System.out.println("El numero ingresado es un numero hexadecimal no valido");
                    }else{
                        System.out.println("El numero hexadecimal expresado en decimal es "+conversion);
                    }
                    break;
                case "10":
                    convertirBinarioComplemento1(numero);
                    break; 
                case "11":
                    
                    convertirBinarioComplemento2(numero);
                    break;
                case "12":
                    break;
                default:
                    System.out.println("Usted ingreso una opcion incorrecta. Por favor, vuelva a correr su programa.\n¡Que tenga un buen dia!");
                    break;
            }
        
        }while(!"12".equals(opcion));
              
        
    }
    public static boolean verificarBinario(String opcion){
        int contador,i;
        boolean verificacion;
        contador = 0;
        i = 0;
        while (i<opcion.length()){
            if ((opcion.charAt(i)== '1')||
                (opcion.charAt(i)== '0')){
                contador++;
            }
            i++;
        }
        verificacion = contador == i;
        return verificacion;
    }
    public static boolean verificarDecimal(String opcion){
        int contador,i;
        boolean verificacion;
        contador = 0;
        i = 0;
        while (i < opcion.length()){
            if ((opcion.charAt(i)== '0')||
                (opcion.charAt(i)== '1')||
                (opcion.charAt(i)== '2')||
                (opcion.charAt(i)== '3')||
                (opcion.charAt(i)== '4')||
                (opcion.charAt(i)== '5')||
                (opcion.charAt(i)== '6')||
                (opcion.charAt(i)== '7')||
                (opcion.charAt(i)== '8')||
                (opcion.charAt(i)== '9'))
            {
                contador++; 
            }
            i++;
        }
        verificacion = contador == i;
        return verificacion;
    }
    public static boolean verificarHexadecimal(String opcion){
        int contador, i;
        boolean verificacion;
        contador = 0;
        i = 0;
        
        while (contador < opcion.length()){
            if ((opcion.charAt(contador)== '0')||
                (opcion.charAt(contador)== '1')||
                (opcion.charAt(contador)== '2')||
                (opcion.charAt(contador)== '3')||
                (opcion.charAt(contador)== '4')||
                (opcion.charAt(contador)== '5')||
                (opcion.charAt(contador)== '6')||
                (opcion.charAt(contador)== '7')||
                (opcion.charAt(contador)== '8')||
                (opcion.charAt(contador)== '9')||
                (opcion.charAt(contador)== 'A')||
                (opcion.charAt(contador)== 'B')||
                (opcion.charAt(contador)== 'C')||
                (opcion.charAt(contador)== 'D')||
                (opcion.charAt(contador)== 'E')||
                (opcion.charAt(contador)== 'F')||
                (opcion.charAt(contador)== 'a')||
                (opcion.charAt(contador)== 'b')||
                (opcion.charAt(contador)== 'c')||
                (opcion.charAt(contador)== 'd')||
                (opcion.charAt(contador)== 'e')||
                (opcion.charAt(contador)== 'f')){
                i++;
            }
            contador++;
        }
        verificacion = contador == i;   
        return verificacion;
    }
    public static String convertirDecimalBinario(String opcion){
        String binario = "";
        boolean verificacion;
        int contador;
        double exponentedecimal, numero;
        char op;
        exponentedecimal = (opcion.length())-1;
        numero = 0;
        contador = 0;
        verificacion = verificarDecimal(opcion);
        if (verificacion){
            while (contador < opcion.length()){
                op = opcion.charAt(contador);
                switch(op){
                    case '0':
                        numero = numero + 0*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '1':
                        numero = numero + 1*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '2':
                        numero = numero + 2*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '3':
                        numero = numero + 3*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '4':
                        numero = numero + 4*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '5':
                        numero = numero + 5*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '6':
                        numero = numero + 6*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '7':
                        numero = numero + 7*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                    break;    
                    case '8':
                        numero = numero + 8*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;
                    case '9':
                        numero = numero + 9*(Math.pow(10, exponentedecimal));
                        exponentedecimal--;
                        break;   
                    default:
                        break;
                }
            contador++;}
            if (numero > 0){
                while (numero > 0){
                    if (numero %2 == 0){
                        binario = "0" + binario;
                    }else{
                        binario = "1" + binario;
                    }
                    numero = (int) numero / 2;
                }
            }else if (numero == 0){
                binario = "0";
            }else if (numero < 0){
                while (numero > 0){
                    if (numero %2 == 0){
                        binario = "0" + binario;
                    }else{
                        binario = "1" + binario;
                    }
                    numero = (int) numero / 2;
                }
                binario = "-"+binario;
            }
        }
        return binario;
    }
    public static String convertirBinarioDecimal(String opcion){
        int i, b;
        String c;
        double numero;
        boolean verificacion;
        verificacion = verificarBinario(opcion);
        i = opcion.length()-1;
        numero = 0;
        b = 0;
        if(verificacion){
            while (i>-1){
                if (opcion.charAt(i) == '1'){
                    numero = numero + 1*(Math.pow(2,b));
                    b++;
                }else if(opcion.charAt(i) == '0'){
                    numero = numero + 0*(Math.pow(2,b));
                    b++;
                }
            i--;
            }
        }else{
            System.out.println("El numero ingresado es un numero binario no valido.");
        
    }
        c = ""+(int)numero;
        return c;
    }
    
    public static String convertirBinarioHexadecimal(String opcion){
        int resto, cantCuatro;
        boolean verificacion;
        String hexa;
        hexa = "";
        resto = opcion.length()%4;
        verificacion = verificarBinario(opcion);
        if (verificacion){
            if (resto == 0){
                cantCuatro = opcion.length()/4;
                hexa = binarioHexa(cantCuatro,opcion)+hexa;
            }else if(resto<4){
                switch (resto){
                    case 1:
                        opcion = "0"+"0"+"0"+opcion;
                        break;
                    case 2:
                        opcion = "0"+"0"+opcion;
                        break;
                    case 3:
                        opcion = "0"+opcion;
                        break;
                    default:
                        break;
                }
            cantCuatro = opcion.length()/4;
            hexa = binarioHexa(cantCuatro, opcion)+hexa;
            }
        }else{
            System.out.println("El numero ingresado es un numero binario no valido.");
        }
        
        return hexa;
    }
    public static String convertirDecimalHexadecimal(String opcion){
        String binario,hexa;
        boolean verificacion;
        verificacion = verificarDecimal(opcion);
        if(verificacion){
            binario = convertirDecimalBinario(opcion);
            hexa = convertirBinarioHexadecimal(binario);
            
        }else{
            hexa = "";
        }
        return hexa;
    }
    public static String convertirHexadecimalBinario(String opcion){
        String binario;
        int i = 0;
        boolean verificacion;
        verificacion = verificarHexadecimal(opcion);
        binario = "";
        opcion = opcion.toUpperCase();
        if (verificacion){
            while (i < opcion.length()){
                switch (opcion.charAt(i)){
                    case '0':
                        binario = binario + "0000";
                        break;
                    case '1':
                        binario = binario + "0001";
                        break;
                    case '2':
                        binario = binario + "0010";
                        break;
                    case '3':
                        binario = binario + "0011";
                        break;
                    case '4':
                        binario = binario + "0100";
                        break;
                    case '5':
                        binario = binario + "0101";
                        break;
                    case '6':
                        binario = binario + "0110";
                        break;
                    case '7':
                        binario = binario + "0111";
                        break;
                    case '8':
                        binario = binario + "1000";
                        break;
                    case '9':
                        binario = binario + "1001";
                        break;
                    case 'A':
                        binario = binario + "1010";
                        break;
                    case 'B':
                        binario = binario + "1011";
                        break;
                    case 'C':
                        binario = binario + "1100";
                        break;
                    case 'D':
                        binario = binario + "1101";
                        break;
                    case 'E':
                        binario = binario + "1110";
                        break;
                    case 'F':
                        binario = binario + "1111";
                        break;
                    default:
                        System.out.println("El numero ingresado no corresponde a un numero Hexadecimal.");
                        break;
                }   
                i++;
            }
        }else{
            binario = "";
        }
        return binario;
    }
    public static String convertirHexadecimalDecimal(String opcion){
        String binario, decimal;
        boolean verificacion;
        verificacion = verificarHexadecimal(opcion);
        if(verificacion){
            binario = convertirHexadecimalBinario(opcion);
            decimal = convertirBinarioDecimal(binario);
        }else{
            decimal="";
        }
        return decimal;
    }
    public static void convertirBinarioComplemento1(String opcion){
        if (opcion.charAt(0)== '0'){
            System.out.println("El complemento a 1 de su numero es "+opcion+"(positivo)");
        }else if (opcion.charAt(0)== '1'){
            System.out.println("El complemento a 1 de su numero es "+opcion+"(negativo)");
        }
    }
    public static void convertirBinarioComplemento2(String opcion){
        String complementoa, complementob;
        char op;
        int i = 0;
        int a = opcion.length()-1;
        complementob = "";
        if (opcion.charAt(0)== '0'){
            System.out.println("El binario en complemento a 2 es "+opcion+"(positivo)");
        }else if(opcion.charAt(0)=='1'){
            complementoa = "0"+opcion.substring(1);
            op = complementoa.charAt(i);
            while (i<opcion.length()){
                switch(op){
                    case '0':
                        complementob = complementob + "1";
                        break;
                    case '1':
                        complementob = complementob + "0";
                        break;
                    default:
                        System.out.println("No es un numero binario.");
                }
            i++;
            }
            while (a>=0){
                if (opcion.charAt(a)== '0'){
                    complementob = complementob.substring(0,opcion.length())+"1";
                    a = -1;
                }else if(opcion.charAt(a)=='1'){
                    complementob = complementob.substring(0,opcion.length())+"0";
                    a--;
                }
            }
        }
        System.out.println("El binario en complemento a 2 es: " +complementob);
    }
    public static String binarioHexa(int cantCuatro, String opcion){
        int i, c, d;
        String hexa,subs;
        hexa = "";
        i=0;
        opcion = opcion + "0";
        c=opcion.length();
        d=c-5;
        

        while(d>=0){
            subs = opcion.substring(d,c-1);
                    switch(subs){
                        case "0000":
                            hexa = "0"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "0001":
                            hexa = "1"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "0010":
                            hexa = "2"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "0011":
                            hexa = "3"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "0100":
                            hexa = "4"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "0101":
                            hexa = "5"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "0110":
                            hexa = "6"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "0111":
                            hexa = "7"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "1000":
                            hexa = "8"+hexa;
                            c=c-4;
                            d=d-4;
                            break;
                        case "1001":
                            hexa = "9"+hexa;
                            d=d-4;
                            c=c-4;
                            break;    
                        case "1010":
                            hexa = "A"+hexa;
                            d=d-4;
                            c=c-4;
                            break;
                        case "1011":
                            hexa = "B"+hexa;
                            d=d-4;
                            c=c-4;
                            break;
                        case "1100":
                            hexa = "C"+hexa;
                            d=d-4;
                            c=c-4;
                            break;
                        case "1101":
                            hexa = "D"+hexa;
                            d=d-4;
                            c=c-4;
                            break;
                        case "1110":
                            hexa = "E"+hexa;
                            d=d-4;
                            c=c-4;
                            break;
                        case "1111":
                            hexa = "F"+hexa;
                            d=d-4;
                            c=c-4;
                            break;  
                        default:
                            break;
                    }
                i++;}
    return hexa;
    }
}