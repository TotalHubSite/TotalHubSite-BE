package com.totalhubsite.backend.domain.board.repository.board;

import com.totalhubsite.backend.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends
    JpaRepository<Board, Long>,
    BoardCustomRepository
{

}
