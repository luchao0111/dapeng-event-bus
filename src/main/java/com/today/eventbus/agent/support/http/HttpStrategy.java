package com.today.eventbus.agent.support.http;

import com.today.eventbus.utils.ResponseResult;

/**
 * @author <a href=mailto:leihuazhe@gmail.com>maple</a>
 * @since 2018-12-12 2:43 PM
 */
public interface HttpStrategy {

    ResponseResult post(String url, String eventType, String params);


}
