// reverse string word by word and remove trailing spaces, if any;

class reverseString{

    public static String reverseString(String s){
        int i= s.length()-1;
        String ans = "";
        while(i>=0){

            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }

            int j=i;

            if(i<0){
                break;
            }

            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }

            if(ans.isEmpty()){
                ans += s.substring(i+1, j+1);
            }else{
                ans += " " + s.substring(i+1, j+1);
            }

        }

        return ans;
    }

    public static void main(String[] args){
        String s = "  Java is easy programming language";
        System.out.println(reverseString(s));
    }
}
