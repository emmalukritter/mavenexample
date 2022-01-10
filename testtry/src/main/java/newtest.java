public class newtest {
    public boolean first(int i)
    {
        if(i==1)
        {
            return true;
        }
    else
        {
            return false;
        }
    }
    public int second()
    {
        if(this.first(0))
        {
            System.out.println("The following code need to execute");
            return 1;
        }
        else
        {
            System.out.println("Error code");
            return 0;
        }
    }

    public static void main(String[] args) {
      newtest n=new newtest();
      int i=n.second();
    }
}
