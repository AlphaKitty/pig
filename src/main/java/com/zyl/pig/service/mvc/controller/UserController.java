package com.zyl.pig.service.mvc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zyl.pig.common.base.ResponseUtil;
import com.zyl.pig.service.mvc.pojo.User;
import com.zyl.pig.service.mvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 人 前端控制器
 *
 * @author 张代富
 * @since 2021-09-09
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping
	@ResponseBody
	public Object addOne(@RequestBody User user) {
		try {
			userService.save(user);
			return ResponseUtil.success("新增成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("新增失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@PostMapping("search")
	@ResponseBody
	public Object search(@RequestBody User user) {
		try {
			QueryWrapper<User> queryWrapper = new QueryWrapper<>();
			queryWrapper.orderByAsc("CONVERT(name USING gbk)");
			List<User> list = userService.list(queryWrapper);
			return ResponseUtil.success("成功", list);
		} catch (Exception e) {
			return ResponseUtil.error("查询失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@DeleteMapping
	@ResponseBody
	public Object deleteById(String id) {
		try {
			userService.removeById(id);
			return ResponseUtil.success("删除成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("删除失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@PutMapping
	@ResponseBody
	public Object update(User user) {
		try {
			userService.update(user, new UpdateWrapper<>());
			return ResponseUtil.success("修改成功", null);
		} catch (Exception e) {
			return ResponseUtil.error("修改失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

	@GetMapping
	@ResponseBody
	public Object getById(String id) {
		try {
			User user = userService.getById(id);
			return ResponseUtil.success("查询成功", user);
		} catch (Exception e) {
			return ResponseUtil.error("查询失败", (e.getCause() == null || e.getCause().getMessage() == null) ? e.toString() : e.getCause().getMessage());
		}
	}

}
