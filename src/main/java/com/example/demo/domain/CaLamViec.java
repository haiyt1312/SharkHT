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
public class CaLamViec {
	private String maCa;
	private String tenca;
	private Date gioBatDau;
	private Date gioKetThuc;
}
