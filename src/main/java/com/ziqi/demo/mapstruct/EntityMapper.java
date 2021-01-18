package com.ziqi.demo.mapstruct;

import java.util.List;

/**
 * @author ziqi
 * @date Created in 2020-08-15
 */
public interface EntityMapper<D, E> {

    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}
