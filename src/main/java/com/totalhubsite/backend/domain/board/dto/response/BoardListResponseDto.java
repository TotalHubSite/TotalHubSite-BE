package com.totalhubsite.backend.domain.board.dto.response;

import com.totalhubsite.backend.domain.board.entity.Board;
import com.totalhubsite.backend.domain.member.dto.response.MemberInfoResponseDto;
import com.totalhubsite.backend.domain.member.entity.Member;
import lombok.Builder;

public record BoardListResponseDto(
    Long id,
    String name,
    String description,
    MemberInfoResponseDto member
) {

    @Builder
    public BoardListResponseDto(Long id, String name, String description,
        MemberInfoResponseDto member) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.member = member;
    }

    public static BoardListResponseDto fromEntity(Board entity) {
        Member findMember = entity.getMember();
        MemberInfoResponseDto memberInfo = MemberInfoResponseDto.fromEntity(findMember);
        return BoardListResponseDto.builder()
            .id(entity.getId())
            .name(entity.getName())
            .description(entity.getDescription())
            .member(memberInfo)
            .build();
    }

}
