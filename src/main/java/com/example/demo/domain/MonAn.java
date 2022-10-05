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
public class MonAn {
	private String maMon;
	private String maLoai;
	private String tenMon;
	private String donViTinh;;
	private int donGia;
	private String moTa;
}
