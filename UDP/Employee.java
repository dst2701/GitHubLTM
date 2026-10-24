// Nguồn: UDP_OBJECT_FULL_v2.docx
// BÀI C5. QUẢN LÝ THÔNG TIN NHÂN VIÊN  [qCode: ySsumsIE]
// File 1: Employee.java (package UDP)

package UDP;
import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 20261107L;
    public String id, name, hireDate;
    public double salary;
}
