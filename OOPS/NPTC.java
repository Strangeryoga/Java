class Fruit{

int i=23;
}

class Mango extends Fruit{

int j=50;
}

class NPTC{

public static void main(String [] args){
Fruit f=new Mango();  //Upcasting
System.out.println(f.i);
//System.out.println(f.j);

Mango m=(Mango) f;  //Downcasting
System.out.println(m.j);

}
}

//When do we get classCastException
//Ans. When we perform downcasting without upcasting

/* Why do we need Upcasting?
To achieve Generalization
To avoid code Redundance
Note.
If we create reference var. for generalized class we can store address of any sub class(Specialized class)  */






