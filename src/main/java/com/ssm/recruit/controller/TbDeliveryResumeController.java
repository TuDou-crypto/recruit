package com.ssm.recruit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.recruit.service.ITbDeliveryResumeService;

/**
 * <p>
 * 鐢ㄦ埛鎶曢�掔畝鍘嗚〃 鍓嶇鎺у埗鍣�
 * </p>
 *
 * @author sutuo
 * @since 2019-08-26
 */
@Controller
@RequestMapping("/materialplant/tbDeliveryResume")
public class TbDeliveryResumeController {
	
	@Autowired
	private ITbDeliveryResumeService tbDeliveryResumeService;

}

