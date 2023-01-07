<%--
  Created by IntelliJ IDEA.
  User: 2013040544-qishijie
  Author:cai4
  Date: 2022/10/14
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>新增书籍</title>
<!-- 加载Query文件--> <script src="https://code.jquery.com/jquery-3.2.0.js">
</script> <script type="text/javascript">
    $(document).ready(function() {
        $("#submit").click(function() {
            var b_id = $("#b_id").val();
            var b_name = $("#b_name").val();
            var b_price = $("#b_price").val();
            if ($.trim(b_id) ==='') {
                alert("书籍名不能为空！");
                return;
            }
            var params = {
                b_id : b_id,
                b_name : b_name,
                b_price : b_price
            };
            $.post({
                url : "./insert",
                // 此处需要告知传递参数类型为JSON，不能缺少
                contentType : "application/json",
                // 将JSON转化为字符串传递
                data : JSON.stringify(params),
                // 成功后的方法
                success : function(result) {
                    if (result == null) {
                        alert("插入失败");
                        return;
                    }
                    alert("插入成功："+result.b_id+">>"+result.b_name+">>"+result.b_price);
                }
            });
        });
    });
</script>
</head>
<body>
<div style="margin: 20px 0;"></div>
<form id="insertForm">
    <table>
        <tr>
            <td>书籍编号：</td>
            <td><input id="b_id" name="b_id"></td>
        </tr>
        <tr>
            <td>书籍名称</td>
            <td><input id="b_name" name="b_name"></td>
        </tr>
        <tr>
            <td>单价</td>
            <td><input id="b_price" name="b_price"></td>
        </tr>
        <tr>
            <td></td>
            <td align="right"><input id="submit" type="button" value="提交" /></td>
        </tr>
    </table>
</form>
</body>
</html>
