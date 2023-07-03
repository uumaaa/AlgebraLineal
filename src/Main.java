import model.Vector;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creacion del primer vector
        List<Float> componentes1 = new ArrayList<>();
        componentes1.add(4.9f);
        componentes1.add(1.6f);
        componentes1.add(2.4f);
        componentes1.add(0.8f);
        Vector vector1 = new Vector(componentes1);
        //Creacion del segundo vector
        List<Float> componentes2 = new ArrayList<>();
        componentes2.add(0.9f);
        componentes2.add(2.2f);
        componentes2.add(8.1f);
        componentes2.add(4.7f);
        Vector vector2 = new Vector(componentes2);
        //Creacion del tercer vector
        List<Float> componentes3 = new ArrayList<>();
        componentes3.add(1f);
        componentes3.add(2f);
        componentes3.add(3f);
        componentes3.add(4f);
        Vector vector3 = new Vector(componentes3);
        // Propiedades
        System.out.println("Vectores");
        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);
        System.out.println("Vector 3: " + vector3);
        System.out.println("Propiedades");
        System.out.println("Conmutatividad de adición");
        Vector vectorS1 = vector1.sumaVectores(vector2);
        Vector vectorS2 = vector2.sumaVectores(vector1);
        System.out.println(vectorS1 + " = " + vectorS2);
        System.out.println("Asociatividad de adición");
        Vector vectorS3 = vectorS2.sumaVectores(vector3);
        Vector vectorSA = vector3.sumaVectores(vector2);
        Vector vectorS4 = vectorSA.sumaVectores(vector1);
        System.out.println(vectorS3 + " = " + vectorS4);
        System.out.println("Vector 0...");
        System.out.println("Inverso aditivo");
        Vector vectorI1 = vector1.inversoAditivo();
        System.out.println(vectorI1);
        Vector vector0 = vector1.sumaVectores(vectorI1);
        System.out.println(vector0);
        System.out.println("Neutro multiplicativo");
        System.out.println(vector1 + " = "  + vector1.multiplicacionEscalar(1f));
        System.out.println("Conmutatividad multiplicativa");
        Float a1 = 3f;
        Float a2 = 0.5f;
        Float mulA = a1*a2;
        Vector vectorAM1 = vector1.multiplicacionEscalar(a1);
        Vector vectorM1 = vectorAM1.multiplicacionEscalar(a2);
        Vector vectorM2 = vector1.multiplicacionEscalar(mulA);
        System.out.println(vectorM1 + " = " + vectorM2);
        System.out.println("Propiedad distributiva vectorial");
        Vector vectorD1 = vectorS2.multiplicacionEscalar(a1);
        Vector vectorDA1 = vector1.multiplicacionEscalar(a1);
        Vector vectorDA2 = vector2.multiplicacionEscalar(a1);
        Vector vectorD2 = vectorDA1.sumaVectores(vectorDA2);
        System.out.println(vectorD2 +" = " + vectorD1);
        System.out.println("Propiedad distributiva escalar");
        Float sumA = a1+a2;
        Vector vectorDE1 = vector1.multiplicacionEscalar(sumA);
        Vector vectorDEA1 = vector1.multiplicacionEscalar(a1);
        Vector vectorDEA2 = vector1.multiplicacionEscalar(a2);
        Vector vectorDE2 = vectorDEA1.sumaVectores(vectorDEA2);
        System.out.println(vectorDE2 + " = " + vectorDE1);
    }
}