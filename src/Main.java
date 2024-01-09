import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        System.out.println("Is 'test' unique: " + isUnique("test"));
        System.out.println("is 'steak' unique: "+ isUnique("steak"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    public static boolean isUnique(String inputString)
    {
        HashSet testString = new HashSet();
        for(int i = 0; i < inputString.length(); i++)
        {
            if (!(testString.add(inputString.charAt(i))))
                return false;
        }
        return true;
    }
}