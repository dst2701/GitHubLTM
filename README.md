# Bài tập UDP Java

25 bài từ `UDP_FULL_v2.docx` và `UDP_OBJECT_FULL_v2.docx`. Mỗi file bài tập có đề bài, qCode và lưu ý của tác giả trong comment, tiếp theo là code mẫu giữ nguyên từ tài liệu. Các lớp dữ liệu OBJECT nằm trong thư mục `UDP/`.

## Cách dùng

Tên file `UDP_[tenbai].java` phục vụ tra cứu. Code gốc vẫn khai báo `public class Main`, `Main01`… nên khi biên dịch, hãy chép bài cần chạy sang một thư mục riêng và lưu với tên file tương ứng trong bảng dưới. Mỗi lần chạy chỉ dùng một bài.

Với bài OBJECT, chép thêm lớp dữ liệu tương ứng vào thư mục `UDP/` cạnh file `Main0X.java`, giữ nguyên `package UDP;`. Ví dụ bài C1:

```text
thu_muc_chay/
  Main01.java
  UDP/
    Student.java
```

```powershell
javac -encoding UTF-8 Main01.java UDP/Student.java
java Main01
```

Code giữ nguyên cả mã sinh viên `B23DCCN926`, IP, cổng, qCode và các chỗ chưa nhất quán trong tài liệu. Khi dùng thực tế, tự thay thông tin theo đề của bạn. B10 và B11 vẫn dùng qCode chờ cập nhật như bản gốc.

## Mục lục

### DATA — cổng 2207

| Bài | Nội dung và qCode gốc | File tra cứu | Tên file khi chạy |
| --- | --- | --- | --- |
| A1 | TỔNG HAI SỐ NGUYÊN LỚN  [qCode: 2sIjAYaU] | [UDP_Tong_Hieu_Hai_So_Nguyen_Lon.java](UDP_Tong_Hieu_Hai_So_Nguyen_Lon.java) | `Main.java` |
| A2 | PHẦN TỬ LỚN NHẤT CỦA DÃY CON  [qCode: iv00Hrq6 / mhH9GbNw] | [UDP_Max_Cua_So_Truot.java](UDP_Max_Cua_So_Truot.java) | `Main.java` |
| A3 | SẮP XẾP THEO VỊ TRÍ BAN ĐẦU  [qCode: aKZwZxWk] | [UDP_Sap_Xep_Chuoi_Theo_Vi_Tri_Ban_Dau.java](UDP_Sap_Xep_Chuoi_Theo_Vi_Tri_Ban_Dau.java) | `Main.java` |
| A4 | GIÁ TRỊ NHỎ NHẤT – GIÁ TRỊ LỚN NHẤT  [qCode: uWKK8u3W / l2wVNbKC] | [UDP_Tim_Max_Min.java](UDP_Tim_Max_Min.java) | `Main.java` |
| A5 | NHỎ THỨ HAI VÀ LỚN THỨ HAI  [qCode: oQifsr90] | [UDP_Tim_So_Lon_Thu_Hai_Nho_Thu_Hai.java](UDP_Tim_So_Lon_Thu_Hai_Nho_Thu_Hai.java) | `Main.java` |
| A6 | TÌM SỐ CÒN THIẾU  [qCode: wAKCZwjj] | [UDP_Tim_So_Con_Thieu.java](UDP_Tim_So_Con_Thieu.java) | `Main.java` |
| A7 | MÃ HOÁ CAESAR  [qCode: J5SE2YXc] | [UDP_Ma_Hoa_Caesar.java](UDP_Ma_Hoa_Caesar.java) | `Main.java` |
| A8 | TỔNG CÁC CHỮ SỐ  [qCode: 0Iend7Pp] | [UDP_Tong_Cac_Chu_So.java](UDP_Tong_Cac_Chu_So.java) | `Main.java` |
| A9 | LIỆT KÊ SỐ NGUYÊN TỐ  [qCode: 78CCQ6xD] | [UDP_Liet_Ke_N_So_Nguyen_To_Dau_Tien.java](UDP_Liet_Ke_N_So_Nguyen_To_Dau_Tien.java) | `Main.java` |

### STRING — cổng 2208

| Bài | Nội dung và qCode gốc | File tra cứu | Tên file khi chạy |
| --- | --- | --- | --- |
| B1 | SẮP XẾP THEO TỪ ĐIỂN NGƯỢC  [qCode: 9UfU4Vky] | [UDP_Sap_Xep_Tu_Dien_Nguoc.java](UDP_Sap_Xep_Tu_Dien_Nguoc.java) | `Main.java` |
| B2 | TỔNG HAI SỐ NHỊ PHÂN  [qCode: lIQVug9S] | [UDP_Tong_Hai_So_Nhi_Phan.java](UDP_Tong_Hai_So_Nhi_Phan.java) | `Main.java` |
| B3 | ĐẾM SỐ LẦN XUẤT HIỆN  [qCode: vSgxl3HQ / 1CSILxVz] | [UDP_Dem_So_Lan_Xuat_Hien_Ky_Tu.java](UDP_Dem_So_Lan_Xuat_Hien_Ky_Tu.java) | `Main.java` |
| B4 | LỌC KÝ TỰ  [qCode: GfeNSBMT] | [UDP_Loc_Ky_Tu.java](UDP_Loc_Ky_Tu.java) | `Main.java` |
| B5 | HIỆU CỦA HAI TẬP KÝ TỰ  [qCode: JQCO3izC] | [UDP_Hieu_Hai_Tap_Ky_Tu.java](UDP_Hieu_Hai_Tap_Ky_Tu.java) | `Main.java` |
| B6 | KÝ TỰ XUẤT HIỆN NHIỀU LẦN NHẤT  [qCode: KAmLHOdi]  ✅ AC thật | [UDP_Ky_Tu_Xuat_Hien_Nhieu_Nhat.java](UDP_Ky_Tu_Xuat_Hien_Nhieu_Nhat.java) | `Main.java` |
| B7 | CHUẨN HOÁ XÂU KÝ TỰ  [qCode: i28U6aGi / tmczgSLy / NRVwBVvx]  ✅ AC thật | [UDP_Chuan_Hoa_Xau_Ky_Tu.java](UDP_Chuan_Hoa_Xau_Ky_Tu.java) | `Main.java` |
| B8 | CHUẨN HOÁ CHUỖI THÀNH SLUG (HAI PHA)  [qCode: V46plLn9] | [UDP_Chuan_Hoa_Chuoi_Thanh_Slug.java](UDP_Chuan_Hoa_Chuoi_Thanh_Slug.java) | `Main.java` |
| B9 | CHE EMAIL, SỐ ĐIỆN THOẠI, TOKEN TRONG LOG (HAI PHA)  [qCode: zFtVSq8y] | [UDP_Che_Email_So_Dien_Thoai_Token_Trong_Log.java](UDP_Che_Email_So_Dien_Thoai_Token_Trong_Log.java) | `Main.java` |
| B10 | LỌC KÝ TỰ + LOẠI TRÙNG (BÀI MỚI TỪ HỆ THỐNG)  [qCode: cập nhật sau] | [UDP_Loc_Ky_Tu_Loai_Trung_Bai_Moi.java](UDP_Loc_Ky_Tu_Loai_Trung_Bai_Moi.java) | `Main.java` |
| B11 | MASK LOG + ĐẾM ERROR/INFO/WARN (BÀI MỚI TỪ HỆ THỐNG)  [qCode: cập nhật sau] | [UDP_Che_Log_Dem_ERROR_INFO_WARN.java](UDP_Che_Log_Dem_ERROR_INFO_WARN.java) | `Main.java` |

### OBJECT — cổng 2209

| Bài | Nội dung và qCode gốc | File tra cứu | Tên file khi chạy |
| --- | --- | --- | --- |
| C1 | QUẢN LÝ SINH VIÊN  [qCode: 8VdcIxPQ] | [UDP_Chuan_Hoa_Sinh_Vien_Tao_Email.java](UDP_Chuan_Hoa_Sinh_Vien_Tao_Email.java) | `Main01.java` |
| C2 | KHÁCH HÀNG  [qCode: 8nxPat2M] | [UDP_Chuan_Hoa_Khach_Hang.java](UDP_Chuan_Hoa_Khach_Hang.java) | `Main02.java` |
| C3 | SẢN PHẨM  [qCode: kZqFKEDL] | [UDP_Sua_Ten_San_Pham_Dao_So_Luong.java](UDP_Sua_Ten_San_Pham_Dao_So_Luong.java) | `Main03.java` |
| C4 | CHUẨN HOÁ THÔNG TIN SÁCH  [qCode: LFACr5Bi] | [UDP_Chuan_Hoa_Thong_Tin_Sach.java](UDP_Chuan_Hoa_Thong_Tin_Sach.java) | `Main04.java` |
| C5 | QUẢN LÝ THÔNG TIN NHÂN VIÊN  [qCode: ySsumsIE] | [UDP_Chuan_Hoa_Nhan_Vien_Tang_Luong.java](UDP_Chuan_Hoa_Nhan_Vien_Tang_Luong.java) | `Main05.java` |

## Lớp dữ liệu OBJECT

| Bài | Lớp đi kèm |
| --- | --- |
| C1 | [Student.java](UDP/Student.java) |
| C2 | [Customer.java](UDP/Customer.java) |
| C3 | [Product.java](UDP/Product.java) |
| C4 | [Book.java](UDP/Book.java) |
| C5 | [Employee.java](UDP/Employee.java) |

## Kiểm tra nội dung

Đã đối chiếu nguyên văn 30 khối code (25 chương trình và 5 lớp dữ liệu) với phần văn bản trong hai file DOCX, bao gồm khoảng trắng và dòng trống. Chỉ thêm comment bên ngoài code gốc. Chưa chạy với server hoặc xác nhận kết quả chấm.
