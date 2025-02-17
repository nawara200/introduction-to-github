public class Cercle implements graphic{
    private int rayon;
    private int color;
}
public Cercle(rayon){
    this.rayon=rayon;
}
public void drow(){
    System.out.println("traçage graphique du cercle du rayon"+rayon);
}
public void colorer(int color){
    System.out.println("changement avec succes du couleur"+rayon + "vers la couleur" + color);
    this.color= color;
}
