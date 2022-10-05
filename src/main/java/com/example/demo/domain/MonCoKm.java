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
public class MonCoKm {
	private String maMon;
	private String maKm;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private String giaTriKm;
	private String moTa;
}
