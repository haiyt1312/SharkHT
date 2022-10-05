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
public class ThucPham {
	private String maThucPhan;
	private String tenThucPham;
	private String donViTinh;
	private String moTa;
}
