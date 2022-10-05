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
public class PhieuGoiMon {
	private String soPhieuGoi;
	private String soBan;
	private String maKhach;
	private Timestamp ngayGioGoi;
}
