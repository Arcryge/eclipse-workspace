var TT = DADA = {
	checkLogin : function(){
		var _ticket = $.cookie("DD_TOKEN");
		if(!_ticket){
			return ;
		}
		$.ajax({
			url : "http://localhost:8084/user/token/" + _ticket,
			dataType : "jsonp",
			type : "GET",
			success : function(data){
				if(data.status == 200){
					var username = data.data.username;
					/*var html = username + "，欢迎来到达达！<a href=\"http://www./user/logout.html\" class=\"link-logout\">[退出]</a>";*/
					var html = username + "，欢迎来到达达！";
					$("#loginbar").html(html);
				}
			}
		});
	}
}

$(function(){
	// 查看是否已经登录，如果已经登录查询登录信息
	TT.checkLogin();
});