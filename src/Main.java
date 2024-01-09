import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!\n");
        System.out.println("Is 'test' unique: " + isUnique("test"));
        System.out.println("is 'steak' unique: "+ isUnique("steak"));
    }
    public static boolean isUnique(String inputString)
    {
        HashSet testString = new HashSet(); //Maybe not hashSet?
        for(int i = 0; i < inputString.length(); i++)
        {
            //still need to check format before add.
            if (!(testString.add(inputString.charAt(i))))
                return false;
        }
        return true;
    }
}