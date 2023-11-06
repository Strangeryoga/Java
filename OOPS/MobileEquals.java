class Mobile{
String name;
String brand;
double price;

Mobile(String name,String brand,double price){
super();
this.name=name;
this.brand=brand;
this.price=price;
}

@Override
public boolean equals(Object obj){
Mobile m=(Mobile) obj ; //downcasting
return this.name==m.name && this.brand==m.brand && this.price ==m.price;
}
}


class MobileEquals{
public static void main(String [] args){
Mobile m=new Mobile("Redmi","Galaxy",4000);
System.out.println(m);
Mobile m1=new Mobile("Redmi","Galaxy",4000);
System.out.println(m1);
System.out.println(m==m1);
System.out.println(m.equals(m1));
}
}