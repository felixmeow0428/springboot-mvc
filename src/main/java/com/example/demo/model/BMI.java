package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //包含Getter Setter在內的方法
@NoArgsConstructor //無參數建構子
@AllArgsConstructor //全參數建構子
public class BMI {
	private Double height;
	private Double weight;
	private Double bmi;

}
