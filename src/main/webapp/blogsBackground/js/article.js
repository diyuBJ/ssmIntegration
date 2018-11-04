

var curr=0;
var limit=0;
//设置条件值
function z(){
    var v=$("#criteria").val();
    $("#criteria1").val(v);
    query1($("#criteria1").val(),1,5);
    paging();
}
//分页块
function paging(){
    layui.use(['laypage', 'layer'], function() {
        var laypage = layui.laypage
            , layer = layui.layer;
        //自定义首页、尾页、上一页、下一页文本
        laypage.render({
            elem: 'articleDemo'
            ,theme: '#1E9FFF' //自定义颜色
            ,count: $("#asum").val() //总记录数，从服务端得到
            ,layout: [ 'prev', 'page', 'next', 'limit'] //开启的功能
            ,limit: 5//每页显示记录数
            ,limits:[5, 10, 15]
            ,first: '首页'
            ,last: '末页'
            ,prev: '<em>«</em>'
            ,next: '<em>»</em>'
            ,jump: function(obj, first){//回调
                //obj包含了当前分页的所有参数，比如：
                console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                console.log(obj.limit); //得到每页显示的条数
                console.log(first)
                curr=obj.curr;
                limit=obj.limit;
                if(!first){
                    query1($("#criteria1").val(),obj.curr,obj.limit)
                }

            }
        });
    });
}
//分页数据
function query1(criteria,curr,limit) {

    $.ajax({
        type: 'post',
        url:"/paging.do",
        data: {"criteria":criteria,"curr":curr,"limit":limit},
        async:false,
        dataType:"json",
        resultType:"json",
        cache:false, //不缓存此页面
        success:function (data){
            $("#atbody").html("");
            $.each(data,function (i,value) {
                if(i==1){
                    if(value==""&&curr>1){
                        query1($("#criteria1").val(),(curr-1),5);
                        paging();
                        return;
                    }
                    if(value==""&&curr==1){
                        $("#atbody").html("");
                        $(".message_footer").html("");
                        $("#atbody").append("<blockquote class=\"layui-elem-quote\">还没有文章！！！赶紧去编写吧！！！</blockquote>");
                        return;
                    }
                    $.each(value,function (i,val) {
                        $("#atbody").append("<tr><td><input type=\"checkbox\"  class=\"input-control\" name=\"checkbox[]\" value=\""+val.aId+"\" /></td>" +
                            "<td class=\"article-title\">"+val.aTitle+"</td><td>"+val.programa.pName+"</td>" +
                            " <td class=\"hidden-sm\">"+val.label+"</td><td class=\"hidden-sm\">"+(val.aStatusBar==1?"公开":"隐藏")+"</td>" +
                            " <td>"+val.aTime+"</td><td><a href=\"#\" onclick=\"loads('update-article.jsp')\">修改</a> <a onclick='delArticle(\""+val.aId+"\")'>删除</a></td></tr>");
                    })
                }else{
                    $("#span1").html(value);
                    $("#asum").val(value);
                }
            })
        }
    });
}
//单个删除
function delArticle(id){
    layer.msg('您真的要删除此文章吗？</br>删除不可逆！', {
        time: 20000, //20s后自动关闭
        anim:0, //窗体弹出的效果 0~6
        btn: ['点错了', '确认删除'],
        offset: [
            150 //高(y)
            ,600 //宽(x)
        ],
        btn1: function (index, layero) {
            // alert("取消")
            layer.close(index); //如果设定了yes或者btn1回调，需进行手工关闭
        },
        btn2: function(index, layero){
            $.ajax({
                url:"/delArticle.do",
                type:"POST",
                data:{"aId":id},
                dataType:"json",
                async:false,
                cache:false, //不缓存此页面
                success:function(data){

                    if(data=="1"){
                        layer.msg('删除成功');
                        query1($("#criteria1").val(),curr,limit)
                        // paging();
                    }else {
                        layer.msg('删除失败');
                    }
                },
                error:function (XMLHttpRequest, textStatus, errorThrown) {
                    console.log(XMLHttpRequest.status);
                    console.log(XMLHttpRequest.readyState);
                    console.log(textStatus);
                }
            })

        }
    });

}

//删除选中
function delselect(){
    var check=$('input[name="checkbox[]"]:checked');
    if(check.length>0){
        layer.msg('您真的要批量删除吗？</br>删除不可逆！', {
            time: 20000, //20s后自动关闭
            anim:0, //窗体弹出的效果 0~6
            btn: ['点错了', '确认删除'],
            offset: [
                150 //高(y)
                ,600 //宽(x)
            ],
            btn1: function (index, layero) {
                // alert("取消")
                layer.close(index); //如果设定了yes或者btn1回调，需进行手工关闭
            },
            btn2: function(index, layero){
                check.each(function(){
                    $.ajax({
                        url:"/delArticle.do",
                        type:"POST",
                        data:{"aId":$(this).val()},
                        dataType:"json",
                        async:false,
                        cache:false, //不缓存此页面
                        success:function(data){
                            if(data=="1"){
                                layer.msg('删除成功');
                            }else {
                                layer.msg('删除失败');
                            }
                        },
                        error:function (XMLHttpRequest, textStatus, errorThrown) {
                            console.log(XMLHttpRequest.status);
                            console.log(XMLHttpRequest.readyState);
                            console.log(textStatus);
                        }
                    })
                });
                query1($("#criteria1").val(),curr,limit)
            }
        });

    }
}
paging();