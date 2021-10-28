package L10.exp;

public class Operation implements Executable{
    private char operation;
    private Executable a;
    private Executable b;

    public Operation(char operation, Executable a, Executable b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    @Override
    public double execute() {
        System.out.println("Enter " + operation);
        double leftArg = a.execute();
        double rightArg = b.execute();
        System.out.println("Exit " + operation);
        if (operation == '+') return leftArg+rightArg;
        if (operation == '-') return leftArg-rightArg;
        if (operation == '*') return leftArg*rightArg;
        if (operation == '/') return leftArg/rightArg;
        throw new IllegalArgumentException("Unknow command");
    }

}
