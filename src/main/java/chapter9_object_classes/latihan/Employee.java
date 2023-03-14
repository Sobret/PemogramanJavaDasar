package chapter9_object_classes.latihan;

public class Employee {
    public static int length;
    private Long id;
    private String name;
    private String address;
    private int age;
    private double basicsalary;
    private double presentegsalary;
    private double totalsalary;


    public Employee() {
    }

    public Employee(Long id, String name, String address, int age, double basicsalary, double presentegbonussalary, double totalsalary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.basicsalary = basicsalary;
        this.presentegsalary = presentegbonussalary;
        this.totalsalary = totalsalary;


    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getBesicSalary() {
        return basicsalary;
    }
    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }
    public double getPresentegbonussalary() {
        return presentegsalary;
    }
    public void setPresentegbonudsalary(double presentegbonussalary) {
        this.presentegsalary = presentegbonussalary;
    }
    public double getTotalsalary() {
        return totalsalary;
    }
    public void setTotalsalary(double totalsalary) {
        this.totalsalary = totalsalary;
    }
}
