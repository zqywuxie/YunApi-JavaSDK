package com.wuxie.yunapi.yunapiclientsdk.service.impl;

import com.wuxie.yunapi.yunapiclientsdk.client.APIClient;
import com.wuxie.yunapi.yunapiclientsdk.model.request.LoveTalkRequest;
import com.wuxie.yunapi.yunapiclientsdk.model.request.PhoneRequest;
import com.wuxie.yunapi.yunapiclientsdk.model.response.LoveTalkResponse;
import com.wuxie.yunapi.yunapiclientsdk.model.response.PhoneResponse;
import com.wuxie.yunapi.yunapiclientsdk.service.ApiService;
import com.wuxie.yunapi.yunapiclientsdk.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * @author wuxie
 * @date 2023/10/10 11:36
 * @description 该文件的描述 todo
 */
@Service
public class ApiServiceImpl extends BaseService implements ApiService {


    @Override
    public PhoneResponse homeOfPhone(APIClient apiClient, PhoneRequest request) {
        return null;
    }

    @Override
    public LoveTalkResponse loveTalk(APIClient apiClient) {
        LoveTalkRequest loveTalkRequest = new LoveTalkRequest();
        return request(loveTalkRequest, apiClient);
    }

    @Override
    public LoveTalkResponse loveTalk() {
        LoveTalkRequest loveTalkRequest = new LoveTalkRequest();

        return request(loveTalkRequest);
    }


//    public String getNameByGet(String name) {
//        return HttpUtil.get(GATEWAY_HOST + "/api/name/" + name);
//    }
//
//    public String getNameByPost(String name) {
//        // 可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("name", name);
//        return HttpUtil.post(GATEWAY_HOST + "/api/name", paramMap);
//    }
//
//    public String getNameByPostWithJson(User user) throws UnsupportedEncodingException {
//        String json = JSONUtil.toJsonStr(user);
//        HttpResponse response = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
//                .addHeaders(BaseService.getHeaders(json, new APIClient()))
//                .body(json)
//                .execute();
//        System.out.println("response = " + response);
//        System.out.println("status = " + response.getStatus());
//        if (response.isOk()) {
//            return response.body();
//        }
//        return "fail";
//    }

}
