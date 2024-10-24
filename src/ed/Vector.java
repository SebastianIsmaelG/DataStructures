package ed;

import java.util.Arrays;

public class Vector {
    private Alumno[] alumnos = new Alumno[100];
    private int totalDeAlumnos = 0;

    private boolean posicionValida(int posicion) {
        return posicion >= 0 && posicion <= totalDeAlumnos;
    }
    /*/revisar
    public void adiciona(Alumno alumno) {
        this.guardarEspacio();
        this.alumnos[totalDeAlumnos] = alumno;
        totalDeAlumnos++;
    }

    /*/
    public void adicionar(int posicion,Alumno alumno){
        //resolver el adicionar en una posicion mayor al tamaño del totalDeAlumnos
        this.guardarEspacio();//nuevo array

        if(!posicionValida(posicion)) {
            throw new IllegalArgumentException("posicion invalida");
        }
        for(int i = totalDeAlumnos - 1; i >= posicion; i-=1) {
            alumnos[i+1] = alumnos[i];
        }
        alumnos[posicion] = alumno;
        totalDeAlumnos++;
    }

    private boolean posicionOcupada(int posicion) {
        return posicion >= 0 && posicion < totalDeAlumnos;
    }

    public Alumno obtener(int posicion){
        if(!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("posición invalida");//revisar en documentacion
        }

        return alumnos[posicion];
    }

    public void remover(int posicion){
        for(int i = posicion; i < this.totalDeAlumnos; i++) {
            this.alumnos[i] = this.alumnos[i+1];
        }
        totalDeAlumnos--;
    }

    private void guardarEspacio(){
        if (totalDeAlumnos == alumnos.length){
            Alumno[] nuevoArray = new Alumno[alumnos.length*2];
            for(int i= 0; i < alumnos.length; i++){
               nuevoArray[i] = alumnos[i];
            }
            this.alumnos = nuevoArray;
        }
    }

    public boolean contiene(Alumno alumno){
        for(int i = 0; i < totalDeAlumnos; i++) {
            if(alumno.equals(alumnos[i])) {
                return true;
            }
        }
        return false;
    }

    public int totalAlumnos(){
        return totalDeAlumnos;
    }

    public String toString(){
        return Arrays.toString(alumnos);
    }
}
