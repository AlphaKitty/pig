package com.zyl.pig.service.mvc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zyl.pig.common.base.ResponseUtil;
import com.zyl.pig.service.mvc.pojo.Check;
import com.zyl.pig.service.mvc.service.ICheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 账单 前端控制器
 *
 * @author 张代富
 * @since 2021-09-09
 */
@RestController
@RequestMapping("/check")
public class CheckController {

	@Autowired
	private ICheckService checkService;

	@PostMapping
	@ResponseBody
	public Object addOne(@RequestBody Check check) {
		try {
			check.setTime(new Date());
			checkService.save(check);
			return ResponseUtil.success("新增成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("新增失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@PostMapping("search")
	@ResponseBody
	public Object search(@RequestBody Check check) {
		try {
			QueryWrapper<Check> queryWrapper = new QueryWrapper<>();
			queryWrapper.orderByAsc("CONVERT(name USING gbk)");
			List<Check> list = checkService.list(queryWrapper);
			return ResponseUtil.success("成功", list);
		} catch (Exception e) {
			return ResponseUtil.error("查询失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@DeleteMapping
	@ResponseBody
	public Object deleteById(String id) {
		try {
			checkService.removeById(id);
			return ResponseUtil.success("删除成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("删除失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@PutMapping
	@ResponseBody
	public Object update(Check check) {
		try {
			checkService.update(check, new UpdateWrapper<>());
			return ResponseUtil.success("修改成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("修改失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@GetMapping
	@ResponseBody
	public Object getById(String id) {
		try {
			Check check = checkService.getById(id);
			return ResponseUtil.success("查询成功", check);
		} catch (Exception e) {
			return ResponseUtil.error("查询失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

}
