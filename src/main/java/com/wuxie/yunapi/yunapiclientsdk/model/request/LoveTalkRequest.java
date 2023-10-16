package com.wuxie.yunapi.yunapiclientsdk.model.request;

import com.wuxie.yunapi.yunapiclientsdk.model.enums.RequestMethodEnum;
import com.wuxie.yunapi.yunapiclientsdk.model.params.LoveTalkParams;
import com.wuxie.yunapi.yunapiclientsdk.model.response.LoveTalkResponse;
import com.wuxie.yunapi.yunapiclientsdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author wuxie
 * @date 2023/10/16 9:54
 * @description 该文件的描述 todo
 */
@Accessors(chain = true)
public class LoveTalkRequest  extends BaseRequest<LoveTalkParams, LoveTalkResponse> {
    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
        return "/loveTalk";
    }

    @Override
    public Class<LoveTalkResponse> getResponseClass() {
        return LoveTalkResponse.class;
    }
}
