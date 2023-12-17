public class WorkerGenerator extends EmployeeGenerator{
    @Override
    public Employee createEmployee(){
        return new Worker();
    }
}
