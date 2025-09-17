package com.sutaruhin;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	@GetMapping("dayofweek/{val}")
	public String dispDayOfWeek(@PathVariable int val) {
		int year = val / 10000;
		int month = (val % 10000) / 100;
		int day = val % 100;
		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek week = date.getDayOfWeek();
		String weekEn = week.getDisplayName(TextStyle.FULL,
				Locale.ENGLISH);
		return "実行結果：" + weekEn;
	}

	@GetMapping("plus/{val1}/{val2}")
	public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
		int plusResult = val1 + val2;
		return "実行結果:" + plusResult;
	}

	@GetMapping("minus/{val1}/{val2}")
	public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
		int minusResult = val1 - val2;
		return "実行結果:" + minusResult;
	}

	@GetMapping("times/{val1}/{val2}")
	public String calcTimes(@PathVariable int val1,@PathVariable int val2) {
		int timesResult = val1 * val2;
		return "実行結果:" + timesResult;
	}

	@GetMapping("divide/{val1}/{val2}")
	public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
		int divideResult = val1 / val2;
		return "実行結果：" + divideResult;
	}

}
