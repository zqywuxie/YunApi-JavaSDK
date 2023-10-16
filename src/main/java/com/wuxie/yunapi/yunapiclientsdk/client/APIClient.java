package com.wuxie.yunapi.yunapiclientsdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wuxie
 * @date 2023/5/24 17:06
 * @description 模拟接口调用
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIClient {

    private String accessKey;
    private String secretKey;

}
