/**
 * 
 */
package com.example.demo.domain;

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
public class DongPhieuNhap {
	private String soPhieuNhap;
	private String maThucPhan;
	private int donGiaNhap;
	private int soLuong;
	private String noiNhap;
}
