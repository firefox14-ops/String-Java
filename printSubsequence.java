class printSubsequence{

    public static void main(String[] args){
        String str = "abc";

        for(int i=0; i<(1<<str.length()); i++){
            for(int j=str.length()-1; j>=0; j--){
                int mask = 1<<j;
                if((i&mask) != 0){
                    System.out.print(str.charAt(str.length()-1-j));
                }else{
                    System.out.print("_ ");
                }
            }System.out.println();
        }
    }
}