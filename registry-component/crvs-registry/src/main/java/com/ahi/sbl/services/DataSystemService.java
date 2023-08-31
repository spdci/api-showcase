package com.ahi.sbl.services;

import com.ahi.proto.request.SearchRequest;
import com.ahi.sbl.pojo.ApiResponse;
import reactor.core.publisher.Mono;

public interface DataSystemService {

	Mono<ApiResponse> personInfo(SearchRequest payload) throws Exception;
}
