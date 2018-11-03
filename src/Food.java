public class Food extends ConstructorFood {
    String name1;
    int prise1;
    int quantity1;
    double weight1;

    String getname1() {String name1=this.name1; return name1;}

    int getprise1() {int prise1= this.prise1; return getprise1();}

    int getquantity1() {int quantity1 = this.quantity1;return getquantity1();}

     double getweight1() {double weight1 = this.weight1;return weight1;}
     Food(String newname1, int newprise1,int newquantity1,double newweight1){
       this.name1="Coola";
         this.quantity1 = 1;
         this.weight1=0.5;
     }
}

