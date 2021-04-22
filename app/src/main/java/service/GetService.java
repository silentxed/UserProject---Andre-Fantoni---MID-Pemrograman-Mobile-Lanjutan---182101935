package service;

import java.util.List;

import model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUserList();
}
