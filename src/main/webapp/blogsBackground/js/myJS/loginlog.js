
    function pagings(){
        layui.use(['laypage', 'layer'], function() {
            var laypage = layui.laypage
                , layer = layui.layer;
            //自定义首页、尾页、上一页、下一页文本
            laypage.render({
                elem: 'demo3'
                ,theme: '#1E9FFF' //自定义颜色
                ,count: $("#sum").val() //总记录数，从服务端得到
                ,layout: [ 'prev', 'page', 'next', 'limit'] //开启的功能
                ,limit: 10//每页显示记录数
                ,limits:[10, 20, 30]
                ,first: '首页'
                ,last: '末页'
                ,prev: '<em>«</em>'
                ,next: '<em>»</em>'
                ,jump: function(obj, first){//回调
                    //obj包含了当前分页的所有参数，比如：
                    // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                    // console.log(obj.limit); //得到每页显示的条数
                    //首次不执行
                    if(!first){
                        // do something
                        $.ajax({
                            type: 'post',
                            url:"/trackmod.do",
                            data: {"curr":obj.curr,"limit":obj.limit},
                            async:true,
                            datatype:"json",
                            resultType:"json",
                            cache:false, //不缓存此页面
                            success:function (data){
                                // console.log(data);
                                var lists= JSON.parse(data);
                                var vals='';
                                for (obj in lists){
                                    vals=vals+ "<tr> <td>"+lists[obj].logId+"</td> <td class='article-title'>"+lists[obj].administrator.uUserName+"</td> <td>"+lists[obj].logTime+"</td> <td>"+lists[obj].logIp+"</td> <td><a rel='1' onclick=\"ifDelete('"+lists[obj].administrator.UUserName+"',"+lists[obj].logId+")\" >删除</a></td> </tr>"
                                }
                                $("#tbl").html(vals);
                            }
                        });
                    }
                }
            });
        });
    }

    pagings();

    function ifDelete(name,id){
        layer.msg("o(╥﹏╥)o:您真的要删除<br>'"+name+"'吗?", {
            time: 20000, //20s后自动关闭
            anim: 0, //窗体弹出的效果 0~6
            btn: ['点错了','残忍删除'],
            offset: [
                '27%' //高(y)
                , '47%' //宽(x)
            ],
            btn1: function (index, layero) {
                // alert("取消")
                layer.close(index); //如果设定了yes或者btn1回调，需进行手工关闭
            },
            btn2: function (index, layero) {
                // alert("确认")
                $.ajax({
                    type: "post",
                    url: '/deleteLog.do',
                    datatype: "json",
                    data:{"id":id},
                    resultType: "json",
                    async: true,
                    cache:false, //不缓存此页面
                    success:function (data) {
                        var lists= JSON.parse(data).logs;
                        var vals='';
                        for (obj in lists){
                            vals=vals+ "<tr> <td>"+lists[obj].logId+"</td> <td class='article-title'>"+lists[obj].administrator.uUserName+"</td> <td>"+lists[obj].logTime+"</td> <td>"+lists[obj].logIp+"</td> <td><a rel='1' onclick=\"ifDelete('"+lists[obj].administrator.UUserName+"',"+lists[obj].logId+")\" >删除</a></td> </tr>"
                        }
                        $("#sum").val(JSON.parse(data).logSum);
                        $("#tbl").html(vals);
                        if (lists.length<1){
                            $("#tsData").html("<h2 style=\"text-align: center;\">没有相关数据....</h2>")
                            $("#demo3").hide()
                        }else{
                            $("#tsData").html("")
                            $("#demo3").show()
                        }
                        if(JSON.parse(data).refreshs==0)
                            pagings();//刷新分页
                    }
                });
            }
        });
    }

    function ifDeleteAll(name,id,tj){
        if (tj==1){
            name="'"+name+"'的所有记录吗?";
        } else{
            name="所有的记录吗?";
        }
        layer.msg("o(╥﹏╥)o:您真的要删除<br>"+name, {
            time: 20000, //20s后自动关闭
            anim: 0, //窗体弹出的效果 0~6
            btn: ['点错了','残忍删除'],
            offset: [
                '27%' //高(y)
                , '47%' //宽(x)
            ],
            btn1: function (index, layero) {
                // alert("取消")
                layer.close(index); //如果设定了yes或者btn1回调，需进行手工关闭
            },
            btn2: function (index, layero) {
                // alert("确认")
                $.ajax({
                    type: "post",
                    url: '/deleteLog.do',
                    datatype: "json",
                    data:{"id":id,"tj":tj},
                    resultType: "json",
                    async: true,
                    cache:false, //不缓存此页面
                    success:function (data) {
                        var lists= JSON.parse(data).logs;
                        var vals='';
                        for (obj in lists){
                            vals=vals+ "<tr> <td>"+lists[obj].logId+"</td> <td class='article-title'>"+lists[obj].administrator.uUserName+"</td> <td>"+lists[obj].logTime+"</td> <td>"+lists[obj].logIp+"</td> <td><a rel='1' onclick=\"ifDelete('"+lists[obj].administrator.UUserName+"',"+lists[obj].logId+")\" >删除</a></td> </tr>"
                        }

                        $("#sum").val(JSON.parse(data).logSum);
                        $("#tbl").html(vals);
                        if (lists.length<1){
                            $("#tsData").html("<h2 style=\"text-align: center;\">没有相关数据....</h2>")
                            $("#demo3").hide()
                        }else{
                            $("#tsData").html("")
                            $("#demo3").show()
                        }
                        if(JSON.parse(data).refreshs==0)
                            pagings();//刷新分页
                    }
                });
            }
        });
    }

