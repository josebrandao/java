//Basic Hello World, try catch and division by 0 test
public class Ola{
    public static void main(String[] args){
        System.out.println("Bem Vindo ao Mundo Java!");
int a = 5;

System.out.println(a+5);
	try{
System.out.println(a/0);
} catch(Exception e){
	System.out.println("Something went wrong. " + e);
}
}
}

