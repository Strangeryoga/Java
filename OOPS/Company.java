class Employee{

int id;
String name;
private double money;

public double getMoney(){
return money;
}

public void setMoney(double money){
this.money=money;
}

Employee(int id, String name, double money){
this.id=id;
this.name=name;
this.money=money;
}

}






class Company{
public static void main(String[] args){
Employee e=new Employee(10,"sheela",43999);
System.out.println("id is "+e.id);
System.out.println("name is "+e.name);
System.out.println("sal is "+e.getMoney());
e.setMoney(1403280);
System.out.println("after hike "+e.getMoney());


}




}