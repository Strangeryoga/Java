/*
Constructor Overloading
Class more than one constructor which has same name but different FA either differ in length or datatype.
*/


class CO{

CO(){
System.out.println("No-args constructor");
}
CO(int a){
System.out.println("1-FA constructor");
}
CO(int a, int b){
System.out.println("2-FA constructor");
}
CO(int a, int b, int c){
System.out.println("3-FA constructor");
}


public static void main(String [] args){
CO ref=new CO();
CO ref1=new CO(10);
CO ref2=new CO(10,20);
CO re3=new CO(10,20,30);

}



}