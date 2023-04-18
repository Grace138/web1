package com.cy.itsm.echoline.DataMgmt.Mapper;

import java.util.List;
import java.util.Map;

import com.cy.itsm.common.Paging.Paging;

public interface SgkimDataMgmtMapper {
	
	int sgDataSearchCnt_Customer(Paging page);
	List<Map<String, Object>> sgDataSearchList_Customer(Paging page);
	List<Map<String, Object>> sgDataSearchListExcel_Customer(Paging page);
}
