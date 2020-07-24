package org.codejudge.sb.mapper;

import javax.annotation.Generated;
import org.codejudge.sb.domain.Quiz;
import org.codejudge.sb.dto.QuizReponse;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-24T12:37:36+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (JetBrains s.r.o.)"
)
@Component
public class QuizMapperImpl implements QuizMapper {

    @Override
    public QuizReponse mapToDto(Quiz quiz) {
        if ( quiz == null ) {
            return null;
        }

        QuizReponse quizReponse = new QuizReponse();

        if ( quiz.getId() != null ) {
            quizReponse.setId( quiz.getId() );
        }
        quizReponse.setName( quiz.getName() );
        quizReponse.setDescription( quiz.getDescription() );

        return quizReponse;
    }
}
