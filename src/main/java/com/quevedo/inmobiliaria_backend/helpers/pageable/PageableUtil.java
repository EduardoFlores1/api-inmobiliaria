package com.quevedo.inmobiliaria_backend.helpers.pageable;

import com.quevedo.inmobiliaria_backend.presentation.dtos.generic.PageableDTO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public class PageableUtil {
    public static Pageable getPageable(PageableDTO pageableDTO) {
        Optional<Integer> sortOrder = pageableDTO.getOrder();
        Optional<String> sortField = pageableDTO.getField();
        int pageNumber = pageableDTO.getPageNumber();
        int pageSize = pageableDTO.getPageSize();

        Pageable pageable;
        if (sortOrder.isPresent() && sortField.isPresent()) {
            Sort.Direction direction = sortOrder.get().equals(1) ? Sort.Direction.ASC : Sort.Direction.DESC;
            pageable = PageRequest.of(pageNumber, pageSize, direction);
        }else {
            pageable = PageRequest.of(pageNumber, pageSize);
        }
        return pageable;
    }
}
