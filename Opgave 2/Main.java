class main{

public static void main(String[]args){

System.out.println(printPartofWord("København",2,4));
}

public static String printPartofWord(String ord, int D1Start, int D2Slut ){

ord.substring(D1Start,D2Slut); 

return ord;
}
}