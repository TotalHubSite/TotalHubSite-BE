package com.totalhubsite.backend.apitest;

import lombok.Builder;

public record TestResponseDto(
    Long id,
    String content
) {

    @Builder
    public TestResponseDto(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
