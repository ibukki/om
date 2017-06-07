var vm = new Vue({
	el:"#content",
	methods:{
		goToOrderList:function(){
			location.href="morderlist.jsp";
		},
		createMOrder:function(){
			location.href="index.jsp";
		}
	}
});