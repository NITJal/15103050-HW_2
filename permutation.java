public class permutation {
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

public static void main(String [] args)
{
    String s = "AAE";
    func(s, 0);
}
}
