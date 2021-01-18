package com.ziqi.demo.mapstruct;

import com.ziqi.demo.domain.Student;
import com.ziqi.demo.domain.dto.StudentDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity Student and its DTO StudentDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface StudentMapStruct extends EntityMapper<StudentDTO, Student> {

}
