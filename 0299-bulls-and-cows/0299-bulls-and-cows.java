class Solution {
    public String getHint(String secret, String guess) {
        int s[]=new int[10];
        int g[]=new int[10];
        int cow=0;
        int bull=0;
        for(int i=0;i<secret.length();i++){
            s[secret.charAt(i)-48]++;
            g[guess.charAt(i)-'0']++;
            if(secret.charAt(i)==guess.charAt(i)) bull++;
        }
        for(int i=0;i<10;i++){
            cow=cow+Math.min(s[i],g[i]);
        }
        int actualcow=cow-bull;
        return bull+"A"+actualcow+"B";
    }
}