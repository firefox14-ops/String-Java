class anagram1{

    public static void main(String[] args){

        String a = "aab";
        String b = "aba";

        boolean isAnagram = true;

        int[] al = new int[256];

        for(char ch : a.toCharArray()){
            int idx = (int)ch;
            al[idx]++;
        }

        for(int i=0; i<b.length(); i++){
            int idx = (int)b.charAt(i);
            al[idx]--;
        }

        for(int i=0; i<256; i++){
            if(al[i] != 0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}