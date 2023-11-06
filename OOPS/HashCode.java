/*
hashCode
hashCode method is a non static method declared in object class.
hashCode method returns unique integer no. for every object.
*/


class Mango{
@Override
public int hashCode(){
return 10;
}
}



class HashCode{
public static void main(String [] args){
Mango ref=new Mango();
System.out.println(ref); //Mango@a
System.out.println(ref.hashCode());  //10
}
}