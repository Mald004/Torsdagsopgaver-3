import java.util.Random;
class main{
static int[]arr = {1,1,1,2,2,3,3,3,4,5,5,5,6,6,7,8,8,9,9,10};


public static void main(String[]args){
//Divide(5);
//System.out.println(getRandom(arr));
System.out.println(Number(10));
}

public static void Divide(int a){


for(int i = 0; i <= 100; i = i+a){

	
 System.out.println(i);
}
}


public static int getRandom(int[]array){

return array[new Random().nextInt(array.length)];



}

public static int Number(int num){
boolean Reach;

if(num>0){
 Reach = true;
}

if(Reach = true){
num = num - 1;

}
return num;

}

}

