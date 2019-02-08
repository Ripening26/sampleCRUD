package cafe.ebs.web03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cafe.ebs.web03.service.SampleService;

@Controller
public class SampleController {
	@Autowired private SampleService sampleService;
	// 1. 입력폼
	@GetMapping
	public String addSample() {
		return "addSample"; // view 이름은 templeate 폴더에 addSample.
	}
	// 2. 입력 액션
	@PostMapping
	public String addSample(@RequestParam(value="sampleName")String sampleName) {
		
		return "redirect:/sampleList";
	}
	// 3. 목록
	@GetMapping("/sampleList")
	public String sampleList(Model model) {
		return "sampleList";
	}
	// 4. 삭제 액션 
	
	// 5. 수정 폼
	
	// 6. 수정 액션
}
