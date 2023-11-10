package Projects.Library.app;

public enum Option {
    EXIT(0, "exit"),
    ADD_BOOK(1, "add new book"),
    ADD_MAGAZINE(2, "add new magazine"),
    PRINT_BOOKS(3,"display available books"),
    PRINT_MAGAZINES(4, "display available magazines");

    private final int value;
    private final String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createFromInt (int option) {
        return Option.values()[option];
    }
}
