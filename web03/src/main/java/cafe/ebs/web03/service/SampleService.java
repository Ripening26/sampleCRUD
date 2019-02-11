package cafe.ebs.web03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cafe.ebs.web03.mapper.SampleMapper;
import cafe.ebs.web03.vo.Sample;

@Service
public class SampleService {
	@Autowired 
	private SampleMapper sampleMapper; 
	
	public List<Sample> getSampleList(){
		List<Sample> list = null;
		list = sampleMapper.selectsamplelist();
		return list;
	}
	
	public Sample getSampleOne() {
		return null;
	}
	
	public int addSample(Sample sample) {
		return 0; 
	}
	
	public int removeSample(Sample sample) {
		return 0;
	}
	
	public int modifySample(Sample sample) {
		return 0; 
	}
}
