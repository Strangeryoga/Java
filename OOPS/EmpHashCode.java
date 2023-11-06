class Emp{
int id;
String name;

Emp(int id,String name){
super();
this.id=id;
this.name=name;
}

@Override
public int hashCode(){
return id;
}

}

class EmpHashCode{
public static void main(String [] args){
Emp ref=new Emp(10,"sheela");
System.out.println(ref);  //Emp@a
System.out.println("=======================");
Emp ref1=new Emp(11,"yoga");
System.out.println(ref1);  //Emp@b

//check if it is equal to one another but what it is comparing //it object address not the data
System.out.println(ref==ref1);
System.out.println(ref.equals(ref1)); //false
}
}