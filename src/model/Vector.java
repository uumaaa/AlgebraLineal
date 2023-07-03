package model;

import java.util.ArrayList;
import java.util.List;

public class Vector {
    private List<Float> componentes;
    public Vector(List<Float> componentes){
        this.componentes = new ArrayList<>();
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
        return "" + componentes + "";
    }
}
