public class Chiken extends ConstructorFood {
    String name;
    int prise;
    int quantity;
    double weight;

    String getName() {String name=this.name; return name;}

    int getprise() {int prise= this.prise; return getprise();}

    int getquantity() {int quantity = this.quantity;return getquantity();}

    double getweight() {double weight = this.weight;return weight;}
    Chiken(String newname, int newprise,int newquantity,double newweight){
this.name="Chiken";
this.prise=120;
}
}
