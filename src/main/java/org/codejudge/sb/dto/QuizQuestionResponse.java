package org.codejudge.sb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizQuestionResponse {

    private String name;
    private String description;
    private List<QuestionResponse> questions;
}
