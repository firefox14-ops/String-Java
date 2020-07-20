
class toggle{

    public static String toggle(String str){
        StringBuilder sb  = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch>='a' && ch<='z'){
                ch = (char) (ch-'a' +'A');
            }else{
                ch = (char) (ch-'A' +'a');
            }
            sb.setCharAt(i, ch);
        } return sb.toString();
    }

    public static void main(String[] args){
        String str = "aDeCf";
        System.out.println(toggle(str));
    }
}