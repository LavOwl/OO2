package ar.edu.info.unlp.ejercicioDemo;

public abstract class FamilialBenefits extends Empleado{
    private boolean isMarried;
    private int children;
    private double payPerChild = 2000;
    private double payIfMarried = 5000;

    public FamilialBenefits(boolean isMarried, int children){
        this.isMarried = isMarried;
        this.children = children;
    }

    protected double getFamilialBenefits(){
        return this.children*this.payPerChild + ((this.isMarried) ? this.payIfMarried : 0);
    }

    public void setChildren(int children){
        this.children = children;
    }

    public void setMarried(boolean isMarried){
        this.isMarried = isMarried;
    }
}
