package nigeriandailies.com.ng.roomwordsexam;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import nigeriandailies.com.ng.roomwordsexam.entity.Word;
import nigeriandailies.com.ng.roomwordsexam.repo.WordRepository;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;
    

    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();

    }
    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }
    public void insert(Word word) {
        mRepository.insert(word);
    }

}
