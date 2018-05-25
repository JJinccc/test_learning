package com.ffan.qa.biz.services.coupon;

import com.ffan.qa.biz.services.ServiceBase;
import com.ffan.qa.network.APIRequest;
import com.ffan.qa.network.APIResponse;

import java.util.Map;

public class CCouponTopService extends ServiceBase {
    public CCouponTopService(Map<String, Object> urlData) {
        super(urlData, "ffanAPIBaseUrl", "toCCouponTop");
    }

    @Override
    public APIResponse request() {
        return httpGet();
    }

}
