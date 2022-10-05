/**
 * 
 */
package com.example.demo.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haiyt
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
	private String maNv;
	private String maBoPhan;
	private String hoTen;
	private String soDienThoai;
	private Date ngaySinh;
	private String gioiTinh;
	private String diaChi;
}
