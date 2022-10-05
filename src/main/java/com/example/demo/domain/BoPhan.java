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
public class BoPhan {
	private String maBoPhan;
	private String tenBoPhan;
	private String chucNang;
}
