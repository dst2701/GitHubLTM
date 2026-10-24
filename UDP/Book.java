// Nguồn: UDP_OBJECT_FULL_v2.docx
// BÀI C4. CHUẨN HOÁ THÔNG TIN SÁCH  [qCode: LFACr5Bi]
// File 1: Book.java (package UDP)

package UDP;
import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 20251107L;
    public String id, title, author, isbn, publishDate;
}
