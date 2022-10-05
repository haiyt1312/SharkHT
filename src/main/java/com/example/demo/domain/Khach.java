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
public class Khach {
	private String maKhach;
	private String hoTen;
	private String diaChi;
	private String soDienThoai;
}
