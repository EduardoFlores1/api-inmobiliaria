package com.quevedo.inmobiliaria_backend.presentation.dtos.generic;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public class PageableDTO implements Pageable {

    private int page;
    private int size;
    private Optional<Integer> order = Optional.empty();
    private Optional<String> field = Optional.empty();

    public PageableDTO() {}

    public PageableDTO(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public Optional<Integer> getOrder() {
        return order;
    }
    public Optional<String> getField() {
        return field;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setOrder(Optional<Integer> order) {
        this.order = order;
    }

    public void setField(Optional<String> field) {
        this.field = field;
    }

    //override
    @Override
    public int getPageNumber() {
        return page;
    }

    @Override
    public int getPageSize() {
        return size;
    }

    @Override
    public long getOffset() {
        return 0;
    }

    @Override
    public Sort getSort() {
        return null;
    }

    @Override
    public Pageable next() {
        return null;
    }

    @Override
    public Pageable previousOrFirst() {
        return null;
    }

    @Override
    public Pageable first() {
        return null;
    }

    @Override
    public Pageable withPage(int pageNumber) {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public String toString() {
        return "PageableDTO{" +
                "page=" + page +
                ", size=" + size +
                ", order=" + order +
                ", field=" + field +
                '}';
    }
}
