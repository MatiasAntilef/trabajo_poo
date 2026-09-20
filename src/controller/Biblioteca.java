package controller;

import classes.Alimento;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Alimento> listAlimentos;

    public Biblioteca(){
        listAlimentos = new ArrayList<>();

    }

    public void agregar(Alimento alimento){
        listAlimentos.add(alimento);
    }

    public String buscarALimento(String codigo){
        for (Alimento a : listAlimentos) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a.toString();
            }
        }
        return "Alimento no encontrado con el código: " + codigo;
    }

    public void listar(){
        System.out.println("*****ALIMENTOS****");
        for(Alimento a : listAlimentos){
            System.out.println(a.toString());
            System.out.println("--------------------");
        }
    }
}
