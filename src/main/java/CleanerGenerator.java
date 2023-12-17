public class CleanerGenerator extends EmployeeGenerator{
    @Override
    public Employee createEmployee(){
        return new Cleaner();
    }
}
