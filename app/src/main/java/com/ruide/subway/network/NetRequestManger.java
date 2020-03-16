package com.ruide.subway.network;

import com.ruide.subway.bean.LoginBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class NetRequestManger {


    private static NetRequestManger netRequestManger;

    public static NetRequestManger instance() {
        if (netRequestManger == null) {
            synchronized (NetRequestManger.class) {
                netRequestManger = new NetRequestManger();
            }
        }
        return netRequestManger;
    }


    public  Map<String, RequestBody> generateRequestBody(Map<String, String> requestDataMap) {
        Map<String, RequestBody> requestBodyMap = new HashMap<>();
        for (String key : requestDataMap.keySet()) {
            RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"),
                    requestDataMap.get(key) == null ? "" : requestDataMap.get(key));
            requestBodyMap.put(key, requestBody);
        }
        return requestBodyMap;
    }

    public Observable<BaseHttpResponse<LoginBean>> login(String password,String device_type,String email){


        // 这是 json的 形式上传
//        RequestBody requestBody = JsonRequestBodyBuilder.create()
//                .addParam("password","###78a5523d172736068b6b3fff7d6ad3f7")
//                .addParam("device_type","android")
//                .addParam("email","514077686123@qq.com").build();
//        return RetrofitManager.getInstance().getRequestService().getLogin(requestBody);

        //  这是拼接的形式  form-data
//        Map<String, String> DataMap = new HashMap<String, String>();
//        DataMap .put("password","###78a5523d172736068b6b3fff7d6ad3f7");
//        DataMap .put("device_type","android");
//        DataMap .put("email","514077686123@qq.com");
//        return RetrofitManager.getInstance().getRequestService().getLoginFormData(generateRequestBody(DataMap));

        //  这是拼接的形式  form-data
        Map<String, String> DataMap = new HashMap<String, String>();
//        DataMap .put("password","###78a5523d172736068b6b3fff7d6ad3f7");
//        DataMap .put("device_type","android");
//        DataMap .put("email","514077686123@qq.com");
        DataMap .put("password",password);
        DataMap .put("device_type",device_type);
        DataMap .put("email",email);
        return RetrofitManager.getInstance().getRequestService().getLoginFormData(generateRequestBody(DataMap));

    }

}
