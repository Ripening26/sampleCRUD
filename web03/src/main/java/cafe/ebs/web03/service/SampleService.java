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
	
	public Sample getSampleOne(int sampleId) {		
		Sample sample = sampleMapper.sampleOne(sampleId);
		return sample;
	}
	
	public int addSample(Sample sample) {
		int result = sampleMapper.addSample(sample);
		return result; 
	}
	
	public int removeSample(Sample sample) {
		int result = sampleMapper.deleteSample(sample);
		return result;
	}
	
	public int modifySample(int sampleId,String sampleName) {
		int result = sampleMapper.updateSample(sampleId,sampleName);
		return result; 
	}
}
