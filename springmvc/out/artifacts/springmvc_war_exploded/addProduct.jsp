<%--
  Created by IntelliJ IDEA.
  User: zhoudq
  Date: 2018/2/19
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>

<form action="/showProduct.do">

    产品名称 ：<input type="text" name="name" value=""><br />
    产品价格： <input type="text" name="price" value=""><br />
    ID：<input type="number" name="id" value="" > <br />
    信息：<input type="text" name="message" value=""><br />

    <input type="submit" value="增加商品">
</form>
<a href="/index">index</a><br>
<a href="/jump">jump</a>
