package com.ruide.subway.network;

import com.ruide.subway.bean.LoginBean;
import com.ruide.subway.bean.WeatherEntity;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * author : JOJO
 * e-mail : 18510829974@163.com
 * date   : 2018/11/21 2:35 PM
 * desc   : 网络请求接口的配置
 */
public interface ApiService {

    //添加的city_code = 101030100
//    http://t.weather.sojson.com/api/weather/city/+city_code”
    @GET("weather/city/{city_code}")
    Observable<BaseHttpResponse<WeatherEntity>> getWeather(@Path("city_code") String city_code);

     @POST("user/signin_app")
     Observable<BaseHttpResponse<LoginBean>> getLogin(@Body RequestBody body);

     @Multipart
     @POST("user/signin_app")
     Observable<BaseHttpResponse<LoginBean>> getLoginFormData(@PartMap Map<String, RequestBody> requestBodyMap);


}


