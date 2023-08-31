package com.ahi.sbl.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.ahi.proto.common.Person;
import com.ahi.proto.common.RegistryRecord;
import com.ahi.proto.request.SearchCriteriaRequest;
import com.ahi.proto.request.SearchRequest;
import com.ahi.sbl.repo.CRVSRegInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.ahi.sbl.dto.CRVSinfoPojo;
import com.ahi.sbl.pojo.ApiResponse;
import com.ahi.sbl.pojo.ErrorResponse;
import com.ahi.sbl.pojo.SuccessResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;


import static org.springframework.data.jpa.domain.Specification.where;

@Service
public class DataServiceServiceImpl implements DataSystemService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ObjectMapper objectMapper;


	@Autowired
	CRVSRegInfoRepository crvsRegInfoRepository;

	@Override
	public Mono<ApiResponse> personInfo(SearchRequest payload) throws JsonProcessingException {
		try {

			SearchCriteriaRequest searchCriteria = payload.getRequestMessage().getRequestMessage().getSearchRequest().getRequestData(0).getSearchCriteria();
			if(searchCriteria.hasRegistryRecord()){
				RegistryRecord registryRecord = searchCriteria.getRegistryRecord();
				if(registryRecord.getIdentifierList()!=null && registryRecord.getIdentifier(0)!=null
				&& registryRecord.getIdentifier(0).getId()!=null){

					System.out.println("ssss" + registryRecord.getIdentifier(0).getId());

				}
			}else if(searchCriteria.hasBirthRecord()){

			}else if(searchCriteria.hasDeathRecord()){

			}else if(searchCriteria.hasUnionRecord()){

			}


//			List<FilterGroup> filtergroupsList = payload.getFiltergroupsList();
//
//			String uinCSV = null;
//			Specification<CRVSinfoPojo> specificationFromFilters = null;
//
//			Optional<String> uinCSVOptional = filtergroupsList.stream()
//					.flatMap(filterGroup -> filterGroup.getFieldsList().stream())
//					.filter(field -> "uin".equalsIgnoreCase(field.getFieldname()))
//					.map(Field::getValue)
//					.findFirst();
//
//			if (uinCSVOptional.isPresent()) {
//				uinCSV = uinCSVOptional.get();
//			}
//
//			for (FilterGroup filterGroup : filtergroupsList) {
//				List<Field> fieldsList = filterGroup.getFieldsList();
//
//				for (Field field : fieldsList) {
//					if ("uin".equalsIgnoreCase(field.getFieldname())) {
//						uinCSV = field.getValue();
//					}
//				}
//
//				specificationFromFilters = getSpecificationFromFilters(fieldsList, specificationFromFilters);
//			}
//
//			List<CRVSinfoPojo> resultList = null;
//			 if (specificationFromFilters == null) {
//				resultList = crvsRegInfoRepository.findAll();
//			} else {
//				resultList = crvsRegInfoRepository.findAll(specificationFromFilters);
//			}
//
//			//List<crvsInfo> findByUin = crvsRepo.findByUin(Arrays.asList(uinCSV.split(",")));
//			List<com.ahi.proto.response.CRVSData> output = new ArrayList<>();
//				for (CRVSinfoPojo crvsInfo : resultList) {
//
//					Identifier nationalId = Identifier.newBuilder().setType("NATIONAL_ID").setValue(crvsInfo.getUin().toString()).build();
//					Identifier MRNNationalId = Identifier.newBuilder().setType("MARRIAGE_REGISTRATION_NUMBER")//
//							.setValue(crvsInfo.getMrn()).build();
//					Identifier BRNNationalId = Identifier.newBuilder().setType("BIRTH_REGISTRATION_NUMBER")//
//							.setValue(crvsInfo.getBrn()).build();
//					Identifier DRNNationalId = Identifier.newBuilder().setType("DEATH_REGISTRATION_NUMBER")//
//							.setValue(crvsInfo.getDrn()).build();
//
//					List<Identifier> identifiers = new ArrayList<>();
//					identifiers.add(nationalId);
//
//					if(crvsInfo.getMrn()!=null && !crvsInfo.getMrn().isEmpty() && !crvsInfo.getMrn().equalsIgnoreCase("-")){
//						identifiers.add(MRNNationalId);
//					}
//					if(crvsInfo.getBrn()!=null && !crvsInfo.getBrn().isEmpty() && !crvsInfo.getBrn().equalsIgnoreCase("-")){
//						identifiers.add(BRNNationalId);
//					}
//					if(crvsInfo.getDrn()!=null && !crvsInfo.getDrn().isEmpty() && !crvsInfo.getDrn().equalsIgnoreCase("-")){
//						identifiers.add(DRNNationalId);
//					}
//
//					Person person = Person.newBuilder().setFirstName(crvsInfo.getFirstName()).setLastName(crvsInfo.getLastName()).build();
//					List<CRVSData> crvsList =getChilds(crvsInfo.getSpouseUin().toString(), crvsInfo.getUin().toString());
//					com.ahi.proto.response.CRVSData crvsInfoProto = com.ahi.proto.response.CRVSData.newBuilder()//
//							.addAllIdentifier(identifiers)
//							.setName(person)
//							.setDob(crvsInfo.getDob())
//							.setFatherUin(crvsInfo.getFatherUin())
//							.setMotherUin(crvsInfo.getMotherUin())
//							.setMaritalStatus(crvsInfo.getMaritalStatus())
//							.setSpouseUin(crvsInfo.getSpouseUin())
//							.setSpouseName(crvsInfo.getSpouseName())
//							.setDateOfDeath(crvsInfo.getDateOfDeath())
//							.setGender(crvsInfo.getGender())
//							.addAllChild(crvsList)
//							.addAllSpouse(getSpouse(crvsInfo.getSpouseUin().toString()))
//							.build();
//							//.set(crvsInfo.get)
//					output.add(crvsInfoProto);
//				}
//
//
 		SuccessResponse<com.ahi.proto.response.SearchResponseProto> success = new SuccessResponse<>("true", "Data retrieve successfully", "");
 		success.setData(null);
			//return Mono.just(success);
		return Mono.just(success);
		} catch (Exception e) {
			e.printStackTrace();
			ErrorResponse err = new ErrorResponse("false", "Error while searching data", "");
			
			return Mono.just(err);	
		}
		
	}
//
//
//	private List<CRVSData> getChilds(String fatherUIN, String MotherUIN){
//
//		Specification<CRVSinfoPojo> specificationFromFilters = null;
//
//		Field fatherInfo = Field.newBuilder().setOperator("equals").setFieldname("fatherUin").setValue(fatherUIN).setNextfieldoperator("and").build();
//		Field MotherInfo = Field.newBuilder().setOperator("equals").setFieldname("motherUin").setValue(MotherUIN).setNextfieldoperator("and").build();
//		List<Field> fieldsList = new ArrayList<>();
//		fieldsList.add(fatherInfo);
//		fieldsList.add(MotherInfo);
//
//		specificationFromFilters = getSpecificationFromFilters(fieldsList, specificationFromFilters);
//
//		List<CRVSinfoPojo> findByUin = crvsRegInfoRepository.findAll(specificationFromFilters);
//		List<CRVSData> crvsList = new ArrayList<>();
//
//		for (CRVSinfoPojo crvsInfo : findByUin) {
//			Identifier nationalId = Identifier.newBuilder().setType("NATIONAL_ID").setValue(crvsInfo.getUin().toString()).build();
//			Identifier MRNNationalId = Identifier.newBuilder().setType("MARRIAGE_REGISTRATION_NUMBER")//
//					.setValue(crvsInfo.getMrn()).build();
//			Identifier BRNNationalId = Identifier.newBuilder().setType("BIRTH_REGISTRATION_NUMBER")//
//					.setValue(crvsInfo.getBrn()).build();
//			Identifier DRNNationalId = Identifier.newBuilder().setType("DEATH_REGISTRATION_NUMBER")//
//					.setValue(crvsInfo.getDrn()).build();
//
//			List<Identifier> identifiers = new ArrayList<>();
//			identifiers.add(nationalId);
//
//			if(crvsInfo.getMrn()!=null && !crvsInfo.getMrn().isEmpty() && !crvsInfo.getMrn().equalsIgnoreCase("-")){
//				identifiers.add(MRNNationalId);
//			}
//			if(crvsInfo.getBrn()!=null && !crvsInfo.getBrn().isEmpty() && !crvsInfo.getBrn().equalsIgnoreCase("-")){
//				identifiers.add(BRNNationalId);
//			}
//			if(crvsInfo.getDrn()!=null && !crvsInfo.getDrn().isEmpty() && !crvsInfo.getDrn().equalsIgnoreCase("-")){
//				identifiers.add(DRNNationalId);
//			}
//
//			Person person = Person.newBuilder().setFirstName(crvsInfo.getFirstName()).setLastName(crvsInfo.getLastName()).build();
//
//			com.ahi.proto.response.CRVSData crvsInfoProto = com.ahi.proto.response.CRVSData.newBuilder()//
//					.addAllIdentifier(identifiers)
//					.setName(person)
//					.setDob(crvsInfo.getDob())
//					.setFatherUin(crvsInfo.getFatherUin())
//					.setMotherUin(crvsInfo.getMotherUin())
//					.setMaritalStatus(crvsInfo.getMaritalStatus())
//					.setSpouseUin(crvsInfo.getSpouseUin())
//					.setSpouseName(crvsInfo.getSpouseName())
//					.setDateOfDeath(crvsInfo.getDateOfDeath())
//					.setGender(crvsInfo.getGender())
//					.build();
//			//.set(crvsInfo.get)
//			crvsList.add(crvsInfoProto);
//		}
//	return crvsList;
//	}
//
//
//	private List<CRVSData> getSpouse(String spouseUin){
//
//		Specification<CRVSinfoPojo> specificationFromFilters = null;
//
//		Field spouseUinInfo = Field.newBuilder().setOperator("equals").setFieldname("uin").setValue(spouseUin).setNextfieldoperator("and").build();
//		Field spouseUinInfo1 = Field.newBuilder().setOperator("equals").setFieldname("uin").setValue(spouseUin).setNextfieldoperator("and").build();
//
//		List<Field> fieldsList = new ArrayList<>();
//		fieldsList.add(spouseUinInfo);
//		fieldsList.add(spouseUinInfo1);
//		specificationFromFilters = getSpecificationFromFilters(fieldsList, specificationFromFilters);
//
//		List<CRVSinfoPojo> findByUin = crvsRegInfoRepository.findAll(specificationFromFilters);
//		List<CRVSData> crvsList = new ArrayList<>();
//
//		for (CRVSinfoPojo crvsInfo : findByUin) {
//			Identifier nationalId = Identifier.newBuilder().setType("NATIONAL_ID").setValue(crvsInfo.getUin().toString()).build();
//			Identifier MRNNationalId = Identifier.newBuilder().setType("MARRIAGE_REGISTRATION_NUMBER")//
//					.setValue(crvsInfo.getMrn()).build();
//			Identifier BRNNationalId = Identifier.newBuilder().setType("BIRTH_REGISTRATION_NUMBER")//
//					.setValue(crvsInfo.getBrn()).build();
//			Identifier DRNNationalId = Identifier.newBuilder().setType("DEATH_REGISTRATION_NUMBER")//
//					.setValue(crvsInfo.getDrn()).build();
//
//			List<Identifier> identifiers = new ArrayList<>();
//			identifiers.add(nationalId);
//
//			if(crvsInfo.getMrn()!=null && !crvsInfo.getMrn().isEmpty() && !crvsInfo.getMrn().equalsIgnoreCase("-")){
//				identifiers.add(MRNNationalId);
//			}
//			if(crvsInfo.getBrn()!=null && !crvsInfo.getBrn().isEmpty() && !crvsInfo.getBrn().equalsIgnoreCase("-")){
//				identifiers.add(BRNNationalId);
//			}
//			if(crvsInfo.getDrn()!=null && !crvsInfo.getDrn().isEmpty() && !crvsInfo.getDrn().equalsIgnoreCase("-")){
//				identifiers.add(DRNNationalId);
//			}
//
//			Person person = Person.newBuilder().setFirstName(crvsInfo.getFirstName()).setLastName(crvsInfo.getLastName()).build();
//
//			com.ahi.proto.response.CRVSData crvsInfoProto = com.ahi.proto.response.CRVSData.newBuilder()//
//					.addAllIdentifier(identifiers)
//					.setName(person)
//					.setDob(crvsInfo.getDob())
//					.setFatherUin(crvsInfo.getFatherUin())
//					.setMotherUin(crvsInfo.getMotherUin())
//					.setMaritalStatus(crvsInfo.getMaritalStatus())
//					.setSpouseUin(crvsInfo.getSpouseUin())
//					.setSpouseName(crvsInfo.getSpouseName())
//					.setDateOfDeath(crvsInfo.getDateOfDeath())
//					.setGender(crvsInfo.getGender())
//					.build();
//			//.set(crvsInfo.get)
//			crvsList.add(crvsInfoProto);
//		}
//		return crvsList;
//	}



	private Object castToRequiredType(Class fieldType, String value) {
		if (fieldType.isAssignableFrom(Double.class)) {
			return Double.valueOf(value);
		} else if (fieldType.isAssignableFrom(Integer.class)) {
			return Integer.valueOf(value);
		} else if (Enum.class.isAssignableFrom(fieldType)) {
			return Enum.valueOf(fieldType, value);
		}
		return value;
	}

	private Object castToRequiredType(Class fieldType, List<String> value) {
		List<Object> lists = new ArrayList<>();
		for (String s : value) {
			lists.add(castToRequiredType(fieldType, s));
		}
		return lists;
	}



}
