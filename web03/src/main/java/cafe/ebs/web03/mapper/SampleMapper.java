package cafe.ebs.web03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cafe.ebs.web03.vo.Sample;

@Mapper
public interface SampleMapper {
	//insert
	int addSample(Sample sample);
	//list 
	List<Sample> selectsamplelist();
	//delete
	int deleteSample(Sample sample);
	//one update
	Sample sampleOne(int sampleId);
	//update
	int updateSample(int sampleId,String sampleName);
	
}
