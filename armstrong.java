
public class armstrong {
    public static void main(String[] args) {
    for(int i=1;i<500;i++)
    {
        int temp=i;
        int arm=0;
        while(temp!=0)
        {int rem=temp%10;
        arm+=rem*rem*rem;
        temp/=10;
    }
    if(arm==i)
    System.out.println(arm);
    }    
    }
}
