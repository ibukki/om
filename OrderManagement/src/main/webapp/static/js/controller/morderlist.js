$("#startDatePicker").datetimepicker({
    locale: 'zh-CN',
    weekStart: 1,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	pickerPosition:"bottom-left",
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