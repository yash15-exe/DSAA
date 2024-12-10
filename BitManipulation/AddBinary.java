package BitManipulation;

public class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while(i!=0&&j!=0){
            int ans = Integer.parseInt(String.valueOf(a.charAt(i)))^Integer.parseInt(String.valueOf(b.charAt(j)))^carry;

        }
    }
}
