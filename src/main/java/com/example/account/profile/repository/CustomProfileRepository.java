package com.example.account.profile.repository;

import com.example.account.profile.dto.StatisticsResponse;

public interface CustomProfileRepository {

    StatisticsResponse getStatisticsOfUser(String userId);

}
