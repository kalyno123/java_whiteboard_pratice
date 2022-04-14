package additional_tasks;

public class _03_Validate_A_String_As_A_Password {

    /* TASK-1 : validatePassword() method
    Write a method that takes a “String password” as an argument and checks if the given password is valid or not
    This method will return true if given password is valid, or false if given password is not valid
    A VALID PASSWORD:
    -should have length of 8 to 16 (length of 7 or 17 should return false)
    -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
	-should NOT have any space
    */

    public static boolean validatePassword(String str){
        if (str.contains(" ") || str.length() < 8 || str.length() > 16) return false;

        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;
        for (char c : str.toCharArray()){
            if (Character.isUpperCase(c)) uppercase = true;
            else if (Character.isLowerCase(c)) lowercase = true;
            else if (Character.isDigit(c)) digit = true;
            else special = true;
        }
        return uppercase && lowercase && digit && special;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(validatePassword("")); // false
        System.out.println(validatePassword("abc")); // false
        System.out.println(validatePassword("Abcd1234")); // false
        System.out.println(validatePassword("Abc12$")); // false
        System.out.println(validatePassword("Abc d512$")); // false
        System.out.println(validatePassword("Abcd512$abcdefdabc")); // false
        System.out.println(validatePassword("Abcd123!")); // true




    }
}
