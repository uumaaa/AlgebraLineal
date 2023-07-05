package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Matriz {
    List<Vector> vectores = new ArrayList<>();
    public List<Vector> getVectores() {
        return vectores;
    }

    public void setVectores(List<Vector> vectores) {
        this.vectores = vectores;
    }
    public int getFilas(){
        return this.vectores.size();
    }
    public int getColumnas(){
        return this.vectores.get(0).getLongitud();
    }
    public Matriz(List<Vector> vectores){
        this.vectores = vectores;
    }
    public Matriz sumarMatriz(Matriz o){
        if(this.getColumnas() != o.getColumnas() || this.getFilas() != o.getFilas())
            return null;
        List<Vector> nuevosVectores = new ArrayList<>();
        for(int i=0;i<this.getFilas();i++){
            Vector vector1 =this.vectores.get(i);
            Vector vector2 = o.getVectores().get(i);
            Vector vectorSuma = vector1.sumaVectores(vector2);
            nuevosVectores.add(vectorSuma);
        }
        return new Matriz(nuevosVectores);
    }
    public Matriz multiplicarEscalar(Float a){
        List<Vector> nuevosVectores = new ArrayList<>();
        for(int i=0;i<this.getFilas();i++) {
            Vector vectorMultiplicacion = this.vectores.get(i).multiplicacionEscalar(a);
            nuevosVectores.add(vectorMultiplicacion);
        }
        return new Matriz(nuevosVectores);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matriz matriz = (Matriz) o;
        return Objects.equals(vectores, matriz.vectores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vectores);
    }

    @Override
    public String toString() {
        return vectores.toString();
    }
}
