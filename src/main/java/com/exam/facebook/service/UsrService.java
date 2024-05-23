package com.exam.facebook.service;

import com.exam.facebook.domain.Usr;
import com.exam.facebook.dto.request.AddUsrRequest;
import com.exam.facebook.repository.UsrRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsrService {
    private final UsrRepository usrRepository;

    public void usrSave(AddUsrRequest addRequest) {
        usrRepository.save(addRequest.usrToEntity());
    }

    public List<Usr> usrViewTest() {
        return usrRepository.findAll();
    }
}
