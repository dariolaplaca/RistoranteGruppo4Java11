package enumProject;
/**
 * that enum custom:
 * font color anche background
 * font text
 */
public enum TextModifierEnum {
    ANSI_RESET("reset white color and background default", "\u001B[0m"),
    ANSI_ITALIC("font italic","\u001B[3m"),
    ANSI_BRIGHT_RED("font-color high intensity red","\u001B[91m"),
    ANSI_BRIGHT_YELLOW("font-color high intensity yellow","\u001B[93m"),
    ANSI_DESCRIPTION_COLOR_AND_BACKGROUND("font-color beige and background-color dark purple","\033[38;2;248;244;227;48;2;29;10;28m"),
    ANSI_RED("font-color red","\u001B[31m"),
    ANSI_YELLOW ("font-color yellow","\u001B[33m"),
    ANSI_GREEN("font-color green","\u001B[32m"),
    ANSI_UNDERLINE("font with underline","\u001B[4m"),
    ANSI_BOLD("font bold","\u001B[1m");

    public final String string;
    public final String description;

    TextModifierEnum(String description,String string){this.description = description; this.string = string;}

    @Override
    public String toString() {return string;}
}
