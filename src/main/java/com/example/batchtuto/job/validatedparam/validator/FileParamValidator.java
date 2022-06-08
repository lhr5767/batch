package com.example.batchtuto.job.validatedparam.validator;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.util.StringUtils;

public class FileParamValidator implements JobParametersValidator {
    @Override
    public void validate(JobParameters parameters) throws JobParametersInvalidException {
        String fileName = parameters.getString("fileName");

        // csv가 아닌경우
        if (!StringUtils.endsWithIgnoreCase(fileName,"csv")) {
            throw new JobParametersInvalidException("csv 파일이 아닙니다" );
        }
    }
}
