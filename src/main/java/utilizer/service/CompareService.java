package utilizer.service;

import utilizer.pojo.IncludingCompareRes;

import java.util.List;

public interface CompareService {


    public IncludingCompareRes compareInclude(List<String> leftList, List<String> rightList);
}
