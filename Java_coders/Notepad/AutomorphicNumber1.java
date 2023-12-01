//Automorphic Number in java

/*A number is called an automorphic number if and only if the square of the given number ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.*/

public class AutomorphicNumber1{

static boolean isAutomorphic(int num){

//determines the square of the specified number
int sq=num*num;

//comparing the digits util the no. becomes 0
while(num>0){

//find teh remainder (last Digit) of the var num and sq
if(num%10!=sq%10){return false;}

//reduce num and sq by dividing them by 10
num=num/10;
sq=sq/10;

}
return true;

}

//Driver code
public static void main(String args[]){

//no to be check 
//calling the method and prints the result accordingly
System.out.println(isAutomorphic(5)?"Automorphic":"Not Automorphic");


}


}

