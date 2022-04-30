import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Zombies[] zmb = new Zombies[25];
    static Ubicaciones[] bcns = new Ubicaciones[25];
    static int i = 0;
    static int m = 0;

    public static void main(String[] args) {
        System.out.println("Este programa esta destinado para la alcaldia de Alexandria y su supervivencia en el apocalipsis zombie");
        System.out.println();
        System.out.println("Este programa fue hecho por Juan Alejandro Osorno Bustamante");
        System.out.println("Proyecto Uno");
        System.out.println("Curso Fundamentos de Programación");
        System.out.println("ST0242_5251_2261");
        mostrarMenu();
    }
    public static void mostrarMenu() {
        while (true) {
            System.out.println("Por favor ingrese un numero");
            System.out.println("Si digita 0, el programa finaliza su ejecucion.");
            System.out.println("Si digita 1, el programa creara un zombie.");
            System.out.println("Si digita 2, se mostraran los datos de los zombies creados.");
            System.out.println("Si digita 3, se mostrara la cantidad de zombies creados.");
            System.out.println("Si digita 4, unicamente se mostrara la informacion de los zombies cuyo tipo de sangre sea O+ o AB+");
            System.out.println("Si digita 5, unicamente se mostrara la informacion de los zombies que hayan nacido despues del 2000");
            System.out.println("Si digita 6, se reducira a la mitad la salud de todos los zombies");
            System.out.println("Si digita 7, el programa creara una ubicacion");
            System.out.println("Si digita 8, se mostraran los datos de las ubicaciones creadas.");
            System.out.println("Si digita 9, se mostrara la ubicacion mas segura");
            System.out.println("Si digita 10, se ordenaran las ubicaciones con respecto a su distancia de Alexandria");
            System.out.println("Si digita 11, se mostrara una frase aleatoria sobre zombies");
            System.out.println("Si digita 12, mostrara las ubicaciones mas cercanas");
            System.out.println("Su numero es:");
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            if (x == 1) {
                System.out.println("Ingrese un nombre, una salud, una fecha, y el tipo de sangre para el zombie");
                String nombre = sc.next();
                int salud = sc.nextInt();
                int fecha = sc.nextInt();
                String tipoDeSangre = sc.next();
                Zombies Zmbs = new Zombies(nombre, salud, fecha, tipoDeSangre);
                zmb[i] = Zmbs;
                i++;
            }
            if (x == 2) {
                System.out.println("Todos los zombies son:");
                for (int j = 0; j < i; j++) {
                    System.out.println(zmb[j].toString());
                }
            }
            if (x == 3) {
                System.out.println("La cantidad de zombies es: " + i);
            }
            if (x == 4) {
                for (int j = 0; j < i; j++) {
                    if (zmb[j].getTipoDeSangre().equals("O+") || zmb[j].getTipoDeSangre().equals("AB+")) {
                        System.out.println(zmb[j].toString());
                    }
                }
            }
            if (x == 5) {
                for (int j = 0; j < i; j++) {
                    if (zmb[j].getFecha() >= 2000) {
                        System.out.println(zmb[j].toString());
                    }
                }
            }
            if (x == 6) {
                System.out.println("La salud de los zombies ha sido reducida a la mitad");
                for (int j = 0; j < i; j++) {
                    zmb[j].setSalud(zmb[j].getSalud() / 2);
                }
            }
            if (x == 7) {
                System.out.println("Ingrese un nombre, una distancia y una cantidad de zombies");
                String nombree = sc.next();
                float distanciaAlexandria = sc.nextFloat();
                int cantidadZombies = sc.nextInt();
                Ubicaciones Ubnc = new Ubicaciones(nombree, distanciaAlexandria, cantidadZombies);
                bcns[m] = Ubnc;
                m++;
            }
            if (x == 8) {
                System.out.println("Todas las ubicaciones son:");
                for (int g = 0; g < m; g++) {
                    System.out.println(bcns[g].toString());
                }
            }
            if (x == 9) {
                Ubicaciones bn = bcns[0];
                System.out.println("La ubicación más segura es:");
                for (int g = 0; g < m-1; g++){
                    if (bcns[g].getCantidadZombies()>bcns[g+1].getCantidadZombies()) {
                        bn = bcns[g+1];
                    }
                }
                System.out.println(bn.toString());
            }
            if (x == 10) {
                Ubicaciones[] ornd = bcns;
                System.out.println("Todas las ubicaciones ordenadas por distancia son:");
                for(int g = 0 ;g < m/2; g++){
                    for(int k = 0; k < m-1; k++){
                        if(ornd[k].compareTo(ornd[k + 1])== 1){
                            Ubicaciones tmp = ornd[k];
                            ornd[k] = ornd [k + 1];
                            ornd[k + 1]= tmp;
                        }
                    }
                    for (int t = 0; t < m; t++) {
                        System.out.println(ornd[t].toString());
                    }
                }
            }
            if (x == 11) {
                String[] frs = new String[5];
                frs[0] = "Los zombies tienen una colaboracion musical con Michael Jackson";
                frs[1] = "Call of Duty tiene por lo general un modo zombie en todas sus versiones";
                frs[2] = "Existe 0,00014% de probabilidad de un apocalipsis zombie";
                frs[3] = "El 4 de febrero se celebra el dia del Orgullo Zombie";
                frs[4] = "A la poblacion humana le demoraria 25 anos recuperarse un apocalipsis zombie";
                int frsltr = (int)(Math.random()*5);
                switch (frsltr) {
                    case 0 -> System.out.println(frs[0]);
                    case 1 -> System.out.println(frs[1]);
                    case 2 -> System.out.println(frs[2]);
                    case 3 -> System.out.println(frs[3]);
                    case 4 -> System.out.println(frs[4]);
                }
            }
            if (x == 12) {
                System.out.println("Las siguientes ubicaciones se encuentran a menos de 1km");
                for (int g = 0; g < m; g++) {
                    if (bcns[g].getDistanciaAlexandria() <= 1000) {
                        System.out.println(bcns[g].toString());
                    }
                }
            }
        }
    }
}