package yongyong.graduate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yongyong.graduate.docDomain.DocRepository;
import yongyong.graduate.hotDomain.Hot;
import yongyong.graduate.hotDomain.HotRepository;

import java.util.List;

@Service
public class HotService {

    private final HotRepository hotRepository;
    private final DocRepository docRepository;

    @Autowired
    public HotService(HotRepository hotRepository, DocRepository docRepository) {
        this.hotRepository = hotRepository;
        this.docRepository = docRepository;
    }


    public List<Hot> findAll() {
        return hotRepository.findAll();
    }

//    public List<Doc> getDocsByKeyword(String keyword) {
//        List<Hot> hotWords = hotRepository.findBy_id(keyword);
//        if (hotWords.size() == 0) {
//            return new ArrayList<>();
//        }
//        Hot hotWord = hotWords.get(0);
//        List<String> docIds = hotWord.getDocs();
//        List<Doc> docs = new ArrayList<>();
//        for (String docId : docIds) {
//            String[] arr = docId.split("/");
//            String docDate = arr[0];
//            int docNum = Integer.parseInt(arr[1]);
//            Doc doc = docRepository.findByDateAndNum(docDate, docNum);
//            docs.add(doc);
//        }
//        return docs;
//    }
}
