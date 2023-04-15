package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    private static boolean hasUpCase(String password) {
        boolean rsl = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    private static boolean hasLowCase(String password) {
        boolean rsl = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isLowerCase(symbol)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    private static boolean hasDigit(String password) {
        boolean rsl = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    private static boolean hasSpecial(String password) {
        boolean rsl = false;
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    private static boolean isSubstring(String password) {
        boolean rsl = false;
        for (String substring : FORBIDDEN) {
            if (password.toLowerCase().contains(substring)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!hasUpCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLowCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecial(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (isSubstring(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: "
                    + "qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
