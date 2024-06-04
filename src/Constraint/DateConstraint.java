package Constraint;

import java.time.LocalDate;

public class DateConstraint extends Constraint{
    private static LocalDate startDate;
    private static LocalDate endDate;

    /*
    * return true limit dates is not exceeded
    * else false
     */
    @Override
    public String checkingConstraint() {
        return "Это ограничение по дате";
    }
}
