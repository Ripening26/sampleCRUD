package cafe.ebs.web03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cafe.ebs.web03.vo.Sample;

@Mapper
public interface SampleMapper {
 //추상메서드 만들기
	List<Sample> selectsamplelist();
}
