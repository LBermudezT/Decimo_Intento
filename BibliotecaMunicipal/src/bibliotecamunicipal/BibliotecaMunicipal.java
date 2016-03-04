/*
 * Sustentacion Java Version 2.0 
 */
package bibliotecamunicipal;
import java.util.Scanner;

/**
 * @author Luciano Bermudez
 */
public class BibliotecaMunicipal {  
    public static void main(String[] args) {
        GeneralData Datos[] = new GeneralData[100]; //Almacena 100 Libros
        Scanner lector = new Scanner (System.in);
        int opcion = 0;
        int opcion1 = 0;
        int contUs = 0, prestados = 0; //cuantos libros hay en el sistema
        int busca = 0;  
        String name, cedula; //variable para actualizar, eliminar y buscar
        
        do{
            System.out.println("\nMENU PRINCIPAL"); 
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Actualizar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Buscar Libro");
            System.out.println("5. Gestionar Libro");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    if (contUs<99){
                        Datos[contUs] = new GeneralData();
                        System.out.println("\nINGRESO DE LIBROS");
                        System.out.print("Digite el nombre del Libro: ");
                        Datos[contUs].setNombre(lector.next());
                        System.out.print("Digite el autor del Libro: ");
                        Datos[contUs].setAutor(lector.next());
                        System.out.print("Digite el año de publicacion del Libro: ");
                        Datos[contUs].setPublicacion(lector.next());
                        System.out.print("Digite el codigo del Libro: ");
                        Datos[contUs].setCodigo(lector.next());
                        System.out.print("Digite el area del Libro: Quimica, Fisica, Tecnologia, Calculo, Programacion: ");
                        Datos[contUs].setArea(lector.next());
                          
                        contUs++;
                        }
                    else
                        System.out.println("NO HAY MAS MEMORIA");
                    break;
                case 2:
                       System.out.println("\nACTUALIZAR DATOS ");
                       System.out.print("Digite el nombre del libro a actualizar: ");
                        name = lector.next();
                        for (int i = 0; i < contUs; i++){
                            if (name.equals(Datos[i].getNombre())){
                                busca = 1;
                                System.out.print("Digite el autor del Libro: ");
                                Datos[contUs].setAutor(lector.next());
                                System.out.print("Digite el nuevo año de publicacion del Libro: ");
                                Datos[contUs].setPublicacion(lector.next());
                                System.out.print("Digite el nuevo codigo del Libro: ");
                                Datos[contUs].setCodigo(lector.next());
                                System.out.print("Digite la nueva area del Libro: Quimica, Fisica, Tecnologia, Calculo, Programacion: ");
                                Datos[contUs].setArea(lector.next());  
                            }
                        }
                        if(busca == 0)
                            System.out.println("\nLIBRO NO ENCONTRADO");
                        else
                            busca =0;              
                    break;
                case 3:
                        System.out.println("\nELIMINAR LIBRO ");
                        System.out.print("Digite el nombre del libro a borrar: ");
                        name = lector.next();
                        for (int i = 0; i < contUs; i++){
                            if (name.equals(Datos[i].getNombre())){
                                contUs --;  
                            System.out.println("\nLIBRO ELIMINADO");
                            }
                        }         
                    break;
                case 4:
                        System.out.println("\nBUSCAR LIBRO ");
                        System.out.print("Nombre del libro a buscar: ");
                        name = lector.next();
                        for (int i = 0; i < contUs; i++){
                            if (name.equals(Datos[i].getNombre())){
                            System.out.println ("Libro: " + (Datos[i].getNombre())); 
                            System.out.println ("Autor: " + (Datos[i].getAutor()));
                            System.out.println ("Año de publicacion: " + (Datos[i].getPublicacion())); 
                            System.out.println ("Area: " + (Datos[i].getArea()));
                            }
                        }
                    break;
                case 5:
                       do
                       {
                       System.out.println("\nGESTIONAR LIBRO ");
                       System.out.println("1. Gestionar prestamo ");
                       System.out.println("2. Gestionar devolucion ");
                       System.out.println("3. Libros prestados ");
                       System.out.println("4. Regresar al Menu principal ");
                       opcion1 = lector.nextInt();
                       switch (opcion1){
                            case 1:
                                if (contUs<99){
                                Datos[contUs] = new GeneralData();
                                System.out.print("Ingrese su numero de cedula: ");
                                cedula = lector.next();
                                System.out.print("Nombre del libro a prestar: ");
                                name = lector.next();
                                    for (int i = 0; i < contUs; i++)
                                    {
                                        if (name.equals(Datos[i].getNombre()))
                                            {
                                            System.out.println ("Libro: " + (Datos[i].getNombre())); 
                                            System.out.println ("Autor: " + (Datos[i].getAutor()));
                                            System.out.println ("Año de publicacion: " + (Datos[i].getPublicacion())); 
                                            System.out.println ("Area: " + (Datos[i].getArea()));
                                            System.out.println ("Prestado a: " + cedula);
                                            prestados ++;
                                            contUs --;
                                            }
                                    }
                                }
                                break;
                            
                            case 2:
                                System.out.print("Nombre del libro a devolver: ");
                                if (contUs<99){
                                Datos[contUs] = new GeneralData();
                                Datos[contUs].setNombre(lector.next());
                                System.out.print("Digite el autor del Libro: ");
                                Datos[contUs].setAutor(lector.next());
                                System.out.print("Digite el año de publicacion del Libro: ");
                                Datos[contUs].setPublicacion(lector.next());
                                System.out.print("Digite el codigo del Libro: ");
                                Datos[contUs].setCodigo(lector.next());
                                System.out.print("Digite el area del Libro: Quimica, Fisica, Tecnologia, Calculo, Programacion: ");
                                Datos[contUs].setArea(lector.next());
                                contUs++;
                                prestados --;
                                }
                                else
                                    System.out.println("NO HAY MAS MEMORIA");
                                break;
                            
                            case 3:
                                
                                System.out.println (+ prestados + " libros prestados de " + contUs + " en biblioteca");
                                break;
                            default:
                                System.out.println("\nOPCION INCORRECTA!\n");
                                break;
                       }
                       }while(opcion1 != 4); 
                    break;    
                case 6:
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA, BYE");
                    break;
                default:
                    System.out.println("\nOPCION INCORRECTA!\n");
                    break;                              
            }
        }while(opcion != 6);
    }    
}
    