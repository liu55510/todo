package test.entity;

public class DepartmentEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depterment.dept_id
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    private String dept_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depterment.dept_name
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depterment.dept_addr
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    private String dept_addr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depterment.dept_type
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    private String dept_type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depterment.dept_id
     *
     * @return the value of depterment.dept_id
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public String getDept_id() {
        return dept_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depterment.dept_id
     *
     * @param dept_id the value for depterment.dept_id
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public void setDept_id(String dept_id) {
        this.dept_id = dept_id == null ? null : dept_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depterment.dept_name
     *
     * @return the value of depterment.dept_name
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depterment.dept_name
     *
     * @param name the value for depterment.dept_name
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depterment.dept_addr
     *
     * @return the value of depterment.dept_addr
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public String getDept_addr() {
        return dept_addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depterment.dept_addr
     *
     * @param dept_addr the value for depterment.dept_addr
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public void setDept_addr(String dept_addr) {
        this.dept_addr = dept_addr == null ? null : dept_addr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depterment.dept_type
     *
     * @return the value of depterment.dept_type
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public String getDept_type() {
        return dept_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depterment.dept_type
     *
     * @param dept_type the value for depterment.dept_type
     *
     * @mbg.generated Wed Mar 20 10:05:57 CST 2019
     */
    public void setDept_type(String dept_type) {
        this.dept_type = dept_type == null ? null : dept_type.trim();
    }
}