package com.zyl.pig.service.mvc.controller;

import com.zyl.pig.common.base.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 活动表 前端控制器
 *
 * @author 张代富
 * @since 2021-08-16
 */
@RestController
@RequestMapping("/pig")
public class PigController {

	// @Autowired
	// private IUserService userService;

	@PostMapping("/add")
	@ResponseBody
	public Object addUser(@RequestBody Map<String, String> test) {
		System.out.println("fff");
		return ResponseUtil.success("fff", test);
	}

}
