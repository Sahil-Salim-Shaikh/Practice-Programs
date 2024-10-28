class Pattern9
{
    public static void main(String args[])
    {
        int n = 5;
        int count = 1;

        for (int i = n; i >= 1; i--)
        {     
            int c = count; // Initialize c with the current count value

            for (int j = i; j <= n; j++)
            {
                System.out.print(c + "\t");
                c = c - (n - j + 1); // Correctly decrement c
            }
            System.out.println();
            count += i; // Update count for the next row
        }
    }
}
