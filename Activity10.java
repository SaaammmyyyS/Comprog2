import java.util.Scanner;
public class Activity10 {
    public static void main(String[] args) {
        int max = 0, count = 0;
        
        while (true){
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            char maxChar;

            if (str.equals("quit")){
                input.close();
                System.exit(0);
            }
            int freq[] = new int[str.length()];
            char string[] = str.toCharArray();
            maxChar = str.charAt(0);  


            for(int i = 0; i < string.length; i++) {  
                freq[i] = 1;  
                for(int j = i+1; j < string.length; j++) {  
                    if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                        freq[i]++;  
                        string[j] = '0';  
                    }
                }
            }
    
            for(int i = 0; i <freq.length; i++) {  
                  
                if(max < freq[i]) {  
                    max = freq[i];  
                    maxChar = string[i];
                }
            }
    
            for (int i = 0; i < string.length; i++){
                if (string[i] == string[i]){
                    count++;
                } 
            }
    
            int totalCount = str.replace(String.valueOf(maxChar), "").length();
            count = str.length() - totalCount;
    
            System.out.println(maxChar + " = " + count);
        }
        

    }   
}
