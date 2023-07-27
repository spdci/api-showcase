package com.ahi.sbl.services;

//import com.ahi.proto.request.SearchRequest;
//import com.ahi.proto.response.SearchResponse;
import org.spdci.common.Payload;
import reactor.core.publisher.Mono;

public interface CrvsService {
	//List<ResponseData> searchByNationalId(String nationalId, String AuthorizationToken) throws Exception;

	  Mono<Payload> proActiveSearch(Payload searchData) throws Exception;

	// Mono<RequestResponse> proActiveSearch(CRVSSearch payload);
}
