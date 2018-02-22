<%--
  Created by IntelliJ IDEA.
  User: zhoudq
  Date: 2018/2/22
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

    <form action="uploadImage.do" method="post" enctype="multipart/form-data">
        选择图片：<input type="file" name="image" accept="image/*">
        <input type="submit"  value="上传">
    </form>

