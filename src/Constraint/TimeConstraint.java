package Constraint;

public class TimeConstraint extends Constraint{
    private static int hours;
    private static int  minutes;

    @Override
    public String checkingConstraint() {
        return "Это ограничение по времени";
    }
}
