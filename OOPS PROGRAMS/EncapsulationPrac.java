class user{
    private String username;
    private int phoneno;
    private String password;

    public void setname(String name)
    {
        username=name;
    }
    public void setPhoneno(int no)
    {
        phoneno=no;
    }
    public void setPassword(String s)
    {
        password=s;
    }

    public String getName()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }
    public int getphoneNo()
    {
        return phoneno;
    }

}




public class EncapsulationPrac {
    public static void main(String[] args) {
        user u=new user();
        u.setname("sahil");
        u.setPhoneno(123);
        u.setPassword("sah133");

        
        System.out.println(u.getName());
        System.out.println(u.getPassword());
        
        System.out.println(u.getName());
        System.out.println(u.getphoneNo());
    }
}
