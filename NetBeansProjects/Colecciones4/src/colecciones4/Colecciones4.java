package colecciones4;

import colecciones4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Colecciones4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        ArrayList<Pelicula> peliculas = new ArrayList();
        while (!salir) {
            Pelicula pelicula = new Pelicula();
            System.out.println("ingrese el titulo de la pelicula");
            pelicula.setTitulo(scan.next());
            System.out.println("ingrese el director de la pelicula");
            pelicula.setDirector(scan.next());
            System.out.println("ingrese la duracion de la pelicula");
            pelicula.setDuracion(scan.nextInt());
            peliculas.add(pelicula);

            System.out.println("quiere agregar a otra pelicula? si/no");
            String decision = scan.next();
            if (decision.equals("si")) {
                salir = false;
            } else if (decision.equals("no")) {
                salir = true;
            }
        }
        mostrarPeliculas(peliculas);
        mostrarPeliculasMayorHora(peliculas);
        ordenarPeliculasDuracion(peliculas);
        ordenarPeliculasDuracionMayor(peliculas);
        ordenarPorTitulo(peliculas);
        ordenarPorDirector(peliculas);
    }

    public static void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        for (Object pelicula : peliculas) {
            Pelicula pelicula1 = (Pelicula) pelicula;
            System.out.print("[" + pelicula1.getTitulo() + "]");
            System.out.print("[" + pelicula1.getDirector() + "]");
            System.out.print("[" + pelicula1.getDuracion() + "]");
            System.out.println("");
        }
    }

    public static void mostrarPeliculasMayorHora(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas mayores a un hora: ");
        for (Object pelicula : peliculas) {
            Pelicula pelicula1 = (Pelicula) pelicula;
            if (pelicula1.getDuracion() > 1) {
                System.out.print("[" + pelicula1.getTitulo() + "]");
                System.out.print("[" + pelicula1.getDirector() + "]");
                System.out.print("[" + pelicula1.getDuracion() + "]");
                System.out.println("");
            }
        }
    }

    public static void ordenarPeliculasDuracion(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas ordenadas por duracion: ");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                if (p1.getDuracion() > p2.getDuracion()) {
                    return 1;
                }
                if (p1.getDuracion() < p2.getDuracion()) {
                    return -1;
                }
                return 0;
            }
        });
        mostrarPeliculas(peliculas);
    }

    public static void ordenarPeliculasDuracionMayor(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas ordenadas por duracion mayor a menor: ");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                if (p1.getDuracion() > p2.getDuracion()) {
                    return -1;
                }
                if (p1.getDuracion() < p2.getDuracion()) {
                    return 1;
                }
                return 0;
            }
        });
        mostrarPeliculas(peliculas);
    }

    public static void ordenarPorTitulo(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas ordenadas por Titulo: ");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        mostrarPeliculas(peliculas);
    }
    
    public static void ordenarPorDirector(ArrayList<Pelicula> peliculas) {
        System.out.println("Peliculas ordenadas por Director: ");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        mostrarPeliculas(peliculas);
    }
    
    

}
