package test.entity;

public class Office {
    private String id;
    private String name;
    private String deptId;
    private Department department;

    public Office() {
    }

    public Office(String id, String deptId, Department department) {
        this.id = id;
        this.deptId = deptId;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
