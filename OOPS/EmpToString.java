class Emp{
int id;
String name;

public Emp(int id, String name){
super();
this.id=id;
this.name=name;
}

@Override
public String toString(){
System.out.println("Id is "+id);
System.out.println("Name is "+name);
return "";
}
}

class EmpToString{
public static void main(String [] args){
Emp ref=new Emp(10,"sheela");
System.out.println(ref);
System.out.println("=============================");
Emp ref1=new Emp(11,"munne");
System.out.println(ref1.toString());
}
}