package com.zyl.pig.service.mvc.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zyl.pig.common.base.ResponseUtil;
import com.zyl.pig.service.mvc.pojo.Pig;
import com.zyl.pig.service.mvc.service.IPigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 猪 前端控制器
 *
 * @author 张代富
 * @since 2021-09-09
 */
@RestController
@RequestMapping("/pig")
public class PigController {

	@Autowired
	private IPigService pigService;

	@PostMapping
	@ResponseBody
	public Object addOne(@RequestBody Pig pig) {
		try {
			pigService.save(pig);
			return ResponseUtil.success("新增成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("新增失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@DeleteMapping
	@ResponseBody
	public Object deleteById(String id) {
		try {
			pigService.removeById(id);
			return ResponseUtil.success("删除成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("删除失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@PutMapping
	@ResponseBody
	public Object update(Pig pig) {
		try {
			pigService.update(pig, new UpdateWrapper<>());
			return ResponseUtil.success("修改成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("修改失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@GetMapping
	@ResponseBody
	public Object getById(String id) {
		try {
			Pig pig = pigService.getById(id);
			return ResponseUtil.success("查询成功", pig);
		} catch (Exception e) {
			return ResponseUtil.error("查询失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

}
