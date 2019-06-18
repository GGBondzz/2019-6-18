package com.weixin.demo.service.impl;

import com.weixin.demo.repository.InvitationRepository;
import com.weixin.demo.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    private InvitationRepository invitationRepository;
}
