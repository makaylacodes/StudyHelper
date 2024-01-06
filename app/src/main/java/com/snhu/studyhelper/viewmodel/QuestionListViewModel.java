package com.snhu.studyhelper.viewmodel;

import android.app.Application;
import com.snhu.studyhelper.model.Question;
import com.snhu.studyhelper.repo.StudyRepository;
import java.util.List;

public class QuestionListViewModel {

    private StudyRepository studyRepo;

    public QuestionListViewModel(Application application) {
        studyRepo = StudyRepository.getInstance(application.getApplicationContext());
    }

    public List<Question> getQuestions(long subjectId) {
        return studyRepo.getQuestions(subjectId);
    }
}
