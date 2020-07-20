class diffOfASCII{

    public static String diffOfASCII(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            int ch  = ch2-ch1;
            sb.append(ch1);
            sb.append(ch);
        }

        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }

    public static void main(String[] args){
        String str = "adecf";
        System.out.println(diffOfASCII(str));
    }
}