package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vector {
    private List<Float> componentes;
    public Vector(List<Float> componentes){
        this.componentes = componentes;
    }

    public List<Float> getComponentes() {
        return componentes;
    }
    public void setComponentes(List<Float> componentes) {
        this.componentes = componentes;
    }
    int getLongitud(){
        return this.componentes.size();
    }
    public Vector sumaVectores(Vector o){
        if (this.getLongitud() != o.getLongitud())
            return null;
        List<Float> componentesS = new ArrayList<>();
        for(int i=0;i<this.getLongitud();i++){
            componentesS.add(this.componentes.get(i)+o.getComponentes().get(i));
        }
        return new Vector(componentesS);
    }

    public Vector multiplicacionEscalar(Float a) {
        if (a == 0)
            return new Vector(new ArrayList<>());
        List<Float> componentesM = new ArrayList<>();
        for(int i=0;i<this.getLongitud();i++){
            componentesM.add(this.componentes.get(i)*a);
        }
        return new Vector(componentesM);
    }

    public Vector inversoAditivo(){
        List<Float> componentesIA = new ArrayList<>();
        for(int i=0;i<this.getLongitud();i++){
            componentesIA.add(-this.componentes.get(i));
        }
        return new Vector(componentesIA);
    }

    @Override
    public String toString() {
        return  componentes.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Objects.equals(componentes, vector.componentes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentes);
    }
}
