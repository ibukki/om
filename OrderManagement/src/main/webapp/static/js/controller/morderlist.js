var viewData = {
	orders:[
		{id:"1", licenseNumber:"沪BPF980", inshopDate:"2017-01-01", amount:"1"},
		{id:"2", licenseNumber:"皖BH181L", inshopDate:"2017-05-01", amount: "100"}
	]
}

var vue = new Vue({
	el:"#content",
	data:viewData,
	methods:{
		backToHome: function(){
			location.href="home.jsp";
		}
	}
});

$("#startDatePicker").datetimepicker({
    locale: 'zh-CN',
    weekStart: 1,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	pickerPosition:"bottom-right",
	startView: 2,
	minView: 2,
	forceParse: 0,
	format:'yyyy-MM-dd',
}).on("changeDate",function(evt){
	
});

$("#endDatePicker").datetimepicker({
    locale: 'zh-CN',
    weekStart: 1,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	pickerPosition:"bottom-left",
	startView: 2,
	minView: 2,
	forceParse: 0,
	format:'yyyy-MM-dd'
}).on("changeDate",function(evt){
	
});