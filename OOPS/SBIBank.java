class Atm{

private double money=10000; //states

//permission -> getter method -> to get private data
public double getMoney(){
return money;
}

public void withDraw(){  //behaviours
System.out.println("u withdraw the cash");
}

}

class SBIBank{

public static void main(String [] args){
Atm m=new Atm();
System.out.println("Total amount: "+m.getMoney());
m.withDraw();
}



}