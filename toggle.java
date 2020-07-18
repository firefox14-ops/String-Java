// Traverse the String, if string contains lowercase char, convert it to Uppercase and visa-versa

class toggle{

    public static String toggle(String str){

        String ans = " ";
        for(int i=0; i<str.length(); i++){
            char ch  = str.charAt(i);
            
            if(ch >= 'a' && ch<='z'){
                ch = (char)(ch - 'a' + 'A');
            }else{
                ch = (char)(ch - 'A' + 'a');
            }
            ans = ans + ch;
        } return ans;
    }

    public static void main(String[] args){
        String str = "aDecf";
        System.out.println(toggle(str));
    }
}