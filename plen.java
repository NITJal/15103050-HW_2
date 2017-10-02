import java.util.*;

public class plen {
public static String swap(String str, int i, int j)
{
    
    char charr[] = str.toCharArray();
    char temp = charr[i];
    charr[i] = charr[j];
    charr[j] = temp;
    return String.copyValueOf(charr);
}

public static void func(String str, int l)
{
    int r = str.length();
    
    if(l == r)
    {
        System.out.println(str);
        return;
    }
    
    func(str, l + 1);

    for(int i = l + 1; i < r; i++) {
        if(str.charAt(l) == str.charAt(i)) continue;
        str = swap(str, l, i);
        func(str, l + 1);
    }
}

public static void print(String str)
{
    int l=str.length();
    char charr[]=str.toCharArray();
    int i,j,k;
    char a[];
    System.out.println("Words with length 1 are:\n");
    
    Set<Character> set=new LinkedHashSet<Character>();
    for(char c:str.toCharArray())
    {
        set.add(Character.valueOf(c));
    }
    Iterator iter = set.iterator();
      while (iter.hasNext()) {
        System.out.println(iter.next());
        }
    
    
    System.out.println("Words with length 2 are:\n");
        for(i=0;i<l-1;i++)
        {
            for(j=i+1;j<l;j++)
        {
            char x[]={charr[i],charr[j]};
            String m = new String(x);
            func(m,0);
        }
        }
    System.out.println("Words with length 3 are:\n");
        for(i=0;i<l-2;i++)
        {
            for(j=i+1;j<l-1;j++)
        {
            for(k=j+1;k<l;k++)
            {
            char y[]={charr[i],charr[j],charr[k]};
            String n = new String(y);
            func(n,0);
            }
        }
        }
    System.out.println("Words with length 4 are:\n");
        func(str,0);
}


public static void main(String [] args)
{
    String s = "AACE";
    print(s);
}
}
