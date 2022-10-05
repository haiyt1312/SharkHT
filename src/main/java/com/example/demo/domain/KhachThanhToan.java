/**
 * 
 */
package com.example.demo.domain;

import java.sql.Timestamp;

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
public class KhachThanhToan {
	private String soPhieuThanhToan;
	private String maKhach;
	private String maNv;
	private String hinhThucThanhToan;
	private Timestamp ngayGioThanhToan;
	private int soTien;
	private String soPhieuGoi;
}
