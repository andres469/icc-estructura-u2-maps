package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }
public void runHashMap(){
    Map<String, String> mapa=new HashMap();
    mapa.put("001", "Celular");
    mapa.put("002", "Celular");
    mapa.put("003", "Celular");
    System.out.println(mapa);
    System.out.println(mapa.keySet());
    for (String codigo : mapa.keySet()) {
        System.out.println(mapa.get(codigo));
    }
    System.out.println(mapa.get("001"));
    System.out.println(mapa.get("005"));
}

public void runLinkedHashMap(){
    Map<Integer, String> personas = new LinkedHashMap<>();
        personas.put(1, "Ana");
        personas.put(2, "Luis");
        personas.put(3, "Carlos");
        personas.put(4, "Marta");
        personas.put(5, "Pedro");
        System.out.println(personas);
        System.out.println("Claves: " + personas.keySet());
        for (Integer numero : personas.keySet()) {
            System.out.println("Clave: " + numero + ", Valor: " + personas.get(numero));
        }
        System.out.println("Valor con clave 1: " + personas.get(1));
        System.out.println("Valor con clave 10: " + personas.get(10));   
}

public void runtreeMap(){
    Map<Integer, String> items=new TreeMap();
    items.put(3, "CARRO");
    items.put(2, "PILA");
    items.put(1, "TRACTOR");

}
public void runHashMapObj(){
    Map<Empleado,Integer> empleados =new HashMap();
    empleados.put(new Empleado(1, "Juan", "dev"), 1200);
    empleados.put(new Empleado(2, "Andres", "dev"), 1500);
    empleados.put(new Empleado(3, "Tenesaca", "dev"), 2000);
    empleados.put(new Empleado(1, "Juan", "dev"), 2500);


}
public int compare(Empleado emp){
    int comparacionId=Integer.compare(id, emp.Id);
    if (comparacionId!=0) {
        return comparacionId;
    }
    return nombre.comareTo(emp.getName());
}
public void runTreeMapObj(){
    
}

}

