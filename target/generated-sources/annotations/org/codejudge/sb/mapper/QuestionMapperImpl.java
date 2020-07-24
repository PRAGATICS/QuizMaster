package org.codejudge.sb.mapper;

import javax.annotation.Generated;
import org.codejudge.sb.domain.Question;
import org.codejudge.sb.domain.Question.QuestionBuilder;
import org.codejudge.sb.domain.Quiz;
import org.codejudge.sb.dto.QuestionRequest;
import org.codejudge.sb.dto.QuestionResponse;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-24T12:37:37+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (JetBrains s.r.o.)"
)
@Component
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public Question map(QuestionRequest questionRequest, Quiz quiz) {
        if ( questionRequest == null && quiz == null ) {
            return null;
        }

        QuestionBuilder question = Question.builder();

        if ( questionRequest != null ) {
            question.name( questionRequest.getName() );
            question.id( questionRequest.getQuestionId() );
            question.options( questionRequest.getOptions() );
            question.correct_option( questionRequest.getCorrect_option() );
            question.points( questionRequest.getPoints() );
        }
        if ( quiz != null ) {
            question.quiz( quiz );
        }

        return question.build();
    }

    @Override
    public QuestionResponse mapToDto(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionResponse questionResponse = new QuestionResponse();

        if ( question.getId() != null ) {
            questionResponse.setId( question.getId() );
        }
        questionResponse.setName( question.getName() );
        questionResponse.setOptions( question.getOptions() );
        questionResponse.setCorrect_option( String.valueOf( question.getCorrect_option() ) );
        questionResponse.setPoints( question.getPoints() );

        questionResponse.setQuiz( getQuizId(question.getQuiz()) );

        return questionResponse;
    }
}
