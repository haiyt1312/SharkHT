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
public class PhieuNhap {
	private String soPhieuNhap;
	private String maNv;
	private Date ngayNhap;
}
