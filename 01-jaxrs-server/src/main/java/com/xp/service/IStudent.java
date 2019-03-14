package com.xp.service;

import com.xp.entity.Student;

import javax.ws.rs.*;

/**
 * @Author xp
 * @CreateTime 2019/03/14  22:38
 * @Function 对外服务接口
 */

//访问当前接口服务的对应的路径
@Path("/stuService")
@Produces("*/*")
public interface IStudent {

    @POST
    //访问当前服务接口方法对应的路径
    @Path("/stu")
    //服务器支持的请求数据的格式xml,json
    @Consumes({"application/xml","application/json"})
    public String say1();


    @PUT
    @Path("/stu")
    //服务器支持的请求数据的格式xml,json
    @Consumes({"application/xml","application/json"})
    public String say2();


    @GET
    @Path("/stu")
    //服务器支持的返回数据的格式xml,json
    @Produces({"application/xml","application/json"})
    public Student say3();


    @DELETE
    @Path("/stu")
    //服务器支持的返回数据的格式xml,json
    @Produces({"application/xml","application/json"})
    public String say4();
}
