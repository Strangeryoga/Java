
class P1 extends Object{

@Override
public String toString(){
return "mam ur so cute";
}

}


class ToString{
public static void main(String [] args){

P1 t=new P1();
System.out.println(t);
System.out.println(t.toString());

}


}

//when we did not override the toString method then the output     
//will be address P1@3fee733d  P1@3fee733d

/*when we override the toString method then the output will be
mam ur so cute with or without writing ref or ref.toString(); */