package com.sanvalero.miaplicacion;

import domain.Bike;
import domain.Car;
import domain.Vehicle;

import java.util.*;

public class Application {
    public static void main(String[] args){
        /**Lista simple**/
        /**ArrayList<Vehicle> vehiclesArrayList = new ArrayList<>();**/

        /**Cuando introducimos un objeto repetido, lo omite. Depende del Equals y del hashCode**/
        /**HashSet<Vehicle> vehicles = new HashSet<>();**/

        /**Un tipo de lista que no tiene número de posición como una matriz [i], si no que se establece un atributo
         * del objeto como "Campo Clave", mediante el cual localiza cada objeto. Por ejemplo, podemos indicar que el
         * campo clave de vehiculo es "License" para buscar el que queramos sin necesidad de buscar uno por uno
         * en toda la lista el item que tiene ese numero de licencia**/
        /**HashMap<String, Vehicle> vehicles = new HashMap<>();**/

        /**Una lista que se mantiene siempre ordenada. Depende de compareTo**/
        TreeSet<Vehicle> vehicles = new TreeSet<>();

        Vehicle bike = new Bike ("M76000", "HONDA", 450);
        vehicles.add(bike);
        Vehicle vehicle = new Car("A45765", "HONDA", 300, 5);
        vehicles.add(vehicle);
        Vehicle vehicle1 = new Car ("D646768", "OPEL", 780, 3);
        vehicles.add(vehicle1);
        System.out.println(vehicles.toString());
        Vehicle vehicle2 = new Car ("TOLENTO", "MATAO", 100, 5);
        vehicles.add(vehicle2);
        System.out.println(vehicles.toString());

    }
}
