public class Reverse {
   static int[] num={3,4,5,8,9,11};
    public static void reverse()
    {

        int i=0,j=num.length-1;

while(i<j)
{
    int t =num[i];
    num[i]=num[j];
    num[j]=t;
    i++;
    j--;
    }
    }
    public static void main(String[] args)
    {
        for(int i=0;i<num.length;i++) {
            System.out.println(num[i] + " ");
        }
        reverse();
        System.out.println();
        for(int i=0;i< num.length;i++) {
            System.out.println(num[i] + " ");
        }
    }
}
