package Constraint;

public class CountConstraint extends Constraint{
    private static int lowLimit;
    private static int highLimit;

    @Override
    public String checkingConstraint() {
        return "Это ограничение по количеству";
    }
}
