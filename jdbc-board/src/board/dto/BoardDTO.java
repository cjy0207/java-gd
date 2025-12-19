package board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 게시글 정보
 * board 테이블과 일치시켜주는 것이 좋음
 * 				DB			Java
 * - 게시글 번호	no			no
 * - 제목 		title		title
 * - 작성자 		write		write
 * - 내용			content		content
 * - 등록일 		reg_date	regDate
 * - 수정일		upd_date	updDate
 * 
 * DB에서 레코드를 가져오면 DTO 객체에 잘 매핑해서 잠을 예정(DB에 넣을 떄도 마찬가지)
 * 컬렉션에 담으면 게시글 목록이 됨 
 * 
 * */

@Data // getter/setter, toString, equals..
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BoardDTO {

	private int no;
	@NonNull private String title;
	@NonNull private String write;
	@NonNull private String content;
	private LocalDateTime regDate;
	private LocalDateTime updDate;
	
	//@NoArgsConstructor
//	public BoardDTO() {
//		this("(제목 없음)", "(작성자 없음)", "");
//	}
	
	
//	public BoardDTO(String title, String write, String content) {
//		super();
//		this.title = title;
//		this.write = write;
//		this.content = content;
//	}

	
	//@AllArgsConstructor
//	public BoardDTO(int no, String title, String write, String content, LocalDateTime regDate, LocalDateTime updDate) {
//		super();
//		this.no = no;
//		this.title = title;
//		this.write = write;
//		this.content = content;
//		this.regDate = regDate;
//		this.updDate = updDate;
//	}
	
	

	
}
