public class ChiefGenerator extends EmployeeGenerator{
    @Override
    public Employee createEmployee(){
        return new Chief();
    }
}
