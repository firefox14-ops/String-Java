class compressAString{

    public static void compressAString(String str){
       int count = 1;
       
       for(int i=0; i<str.length()-1; i++){
           char ch1 = str.charAt(i);
           char ch2 = str.charAt(i+1);

           if(ch1 != ch2){
               System.out.print(ch1);
               if(count>1){
                   System.out.print(count);
               }
               count =1;
           }else{
               count++;
           }
       }
       System.out.print(str.charAt(str.length()-1));
       if(count>1){
           System.out.print(count);
       }
    }

    public static void main(String[] args){
        String str = "aaabbcaaddfff";

        compressAString(str);
        System.out.println();
    }
}