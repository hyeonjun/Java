package ch06;

public class GenericPrinter<T extends Material>{ // T 자료형에 Material 자료형만 가능하다고 제한을 걸었음
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }

}
