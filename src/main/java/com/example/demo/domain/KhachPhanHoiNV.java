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
public class KhachPhanHoiNV {
	private String maKhach;
	private String maNv;
	private Date ngayPhanHoi;
	private String noiDung;
}
