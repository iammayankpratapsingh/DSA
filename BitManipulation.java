//Bit Manipulation Codes

public class CheckKthBitSet {
    public static int checkKthBitSet(int num, int bi) {
        int bitMask = 1 << bi-1;
        if ((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setKthBit(int num, int kth){
        int bitMask = 1 << kth-1;
        num = num | bitMask;
        return num;
    }
    public static int clearKthBit(int num, int bit){
        int bitMask = ~(1 << bit-1);
        num = num & bitMask;
        return num;
    }

    public static int toggleKthBit(int num,int bit){
        int bitMask = 1 << bit-1;
        num = num ^ bitMask;
        return num;
    }
    public static int toggleRightMostBit(int num){
        int num1 = num - 1;
        int num2 = num1 & num;
        return num2;
    }
    public static int isolateRightMostBit(int num){
        int num2 = num & -num;
        return num2;
    }

    public static int isolateRightMostZeroBit(int num){
        int num2 = ~num;
        int num3 = num2 & (num+1);
        return num3;
    }

    public static int isPowerOf2(int num){
        int num2 = num - 1;
        int num3 = num2 & num;
        if(num3 == 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int multiByPowerOf2(int num, int k){
        int num2 = num << k;
        return num2;
    }

    public static int divByPowerOf2(int num, int k){
        int num2 = num >> k;
        return num2;
    }

    // Driven Code
    public static void main(String[] args) {
        System.out.println(multiByPowerOf2(5, 2));
    }
}
