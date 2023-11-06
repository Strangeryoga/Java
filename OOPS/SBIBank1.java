class Atm{

private double money=1400; //states

//getter method -> to get private data
public double getMoney(){
return money;
}

//setter method -> to set/modify private data
public void setMoney(double money){
this.money=money;
}


public void withDraw(){
System.out.println("u withdraw the cash");
}


}

class SBIBank1{

public static void main(String [] args){
Atm a=new Atm();
System.out.println("Total amout: "+a.getMoney());
a.setMoney(2000);
System.out.println("After change the amount is "+a.getMoney());
System.out.println("u can now withdraw the cash.");
}


}