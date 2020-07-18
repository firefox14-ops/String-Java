class diffOfASCII{

    public static String diffOfASCII(String str){
        String ans = "";
        for(int i=0; i<str.length()-1; i++){
            ans += str.charAt(i);
            ans += str.charAt(i+1) - str.charAt(i);
        }
        ans += str.charAt(str.length()-1);
        return ans;
    }

    public static void main(String[] args){
        String str = "abacd";
        System.out.println(diffOfASCII(str));
    }
}